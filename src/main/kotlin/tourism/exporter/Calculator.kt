package tourism.exporter

import tourism.exporter.orgeo.OrgeoResponse
import tourism.exporter.orgeo.Tourist
import kotlin.time.Duration
import kotlin.time.DurationUnit.MILLISECONDS
import kotlin.time.toDuration

object Calculator {
    fun processOrgeoData(
        name: String,
        data: List<OrgeoResponse>,
        distance: Distance,
    ): Result =
        Result(
            name,
            fixData(data, distance)
                .flatMap { it.participants }
                .filter { it.isStarted }
                .map { p ->
                    Player(
                        p.place,
                        p.name,
                        normalizeTeamName(p.team),
                        p.finishDuration,
                        parseSplit(p, distance),
                        p.isStarted && !p.isRemoved
                    )
                }.sortedBy { if (it.isSuccessFinish) it.result else Duration.INFINITE },
        )

    private fun parseSplit(
        tourist: Tourist,
        distance: Distance,
    ): List<DistancePointResult> {
        var splitIndex = 0
        val split =
            distance.points.filter { !it.hasCode("-1") }.map { point ->
                var duration = Duration.ZERO
                while (splitIndex < tourist.parsedSplit.size && point.hasCode(tourist.parsedSplit[splitIndex].first)) {
                    duration = duration.plus(tourist.parsedSplit[splitIndex].second)
                    splitIndex++
                }
                DistancePointResult(point, duration)
            }
        if (split.size == distance.points.size) {
            return split
        }
        val finish: Duration = tourist.finishDuration.minus(split.sumOf { it.time.inWholeMilliseconds }.toDuration(MILLISECONDS))
        return split.plus(DistancePointResult(distance.points.last(), finish))
    }

    private fun normalizeTeamName(team: String): String = team.replace("Сборная", "Сб.")

    /**
     * Обработать рассев
     */
    private fun processSeeding(
        data: List<OrgeoResponse>,
        distance: Distance,
    ): List<OrgeoResponse> {
        data.forEach { response ->
            distance.seeding.forEach { seeding ->
                val seedFromGroup = seeding.first.joinToString("\\|[^|]*\\|", prefix = "(\\|[^|]*\\|", postfix = ")")
                val seedToGroup = seeding.second.joinToString("\\|[^|]*\\|", prefix = "(\\|[^|]*\\|", postfix = ")")
                response.participants.forEach { participant ->
                    val seedRegex = """(.*)${seedFromGroup}(.*)${seedToGroup}(.*)""".toRegex()
                    val result = seedRegex.find(participant.split)
                    if (result != null) {
                        participant.split = result.groupValues[1] + result.groupValues[4] + result.groupValues[3] + result.groupValues[2] + result.groupValues[5]
                    }
                }
            }
        }
        return data
    }

    private fun fixData(
        data: List<OrgeoResponse>,
        distance: Distance,
    ): List<OrgeoResponse> {
        data.forEach { response ->
            distance.fixesSplit.forEach { fix ->
                response.participants.find { it.name == fix.first }?.split = fix.second
            }
        }
        return processSeeding(data, distance)
    }
}
