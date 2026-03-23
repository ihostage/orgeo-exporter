package tourism.exporter

import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

// [HH:]MM:SS
fun parseDuration(value: String): Duration =
    value.split(":").map { it.toInt() }.run {
        if (this.size == 3) {
            get(0).hours.plus(get(1).minutes).plus(get(2).seconds)
        } else if (this.size == 2) {
            get(0).minutes.plus(get(1).seconds)
        } else {
            throw IllegalArgumentException("Cannot parse duration $value")
        }
    }

val Int.colName: String
    get() {
        var column = this
        var letter = ""
        while (column > 0) {
            val temp = (column - 1) % 26
            letter = (temp + 65).toChar() + letter
            column = (column - temp - 1) / 26
        }
        return letter
    }
