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
    val participants: List<Tourist>,
)

data class Tourist(
    val place: Int,
    val name: String,
    val team: String,
    val finish: String,
    @JsonProperty("finish_ms")
    val finishMS: String,
    @JsonProperty("spl")
    val split: String,
    @JsonProperty("otm")
    val state: String
) {
    val finishDuration: Duration = parseDuration(finish)

    val parsedSplit: List<Pair<Int, Duration>> =
        mutableListOf<Pair<Int, Duration>>().apply {
            val splitQueue = LinkedList(split.split("|"))
            while (splitQueue.size > 1) {
                val duration = parseDuration(splitQueue.poll())
                val code = splitQueue.poll().toInt()
                add(Pair(code, duration))
            }
        }

    val isStarted: Boolean = state != "8"
}
