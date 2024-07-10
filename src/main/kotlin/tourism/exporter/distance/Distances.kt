package tourism.exporter.distance

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val Elec2024Short =
    Distance(
        name = "ВС5 лич кор 08.05.24",
        orgeoEventId = "34974",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                TechnicalPoint("ВСС", 61, failureCode = 161),
                TechnicalPoint("П+Бревно", 62, failureCode = 162),
                TechnicalPoint("П+IIки", 63, failureCode = 163),
                TechnicalPoint("П+Дом1", 64, failureCode = 164),
                RunPoint(201, 300),
                TechnicalPoint("П+Спуск", 65, failureCode = 165),
                TechnicalPoint("П+Дом2", 66, failureCode = 166),
                TechnicalPoint("П+Дом2+Ф", -1),
            ),
    )

val Elec2024Sprint =
    Distance(
        name = "ВС5 лич спр 09.05.24",
        orgeoEventId = "34974",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                TechnicalPoint("ВСС", 61, failureCode = 161),
                TechnicalPoint("П+Бревно", 62, failureCode = 162),
                TechnicalPoint("П+IIки", 63, failureCode = 163),
                TechnicalPoint("П+Дом1", 64, failureCode = 164),
                TechnicalPoint("П+Спуск", 65, failureCode = 165),
                TechnicalPoint("П+Подъём", 66, failureCode = 166),
                TechnicalPoint("П+Дом2", 67, failureCode = 166),
                RunPoint(-1, length = 100, "000"),
            ),
    )

val CHiPMO2024Pair =
    Distance(
        name = "ЧМО св кор 25.05.24",
        orgeoEventId = "35750",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("МУЖЧИНЫ_4", "ЮНИОРЫ_4"), "Ж" to listOf("ЖЕНЩИНЫ_4", "ЮНИОРКИ_4")),
        points =
            listOf(
                RunPoint(101, length = 180),
                TechnicalPoint("IIки", 102, failureCode = 115),
                RunPoint(131, length = 730),
                TechnicalPoint("Дом", 132, failureCode = 135),
                RunPoint(121, length = 720),
                TechnicalPoint("Спуск", 122, failureCode = 125),
                TechnicalPoint("Подъём", 123, failureCode = 125),
                RunPoint(111, length = 780),
                TechnicalPoint("Лка", 112, failureCode = 115),
                RunPoint(141, length = 170),
                TechnicalPoint("Бревно", 142, failureCode = 145),
                RunPoint(-1, length = 570),
            ),
    )

val CHiPMO2024LongM =
    Distance(
        name = "ЧМО лич дл М 26.05.24",
        orgeoEventId = "35750",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to listOf("Мужчины 4 класс", "Юниоры 4 класс")),
        points =
            listOf(
                RunPoint(40),
                RunPoint(39),
                RunPoint(111),
                TechnicalPoint(" Спуск", 112, failureCode = 115),
                RunPoint(121),
                TechnicalPoint("IIки", 122, failureCode = 125),
                RunPoint(32),
                RunPoint(34),
                RunPoint(36),
                RunPoint(38),
                RunPoint(41),
                RunPoint(42),
                RunPoint(44),
                RunPoint(161),
                TechnicalPoint("Навеска", 162, failureCode = 165),
                RunPoint(131),
                TechnicalPoint("Бревно", 132, failureCode = 135),
                RunPoint(171),
                TechnicalPoint("Лка", 172, failureCode = 175),
                RunPoint(181),
                TechnicalPoint("Дом", 182, failureCode = 185),
                RunPoint(-1, length = 10000, "000"),
            ),
    )

val CHiPMO2024LongW =
    Distance(
        name = "ЧМО лич дл Ж 26.05.24",
        orgeoEventId = "35750",
        orgeoSubId = "3",
        orgeoCategories = listOf("Ж" to listOf("Женщины 4 класс", "Юниорки 4 класс")),
        points =
        listOf(
            RunPoint(44),
            RunPoint(39),
            RunPoint(111),
            TechnicalPoint(" Спуск", 112, failureCode = 115),
            RunPoint(121),
            TechnicalPoint("IIки", 122, failureCode = 125),
            RunPoint(32),
            RunPoint(34),
            RunPoint(36),
            RunPoint(38),
            RunPoint(40),
            RunPoint(42),
            RunPoint(161),
            TechnicalPoint("Навеска", 162, failureCode = 165),
            RunPoint(131),
            TechnicalPoint("Бревно", 132, failureCode = 135),
            RunPoint(171),
            TechnicalPoint("Лка", 172, failureCode = 175),
            RunPoint(181),
            TechnicalPoint("Дом", 182, failureCode = 185),
            RunPoint(-1, length = 9000, "000"),
        ),
    )
