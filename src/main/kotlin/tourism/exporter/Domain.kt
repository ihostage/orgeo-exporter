package tourism.exporter

import kotlin.time.Duration

sealed interface DistancePoint {
    val name: String

    fun hasCode(code: String): Boolean
}

data class RunPoint(
    val codes: List<String>,
    val length: Int = 0,
    override val name: String = codes.toString(),
) : DistancePoint {
    constructor(code: Int, length: Int = 0, name: String = code.toString()) : this(listOf(code.toString()), length, name)
    constructor(code: String, length: Int = 0, name: String = code) : this(listOf(code), length, name)

    override fun hasCode(code: String): Boolean = this.codes.contains(code)
}

data class TechnicalPoint(
    override val name: String,
    val successCode: Int,
    val failureCode: Int = -1,
) : DistancePoint {
    override fun hasCode(code: String): Boolean = code == successCode.toString() || failureCode.toString() == code
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
    val isSuccessFinish: Boolean
) {
    val isGoodSplit: Boolean
        get() = split.all { it.time.isPositive() }
}

data class Result(
    val name: String,
    val players: List<Player>,
) {
    val countSuccessFinish: Int
        get() = players.count { it.isSuccessFinish }

    fun minimalGoodSplitValue(point: Int): Duration =
        players.filter { it.isSuccessFinish }.map { it.split[point].time }.filter { it.isPositive() }.min()
}
