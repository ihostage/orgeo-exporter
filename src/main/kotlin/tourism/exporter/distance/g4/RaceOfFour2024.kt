package tourism.exporter.distance.g4

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val G4_24_5M =
    Distance(
        name = "Г4 5кл М 19.10.24",
        orgeoEventId = "37943",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("5_МУЖЧИНЫ")),
        points =
        listOf(
            RunPoint(39),
            RunPoint(38),
            RunPoint(41),
            RunPoint(110),
            TechnicalPoint("IIки", 170, failureCode = 210),
            RunPoint(80),
            RunPoint(82),
            RunPoint(110),
            TechnicalPoint("IIки", 170, failureCode = 210),
            RunPoint(40),
            RunPoint(35),
            RunPoint(36),
            RunPoint(111),
            TechnicalPoint("Лка", 171, failureCode = 211),
            RunPoint(83),
            RunPoint(74),
            RunPoint(112),
            TechnicalPoint("Дом", 172, failureCode = 212),
            RunPoint(44),
            RunPoint(43),
            RunPoint(77),
            RunPoint(106),
            TechnicalPoint("Склон", 166, failureCode = 206),
            RunPoint(107),
            TechnicalPoint("Подъём", 167, failureCode = 207),
            RunPoint(42),
            RunPoint(112),
            TechnicalPoint("Дом", 172, failureCode = 212),
            RunPoint(87),
            RunPoint(-1, length = 13750, "000"),
        ),
    )

val G4_24_5W =
    Distance(
        name = "Г4 5кл Ж 19.10.24",
        orgeoEventId = "37943",
        orgeoSubId = "1",
        orgeoCategories = listOf("Ж" to listOf("5_ЖЕНЩИНЫ")),
        points =
        listOf(
            RunPoint(84),
            RunPoint(71),
            RunPoint(110),
            TechnicalPoint("IIки", 170, failureCode = 210),
            RunPoint(39),
            RunPoint(38),
            RunPoint(82),
            RunPoint(110),
            TechnicalPoint("IIки", 170, failureCode = 210),
            RunPoint(111),
            TechnicalPoint("Лка", 171, failureCode = 211),
            RunPoint(36),
            RunPoint(112),
            TechnicalPoint("Дом", 172, failureCode = 212),
            RunPoint(73),
            RunPoint(106),
            TechnicalPoint("Склон", 166, failureCode = 206),
            RunPoint(107),
            TechnicalPoint("Подъём", 167, failureCode = 207),
            RunPoint(42),
            RunPoint(112),
            TechnicalPoint("Дом", 172, failureCode = 212),
            RunPoint(87),
            RunPoint(-1, length = 10270, "000"),
        ),
    )

val G4_24_4M =
    Distance(
        name = "Г4 4кл М 20.10.24",
        orgeoEventId = "37943",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("4_МУЖЧИНЫ")),
        points =
            listOf(
                TechnicalPoint("Лка", 172, failureCode = 192),
                RunPoint(listOf(84, 72).map { it.toString() }),
                RunPoint(71),
                RunPoint(110),
                TechnicalPoint("IIки", 170, failureCode = 190),
                RunPoint(52),
                RunPoint(86),
                RunPoint(listOf(78, 53).map { it.toString() }),
                RunPoint(112),
                TechnicalPoint("Дом", 172, failureCode = 192),
                RunPoint(listOf(84, 72).map { it.toString() }),
                RunPoint(71),
                RunPoint(51),
                RunPoint(111),
                TechnicalPoint("Б.Лка", 171, failureCode = 191),
                RunPoint(86),
                RunPoint(listOf(78, 53).map { it.toString() }),
                RunPoint(112),
                TechnicalPoint("Дом", 172, failureCode = 192),
                RunPoint(87),
                RunPoint(-1, length = 10000, "000"),
            ),
    )

val G4_24_4W =
    Distance(
        name = "Г4 4кл Ж 20.10.24",
        orgeoEventId = "37943",
        orgeoSubId = "2",
        orgeoCategories = listOf("Ж" to listOf("4_ЖЕНЩИНЫ")),
        points =
        listOf(
            TechnicalPoint("Лка", 172, failureCode = 192),
            RunPoint(listOf(86, 76).map { it.toString() }),
            RunPoint(52),
            RunPoint(80),
            RunPoint(110),
            TechnicalPoint("IIки", 170, failureCode = 190),
            RunPoint(74),
            RunPoint(112),
            TechnicalPoint("Дом", 172, failureCode = 192),
            RunPoint(listOf(86, 76).map { it.toString() }),
            RunPoint(52),
            RunPoint(51),
            RunPoint(111),
            TechnicalPoint("Б.Лка", 171, failureCode = 191),
            RunPoint(53),
            RunPoint(112),
            TechnicalPoint("Дом", 172, failureCode = 192),
            RunPoint(87),
            RunPoint(-1, length = 8700, "000"),
        ),
    )
