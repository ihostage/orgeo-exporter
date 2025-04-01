package tourism.exporter.distance.kmo

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val KMO_25_Sprint =
    Distance(
        name = "КМО лч сп 29.03.25",
        orgeoEventId = "41994",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("МУЖЧИНЫ_4", "ЮНИОРЫ_4"), "Ж" to listOf("ЖЕНЩИНЫ_4", "ЮНИОРКИ_4")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(101, 390),
                TechnicalPoint("Бревно", 102, failureCode = 202),
                RunPoint(111, 170),
                TechnicalPoint("Маятник", 112, failureCode = 212),
                RunPoint(121, 200),
                TechnicalPoint("Спуск", 125, failureCode = 225),
                RunPoint(32),
                RunPoint(131, 370),
                TechnicalPoint("Лка", 132, failureCode = 232),
                RunPoint(141, 160),
                TechnicalPoint("Навеска", 142, failureCode = 242),
                RunPoint(-1, length = 80, "000"),
            ),
    )

val KMO_25_Sprint_2class =
    Distance(
        name = "КМО лч сп 29.03.25",
        orgeoEventId = "41994",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("МАЛЬЧИКИ_2", "ЮНОШИ_2"), "Ж" to listOf("ДЕВОЧКИ_2", "ДЕВУШКИ_2")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(101, 390),
                TechnicalPoint("Бревно", 102, failureCode = 202),
                RunPoint(111, 170),
                TechnicalPoint("Маятник", 112, failureCode = 212),
                RunPoint(121, 200),
                TechnicalPoint("Спуск", 125, failureCode = 225),
                RunPoint(32),
                RunPoint(141, 160),
                TechnicalPoint("Навеска", 142, failureCode = 242),
                RunPoint(-1, length = 80, "000"),
            ),
    )

val KMO_25_Pair_Sprint =
    Distance(
        name = "КМО св сп 30.03.25",
        orgeoEventId = "41995",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("Мужчины_4", "Юниоры_4"), "Ж" to listOf("Женщины_4", "Юниорки_4")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(101, 390),
                TechnicalPoint("Бревно", 102, failureCode = 105),
                RunPoint(111, 170),
                TechnicalPoint("Маятник", 112, failureCode = 115),
                RunPoint(121, 200),
                TechnicalPoint("Спуск", 122, failureCode = 125),
                RunPoint(32),
                RunPoint(131, 370),
                TechnicalPoint("Лка", 132, failureCode = 135),
                RunPoint(141, 160),
                TechnicalPoint("Навеска", 142, failureCode = 145),
                RunPoint(-1, length = 80, "000"),
            ),
    )
