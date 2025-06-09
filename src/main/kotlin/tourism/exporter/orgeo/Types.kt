package tourism.exporter.orgeo

import com.fasterxml.jackson.annotation.JsonProperty
import tourism.exporter.parseDuration
import java.util.LinkedList
import kotlin.time.Duration

data class OrgeoResponse(
    @JsonProperty("event_id")
    val eventId: String,
    @JsonProperty("sub_id")
    val subId: String,
    val dist: String,
    @JsonProperty("finish")
    val participants: MutableList<Tourist>,
)

data class Tourist(
    val place: Int,
    val name: String,
    val team: String,
    val finish: String = "00:00:00",
    @JsonProperty("finish_ms")
    val finishMS: String,
    @JsonProperty("spl")
    var split: String,
    @JsonProperty("otm")
    val state: String?,
) {
    val finishDuration: Duration = parseDuration(finish)

    val parsedSplit: List<Pair<String, Duration>>
        get() =
            mutableListOf<Pair<String, Duration>>().apply {
                val splitQueue = LinkedList(split.split("|"))
                while (splitQueue.size > 1) {
                    try {
                        val duration = parseDuration(splitQueue.poll())
                        val code = splitQueue.poll()
                        add(Pair(code, duration))
                    } catch (_: NumberFormatException) {
                    } catch (_: IndexOutOfBoundsException) {
                    }
                }
            }

    val isStarted: Boolean = state != "8"
    val isRemoved: Boolean = listOf(
        "1", // снят
        "7", // сошел
        "21", // неправильная отметка
    ).contains(state)
}
