package tourism.exporter.distance.chmo

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val ChMO_26_Ski =
    Distance(
        name = "ЧМО лыж лч 07.02.26",
        sportOrgFilePath = "data/chmo_26_ski.json",
        categories = listOf("М" to listOf("м-М-Ж_4", "м-ЮНР-ЮНРК_4"), "Ж" to listOf("ж-М-Ж_4", "ж-ЮНР-ЮНРК_4")),
        points =
            listOf(
                RunPoint(101, 2000),
                TechnicalPoint("Лка", 102, failureCode = 105),
                RunPoint(103, 900),
                TechnicalPoint("Навеска", 102, failureCode = 105),
                RunPoint(111, 1050),
                TechnicalPoint("Бревно", 112, failureCode = 115),
                RunPoint(-1, length = 2250, "000"),
            ),
    )

val ChMO_26_Ski_Pair =
    Distance(
        name = "ЧМО лыж св 08.02.26",
        sportOrgFilePath = "data/chmo_26_ski_pair.json",
        categories = listOf("М" to listOf("м_М-Ж_4", "м_ЮНР-ЮНРК_4"), "Ж" to listOf("ж_М-Ж_4", "ж_ЮНР-ЮНРК_4")),
        points =
            listOf(
                RunPoint(101, 2000),
                TechnicalPoint("Лка", 102, failureCode = 105),
                RunPoint(103, 900),
                TechnicalPoint("Навеска", 102, failureCode = 105),
                RunPoint(111, 1050),
                TechnicalPoint("Бревно", 112, failureCode = 115),
                RunPoint(-1, length = 2250, "000"),
            ),
    )
