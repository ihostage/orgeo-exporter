package tourism.exporter.distance.chmo

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val ChMO_26 =
    Distance(
        name = "ЧМО лч 23.05.26",
        orgeoEventId = "52749",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("4 класс МУЖЧИНЫ", "4 класс ЮНИОРЫ"), "Ж" to listOf("4 класс ЖЕНЩИНЫ", "4 класс ЮНИОРКИ")),
        points =
            listOf(
                RunPoint(31, 250),
                RunPoint(101, 250),
                TechnicalPoint("Бревно", 102, failureCode = 105),
                RunPoint(111, 160),
                TechnicalPoint("Лка", 112, failureCode = 115),
                RunPoint(codes = listOf("121", "122"), 220),
                RunPoint(32),
                RunPoint(131, 740),
                TechnicalPoint("Спуск", 132, failureCode = 135),
                RunPoint(141, 290),
                TechnicalPoint("Дом", 142, failureCode = 145),
                RunPoint(-1, length = 310, "000"),
            )
    )

val ChMO_26_Pair_M =
    Distance(
        name = "ЧМО св м 24.05.26",
        orgeoEventId = "52751",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("4 класс МУЖЧИНЫ", "4 класс ЮНИОРЫ")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(32),
                RunPoint(33),
                RunPoint(101),
                TechnicalPoint("Спуск", 102, failureCode = 105),
                RunPoint(34),
                RunPoint(35),
                RunPoint(111),
                TechnicalPoint("Навеска", 112, failureCode = 115),
                RunPoint(36),
                RunPoint(37),
                RunPoint(38),
                RunPoint(39),
                RunPoint(121),
                TechnicalPoint("Лка", 122, failureCode = 125),
                RunPoint(131),
                TechnicalPoint("Бревно", 132, failureCode = 135),
                RunPoint(142),
                TechnicalPoint("Дом", 141, failureCode = 145),
                RunPoint(40),
                RunPoint(50),
                RunPoint(-1, length = 10250, "000"),
            )
    )

val ChMO_26_Pair_W =
    Distance(
        name = "ЧМО св ж 24.05.26",
        orgeoEventId = "52751",
        orgeoSubId = "1",
        categories = listOf("Ж" to listOf("4 класс ЖЕНЩИНЫ", "4 класс ЮНИОРКИ")),
        points =
            listOf(
                RunPoint(41),
                RunPoint(42),
                RunPoint(33),
                RunPoint(101),
                TechnicalPoint("Спуск", 102, failureCode = 105),
                RunPoint(34),
                RunPoint(35),
                RunPoint(111),
                TechnicalPoint("Навеска", 112, failureCode = 115),
                RunPoint(38),
                RunPoint(39),
                RunPoint(121),
                TechnicalPoint("Лка", 122, failureCode = 125),
                RunPoint(131),
                TechnicalPoint("Бревно", 132, failureCode = 135),
                RunPoint(142),
                TechnicalPoint("Дом", 141, failureCode = 145),
                RunPoint(40),
                RunPoint(50),
                RunPoint(-1, length = 8000, "000"),
            )
    )
