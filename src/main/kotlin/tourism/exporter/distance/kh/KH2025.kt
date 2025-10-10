package tourism.exporter.distance.kh

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val KH25Short =
    Distance(
        name = "КХ лч 03.10.25",
        orgeoEventId = "45478",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("5-мужчины"), "Ж" to listOf("5-женщины")),
        points =
            listOf(
                RunPoint(61, 380),
                TechnicalPoint("Дом", 71, failureCode = 101),
                RunPoint(62, 370),
                TechnicalPoint("IIки", 72, failureCode = 102),
                RunPoint(63, 540),
                TechnicalPoint("Спуск", 73, failureCode = 103),
                RunPoint(64, 50),
                TechnicalPoint("Подъём", 74, failureCode = 104),
                RunPoint(65, 580),
                TechnicalPoint("Навеска", 75, failureCode = 105),
                RunPoint(61, 400),
                TechnicalPoint("Дом 2", 71, failureCode = 101),
                RunPoint(-1, length = 90, "000"),
            ),
    )

val KH25PairM =
    Distance(
        name = "КХ св М 04.10.25",
        orgeoEventId = "45478",
        orgeoSubId = "5",
        orgeoCategories = listOf("М" to listOf("5_мужчины")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(32),
                RunPoint(33),
                RunPoint(34),
                RunPoint(67),
                TechnicalPoint("Маятник", 77, failureCode = 107),
                RunPoint(35),
                RunPoint(68),
                TechnicalPoint("Навеска", 78, failureCode = 108),
                RunPoint(36),
                RunPoint(37),
                RunPoint(38),
                RunPoint(66),
                TechnicalPoint("Спуск", 76, failureCode = 106),
                RunPoint(61),
                TechnicalPoint("Дом", 71, failureCode = 101),
                RunPoint(62),
                TechnicalPoint("IIки", 72, failureCode = 102),
                RunPoint(39),
                RunPoint(40),
                RunPoint(41),
                RunPoint(45),
                RunPoint(42),
                RunPoint(63),
                TechnicalPoint("Спуск 2", 73, failureCode = 103),
                RunPoint(64),
                TechnicalPoint("Подъём", 74, failureCode = 104),
                RunPoint(43),
                RunPoint(61),
                TechnicalPoint("Дом 2", 71, failureCode = 101),
                RunPoint(-1, length = 8600, "000"),
            ),
    )

val KH25PairW =
    Distance(
        name = "КХ св Ж 04.10.25",
        orgeoEventId = "45478",
        orgeoSubId = "5",
        orgeoCategories = listOf("Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(38),
                RunPoint(34),
                RunPoint(67),
                TechnicalPoint("Маятник", 77, failureCode = 107),
                RunPoint(35),
                RunPoint(68),
                TechnicalPoint("Навеска", 78, failureCode = 108),
                RunPoint(36),
                RunPoint(44),
                RunPoint(66),
                TechnicalPoint("Спуск", 76, failureCode = 106),
                RunPoint(61),
                TechnicalPoint("Дом", 71, failureCode = 101),
                RunPoint(62),
                TechnicalPoint("IIки", 72, failureCode = 102),
                RunPoint(32),
                RunPoint(45),
                RunPoint(63),
                TechnicalPoint("Спуск 2", 73, failureCode = 103),
                RunPoint(64),
                TechnicalPoint("Подъём", 74, failureCode = 104),
                RunPoint(43),
                RunPoint(61),
                TechnicalPoint("Дом 2", 71, failureCode = 101),
                RunPoint(-1, length = 6700, "000"),
            ),
    )

val KH25Group =
    Distance(
        name = "КХ гр 05.10.25",
        orgeoEventId = "45478",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to listOf("5-мужчины"), "Ж" to listOf("5-женщины")),
        points =
            listOf(
                RunPoint(61, 380),
                TechnicalPoint("Дом", 71, failureCode = 101),
                RunPoint(62, 370),
                TechnicalPoint("IIки", 72, failureCode = 102),
                RunPoint(63, 540),
                TechnicalPoint("Спуск", 73, failureCode = 103),
                RunPoint(64, 50),
                TechnicalPoint("Подъём", 74, failureCode = 104),
                RunPoint(65, 580),
                TechnicalPoint("Навеска", 75, failureCode = 105),
                RunPoint(61, 400),
                TechnicalPoint("Дом 2", 71, failureCode = 101),
                RunPoint(-1, length = 90, "000"),
            ),
    )
