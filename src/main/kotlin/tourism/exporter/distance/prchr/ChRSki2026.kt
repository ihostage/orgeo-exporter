package tourism.exporter.distance.prchr

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val ChR26Ski =
    Distance(
        name = "ЧР лыж лч кр кв 12.03.26",
        orgeoEventId = "50231",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("Мужчины"), "Ж" to listOf("Женщины")),
        points =
            listOf(
                RunPoint(71),
                RunPoint(61, 1200),
                TechnicalPoint("IIки", 71, failureCode = 171),
                RunPoint(61, 1150),
                TechnicalPoint("Дом", 71, failureCode = 171),
                RunPoint(61, 1250),
                TechnicalPoint("Навеска", 71, failureCode = 171),
                RunPoint("FIN", length = 950, "000"),
            ),
    )

val ChR26SkiLong =
    Distance(
        name = "ЧР лыж лч дл 13.03.26",
        orgeoEventId = "50231",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("МУЖЧИНЫ"), "Ж" to listOf("ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(71),
                RunPoint(99),
                RunPoint(61, 2000),
                TechnicalPoint("IIки", 71, failureCode = 171),
                RunPoint(99),
                RunPoint(61, 2200),
                TechnicalPoint("Дом1", 71, failureCode = 171),
                RunPoint(99),
                RunPoint(61, 2200),
                TechnicalPoint("Дом2", 71, failureCode = 171),
                RunPoint(99),
                RunPoint(61, 2200),
                TechnicalPoint("Навеска", 71, failureCode = 171),
                RunPoint(99),
                RunPoint("FIN", length = 1900, "000"),
            ),
    )

val ChR26SkiPair =
    Distance(
        name = "ЧР лыж св 14.03.26",
        orgeoEventId = "50231",
        orgeoSubId = "4",
        categories = listOf("М" to listOf("Мужчины"), "Ж" to listOf("Женщины")),
        points =
            listOf(
                RunPoint(71),
                RunPoint(99),
                RunPoint(61, 2000),
                TechnicalPoint("IIки", 71, failureCode = 171),
                RunPoint(99),
                RunPoint(61, 2200),
                TechnicalPoint("Дом1", 71, failureCode = 171),
                RunPoint(99),
                RunPoint(61, 2200),
                TechnicalPoint("Дом2", 71, failureCode = 171),
                RunPoint(99),
                RunPoint(61, 2200),
                TechnicalPoint("Навеска", 71, failureCode = 171),
                RunPoint(99),
                RunPoint(-1, length = 1900, "000"),
            ),
    )
