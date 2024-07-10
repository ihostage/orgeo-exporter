package tourism.exporter

import kotlin.time.Duration

sealed interface DistancePoint {
    val name: String

    fun hasCode(code: Int): Boolean
}

data class RunPoint(
    val code: Int,
    val length: Int = 0,
    override val name: String = code.toString(),
) : DistancePoint {
    override fun hasCode(code: Int): Boolean = this.code == code
}

data class TechnicalPoint(
    override val name: String,
    val successCode: Int,
    val failureCode: Int = -1,
) : DistancePoint {
    override fun hasCode(code: Int): Boolean = code == successCode || failureCode == code
}

data class Distance(
    val name: String,
    val orgeoEventId: String,
    val orgeoSubId: String,
    val orgeoCategories: List<Pair<String, List<String>>>,
    val points: List<DistancePoint>,
    val fixesSplit: List<Pair<String, String>> = listOf(),
) {
    val technicalIndexes: List<Int> =
        points
            .mapIndexed { index, distancePoint -> Pair(index, distancePoint) }
            .filter { it.second is TechnicalPoint }
            .map { it.first }

    val runIndexes: List<Int> =
        points
            .mapIndexed { index, distancePoint -> Pair(index, distancePoint) }
            .filter { it.second is RunPoint }
            .map { it.first }
}

data class DistancePointResult(
    val point: DistancePoint,
    val time: Duration,
)

data class Player(
    val place: Int,
    val name: String,
    val team: String,
    val result: Duration,
    val split: List<DistancePointResult>,
) {
    val isSuccessFinish: Boolean
        get() = place > 0 && split.all { it.time != Duration.ZERO }
}

data class Result(
    val name: String,
    val players: List<Player>,
) {
    val countSuccessFinish: Int
        get() = players.count { it.isSuccessFinish }
}
