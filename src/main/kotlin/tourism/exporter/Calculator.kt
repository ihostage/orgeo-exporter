package tourism.exporter

import tourism.exporter.orgeo.OrgeoResponse
import tourism.exporter.sportorg.SportOrgParser
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.DurationUnit.MILLISECONDS
import kotlin.time.toDuration

object Calculator {

    fun processSportOrgData(
        name: String,
        groupNames: List<String>,
        distance: Distance,
    ): Result {
        val data = SportOrgParser.parse(distance.sportOrgFilePath!!).races[0]
        val groups = data.groups.filter { groupNames.contains(it.name) }
        val persons = data.persons.filter { person -> groups.any { it.id == person.groupId } }
        val results = data.results.filter { result -> persons.any { it.id == result.personId } }
        val players: List<Player> = results.map { result ->
            val person = persons.find { it.id == result.personId }!!
            val finishDuration = (result.finishTime - result.startTime).milliseconds
            Player(
                place = result.place!!,
                name = "${person.surname} ${person.name}",
                team = normalizeTeamName(data.organizations.find { it.id == person.organizationId }!!.name),
                result = finishDuration,
                split = parseSplit(result.splits.map { it.code to it.legTime.milliseconds }, finishDuration, distance),
                isSuccessFinish = result.status == 1
            )
        }.sortedBy { if (it.isSuccessFinish) it.result else Duration.INFINITE }
        return Result(
            name,
            players
        )
    }

    fun processOrgeoData(
        name: String,
        data: List<OrgeoResponse>,
        distance: Distance,
    ): Result =
        Result(
            name,
            fixData(data, distance)
                .flatMap { it.participants }
                .filter { it.isStarted && it.hasSplit }
                .map { p ->
                    Player(
                        p.place,
                        p.name,
                        normalizeTeamName(p.team),
                        p.finishDuration,
                        parseSplit(p.parsedSplit, p.finishDuration, distance),
                        p.isStarted && !p.isRemoved
                    )
                }.sortedBy { if (it.isSuccessFinish) it.result else Duration.INFINITE },
        )

    internal fun parseSplit(
        parsedSplit: List<Pair<String, Duration>>,
        finishDuration: Duration,
        distance: Distance,
    ): List<DistancePointResult> {
        var splitIndex = 0
        val split =
            distance.points.filter { !it.hasCode("-1") }.map { point ->
                var duration = Duration.ZERO
                // Если отметка есть в сплите, суммируем время всех других отметок до неё
                if (parsedSplit.subList(splitIndex, parsedSplit.size).any { point.hasCode(it.first) }) {
                    while (!point.hasCode(parsedSplit[splitIndex].first)) {
                        duration = duration.plus(parsedSplit[splitIndex].second)
                        splitIndex++
                    }
                }
                // Суммируем время для последовательных повторных отметок в сплите
                while (splitIndex < parsedSplit.size && point.hasCode(parsedSplit[splitIndex].first)) {
                    duration = duration.plus(parsedSplit[splitIndex].second)
                    splitIndex++
                }
                DistancePointResult(point, duration)
            }
        if (split.size == distance.points.size) {
            return split
        }
        val finish: Duration = finishDuration.minus(split.sumOf { it.time.inWholeMilliseconds }.toDuration(MILLISECONDS))
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
                        participant.split =
                            result.groupValues[1] + result.groupValues[4] + result.groupValues[3] + result.groupValues[2] + result.groupValues[5]
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
