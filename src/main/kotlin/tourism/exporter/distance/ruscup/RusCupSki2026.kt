package tourism.exporter.distance.ruscup

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val RusCup26Ski =
    Distance(
        name = "КР лыж лч кр 23.01.26",
        orgeoEventId = "48831",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("МУЖЧИНЫ"), "Ж" to listOf("ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(41),
                RunPoint(42, 650),
                TechnicalPoint("IIки", 31, failureCode = 131),
                RunPoint(41),
                RunPoint(42, 700),
                TechnicalPoint("Дом", 32, failureCode = 232),
                RunPoint(41),
                RunPoint(42, 800),
                TechnicalPoint("Навеска", 34, failureCode = 234),
                RunPoint(41),
                RunPoint(42),
                RunPoint("FIN", length = 650, "000"),
            ),
    )

val RusCup26SkiLong =
    Distance(
        name = "КР лыж лч дл 24.01.26",
        orgeoEventId = "48831",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("МУЖЧИНЫ"), "Ж" to listOf("ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(41),
                RunPoint(42, 1750),
                TechnicalPoint("IIки", 31, failureCode = 131),
                RunPoint(41),
                RunPoint(42, 1800),
                TechnicalPoint("Маятник", 32, failureCode = 232),
                RunPoint(41),
                RunPoint(42, 1900),
                TechnicalPoint("Дом", 33, failureCode = 233),
                RunPoint(41),
                RunPoint(42, 1950),
                TechnicalPoint("Навеска", 34, failureCode = 234),
                RunPoint(41),
                RunPoint(42),
                RunPoint("FIN", length = 1900, "000"),
            ),
    )

val RusCup26SkiPair =
    Distance(
        name = "КР лыж св 25.01.26",
        orgeoEventId = "48831",
        orgeoSubId = "5",
        orgeoCategories = listOf("М" to listOf("5_МУЖЧИНЫ"), "Ж" to listOf("5_ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(41),
                RunPoint(42, 1750),
                TechnicalPoint("IIки", 31, failureCode = 131),
                RunPoint(41),
                RunPoint(42, 1800),
                TechnicalPoint("Маятник", 32, failureCode = 232),
                RunPoint(41),
                RunPoint(42, 1900),
                TechnicalPoint("Дом", 33, failureCode = 233),
                RunPoint(41),
                RunPoint(42, 1950),
                TechnicalPoint("Навеска", 34, failureCode = 234),
                RunPoint(41),
                RunPoint(42),
                RunPoint("FIN", length = 1900, "000"),
            ),
    )

val RusCup26Ski4 =
    Distance(
        name = "КР лыж лч кр 23.01.26",
        orgeoEventId = "48831",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("ЮНИОРЫ"), "Ж" to listOf("ЮНИОРКИ")),
        points =
            listOf(
                RunPoint(41),
                RunPoint(42, 650),
                TechnicalPoint("Навеска", 31, failureCode = 131),
                RunPoint(41),
                RunPoint(42, 700),
                TechnicalPoint("Лка", 32, failureCode = 232),
                RunPoint(41),
                RunPoint(42, 800),
                TechnicalPoint("IIки", 34, failureCode = 234),
                RunPoint(41),
                RunPoint(42),
                RunPoint("FIN", length = 650, "000"),
            ),
    )

val RusCup26SkiLong4 =
    Distance(
        name = "КР лыж лч дл 24.01.26",
        orgeoEventId = "48831",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("ЮНИОРЫ"), "Ж" to listOf("ЮНИОРКИ")),
        points =
            listOf(
                RunPoint(41),
                RunPoint(42, 1750),
                TechnicalPoint("IIки", 31, failureCode = 131),
                RunPoint(41),
                RunPoint(42, 1800),
                TechnicalPoint("Лка", 32, failureCode = 232),
                RunPoint(41),
                RunPoint(42, 1900),
                TechnicalPoint("Навеска", 33, failureCode = 233),
                RunPoint(41),
                RunPoint(42),
                RunPoint("FIN", length = 1800, "000"),
            ),
    )

val RusCup26SkiPair4 =
    Distance(
        name = "КР лыж св 25.01.26",
        orgeoEventId = "48831",
        orgeoSubId = "5",
        orgeoCategories = listOf("М" to listOf("4_ЮНИОРЫ"), "Ж" to listOf("4_ЮНИОРКИ")),
        points =
            listOf(
                RunPoint(41),
                RunPoint(42, 1750),
                TechnicalPoint("Навеска", 31, failureCode = 131),
                RunPoint(41),
                RunPoint(42, 1800),
                TechnicalPoint("Лка", 32, failureCode = 232),
                RunPoint(41),
                RunPoint(42, 1900),
                TechnicalPoint("IIки", 34, failureCode = 234),
                RunPoint(41),
                RunPoint(42),
                RunPoint("FIN", length = 1800, "000"),
            ),
    )
