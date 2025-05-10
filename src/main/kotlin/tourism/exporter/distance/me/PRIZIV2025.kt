package tourism.exporter.distance.me

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val ME_25_Sprint =
    Distance(
        name = "МЭ лч сп 02.05.25",
        orgeoEventId = "42561",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(41, 115),
                TechnicalPoint("Навеска", 51, failureCode = 101),
                RunPoint(42, 205),
                TechnicalPoint("Лка", 52, failureCode = 102),
                RunPoint(43, 290),
                TechnicalPoint("||ки", 53, failureCode = 103),
                RunPoint(44, 270),
                TechnicalPoint("Бревно", 54, failureCode = 104),
                TechnicalPoint("Дом", 55, failureCode = 105),
                RunPoint("FIN", length = 125, "000"),
            ),
    )

val ME_25_Pair =
    Distance(
        name = "МЭ св 03.05.25",
        orgeoEventId = "42561",
        orgeoSubId = "6",
        orgeoCategories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(41, 115),
                TechnicalPoint("Навеска", 51, failureCode = 101),
                RunPoint(42, 205),
                TechnicalPoint("Лка", 52, failureCode = 102),
                RunPoint(43, 290),
                TechnicalPoint("||ки", 53, failureCode = 103),
                RunPoint(44, 270),
                TechnicalPoint("Бревно", 54, failureCode = 104),
                TechnicalPoint("Дом", 55, failureCode = 105),
                RunPoint("FIN", length = 125, "000"),
            ),
    )

val ME_25_Group_W =
    Distance(
        name = "МЭ гр Ж 04.05.25",
        orgeoEventId = "42561",
        orgeoSubId = "10",
        orgeoCategories = listOf("Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(32),
                RunPoint(33),
                RunPoint(41),
                TechnicalPoint("Лка", 51, failureCode = 101),
                RunPoint(42),
                TechnicalPoint("||ки", 52, failureCode = 102),
                RunPoint(43),
                TechnicalPoint("Навеска", 53, failureCode = 103),
                RunPoint(37),
                RunPoint(44),
                TechnicalPoint("Подъем", 54, failureCode = 104),
                RunPoint(36),
                RunPoint(38),
                // RunPoint(39),
                RunPoint(45),
                TechnicalPoint("Овраг", 55, failureCode = 105),
                RunPoint(40),
                RunPoint(41),
                RunPoint(48),
                TechnicalPoint("Дом", 58, failureCode = 105),
                RunPoint("FIN", length = 9000, "000"),
            ),
    )

val ME_25_Group_M =
    Distance(
        name = "МЭ гр М 04.05.25",
        orgeoEventId = "42561",
        orgeoSubId = "10",
        orgeoCategories = listOf("М" to listOf("5_мужчины")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(32),
                RunPoint(33),
                RunPoint(41),
                TechnicalPoint("Лка", 51, failureCode = 101),
                RunPoint(42),
                TechnicalPoint("||ки", 52, failureCode = 102),
                RunPoint(43),
                TechnicalPoint("Навеска", 53, failureCode = 103),
                RunPoint(34),
                RunPoint(35),
                RunPoint(44),
                TechnicalPoint("Подъем", 54, failureCode = 104),
                RunPoint(36),
                RunPoint(37),
                RunPoint(38),
                // RunPoint(39),
                RunPoint(45),
                TechnicalPoint("Овраг", 55, failureCode = 105),
                RunPoint(40),
                RunPoint(41),
                RunPoint(48),
                TechnicalPoint("Дом", 58, failureCode = 105),
                RunPoint("FIN", length = 10300, "000"),
            ),
    )
