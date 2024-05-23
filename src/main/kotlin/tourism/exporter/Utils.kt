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
    // get() {
    //     val colRef = StringBuilder(2)
    //     var colRemain = this
    //
    //     while(colRemain > 0) {
    //         var thisPart = colRemain % 26
    //         if (thisPart == 0) {
    //             thisPart = 26
    //         }
    //         colRemain = (colRemain - thisPart) / 26;
    //
    //         // The letter A is at 65
    //         colRef.insert(0, (thisPart + 64).toChar())
    //     }
    //     return colRef.toString();
    // }
