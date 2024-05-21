package tourism.exporter

import tourism.exporter.orgeo.OrgeoResponse
import tourism.exporter.orgeo.Tourist
import kotlin.time.Duration
import kotlin.time.DurationUnit.MILLISECONDS
import kotlin.time.toDuration

object Calculator {
    fun processOrgeoData(
        name: String,
        data: OrgeoResponse,
        distance: Distance,
    ): Result {
        return Result(
            name,
            data.participants.sortedBy { if (it.place > 0) it.place else Int.MAX_VALUE }.map { p ->
                Player(
                    p.place,
                    p.name,
                    normalizeTeamName(p.team),
                    p.finishDuration,
                    parseSplit(p, distance),
                )
            },
        )
    }

    private fun parseSplit(
        tourist: Tourist,
        distance: Distance,
    ): List<DistancePointResult> {
        var splitIndex = 0
        val split =
            distance.points.subList(0, distance.points.size - 1).map { point ->
                var duration = Duration.ZERO
                while (splitIndex < tourist.parsedSplit.size && point.hasCode(tourist.parsedSplit[splitIndex].first)) {
                    duration = duration.plus(tourist.parsedSplit[splitIndex].second)
                    splitIndex++
                }
                DistancePointResult(point, duration)
            }
        val finish: Duration = tourist.finishDuration.minus(split.sumOf { it.time.inWholeMilliseconds }.toDuration(MILLISECONDS))
        return split.plus(DistancePointResult(distance.points.last(), finish))
    }

    private fun normalizeTeamName(team: String): String = team.replace("Сборная", "Сб.")
}
