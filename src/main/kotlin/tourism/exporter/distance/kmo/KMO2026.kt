package tourism.exporter.distance.kmo

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val KMO_26_Pair_Short =
    Distance(
        name = "КМО св 28.03.25",
        orgeoEventId = "50861",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("м_М-Ж_4", "м_ЮНР-ЮНРК_4"), "Ж" to listOf("ж_М-Ж_4", "ж_ЮНР-ЮНРК_4")),
        points =
            listOf(
                RunPoint(101, 220),
                TechnicalPoint("Бревно", 102, failureCode = 105),
                RunPoint(111, 170),
                TechnicalPoint("Лка", 112, failureCode = 115),
                RunPoint(121, 150),
                TechnicalPoint("Спуск", 122, failureCode = 125),
                RunPoint(141, 160),
                TechnicalPoint("Дом", 142, failureCode = 145),
                RunPoint("FIN", length = 260, "000"),
            ),
    )

val KMO_26_Long_M =
    Distance(
        name = "КМО лч дл 29.03.25",
        orgeoEventId = "50860",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("м-М-Ж_4", "м-ЮНР-ЮНРК_4"), "Ж" to listOf("ж-М-Ж_4", "ж-ЮНР-ЮНРК_4")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Бревно", 102, failureCode = 105),
                RunPoint(48),
                RunPoint(33),
                RunPoint(31),
                RunPoint(111),
                TechnicalPoint("Лка", 112, failureCode = 115),
                RunPoint(36),
                RunPoint(34),
                RunPoint(39),
                RunPoint(43),
                RunPoint(121),
                TechnicalPoint("Спуск", 122, failureCode = 125),
                RunPoint(48),
                RunPoint(34),
                RunPoint(45),
                RunPoint(141),
                TechnicalPoint("Дом", 142, failureCode = 145),
                RunPoint(34),
                RunPoint(33),
                RunPoint("FIN", length = 6600, "000"),
            ),
    )
