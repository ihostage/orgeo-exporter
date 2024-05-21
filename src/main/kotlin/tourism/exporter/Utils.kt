package tourism.exporter

import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

// HH:MM:SS
fun parseDuration(value: String): Duration =
    value.split(":").map { it.toInt() }.run {
        get(0).hours.plus(get(1).minutes).plus(get(2).seconds)
    }

val Int.colName: String
    get() = ('A' + this - 1).toString()
