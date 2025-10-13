package tourism.exporter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import tourism.exporter.distance.kmo.KMO_25_S4_Long_3
import tourism.exporter.orgeo.Tourist
import kotlin.time.Duration

class CalculatorTest {

    @Test
    fun check1() {
        val t = Tourist(
            place = 1,
            name = "",
            team = "",
            finish = "01:38:42",
            finishMS = "",
            split = "00:00:55|131|00:04:30|101|00:07:18|102|00:04:56|48|00:00:03|48|00:07:27|40|00:05:07|33|00:08:35|112|00:00:35|121|00:02:34|122|00:09:32|46|00:00:07|46|00:11:27|47|00:05:29|38|00:05:51|141|00:01:43|142|00:05:33|42|00:11:07|41|00:02:44|131|00:02:16|132|",
            state = ""
        )
        val split = Calculator.parseSplit(t, KMO_25_S4_Long_3)
        assertThat(split.map { it.time }).containsExactly(
            Duration.parse("5m 25s"),
            Duration.parse("7m 18s"),
            Duration.parse("4m 59s"),
            Duration.parse("7m 27s"),
            Duration.parse("5m 7s"),
            Duration.parse("0s"),
            Duration.parse("8m 35s"),
            Duration.parse("35s"),
            Duration.parse("2m 34s"),
            Duration.parse("9m 39s"),
            Duration.parse("11m 27s"),
            Duration.parse("5m 29s"),
            Duration.parse("5m 51s"),
            Duration.parse("1m 43s"),
            Duration.parse("5m 33s"),
            Duration.parse("11m 7s"),
            Duration.parse("2m 44s"),
            Duration.parse("2m 16s"),
            Duration.parse("53s")
        )
    }
}
