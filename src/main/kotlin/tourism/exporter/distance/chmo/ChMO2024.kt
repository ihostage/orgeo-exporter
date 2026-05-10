package tourism.exporter.distance.chmo

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val ChMO_2024_Pair =
    Distance(
        name = "ЧМО св кор 25.05.24",
        orgeoEventId = "35750",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("МУЖЧИНЫ_4", "ЮНИОРЫ_4"), "Ж" to listOf("ЖЕНЩИНЫ_4", "ЮНИОРКИ_4")),
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

val ChMO_2024_Long_M =
    Distance(
        name = "ЧМО лич дл М 26.05.24",
        orgeoEventId = "35750",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("Мужчины 4 класс", "Юниоры 4 класс")),
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

val ChMO_2024_Long_W =
    Distance(
        name = "ЧМО лич дл Ж 26.05.24",
        orgeoEventId = "35750",
        orgeoSubId = "3",
        categories = listOf("Ж" to listOf("Женщины 4 класс", "Юниорки 4 класс")),
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