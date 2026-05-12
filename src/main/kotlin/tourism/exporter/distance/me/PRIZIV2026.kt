package tourism.exporter.distance.me

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

private val short_distance_points = listOf(
    TechnicalPoint("Навеска", 61, failureCode = 101),
    RunPoint(52, 220),
    TechnicalPoint("Лка", 62, failureCode = 102),
    RunPoint(53, 310),
    TechnicalPoint("||ки", 63, failureCode = 103),
    RunPoint(54, 270),
    TechnicalPoint("Бревно", 64, failureCode = 104),
    TechnicalPoint("Дом", 65, failureCode = 105),
    RunPoint("FIN", length = 115 + 130 + 35, "000"),
)

val ME_26_Sprint =
    Distance(
        name = "МЭ лч сп 01.05.26",
        orgeoEventId = "51501",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("Мужчины_5"), "Ж" to listOf("Женщины_5")),
        points = short_distance_points,
    )

val ME_26_Sprint_4 =
    Distance(
        name = "МЭ лч сп 01.05.26",
        orgeoEventId = "51501",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("Юниоры_4"), "Ж" to listOf("Юниорки_4")),
        points = short_distance_points,
    )

val ME_26_Pair =
    Distance(
        name = "МЭ св 02.05.26",
        orgeoEventId = "51501",
        orgeoSubId = "7",
        categories = listOf("М" to listOf("Мужчины_5"), "Ж" to listOf("Женщины_5")),
        points = short_distance_points,
    )

val ME_26_Pair_4 =
    Distance(
        name = "МЭ св 02.05.26",
        orgeoEventId = "51501",
        orgeoSubId = "9",
        categories = listOf("М" to listOf("Юниоры_4"), "Ж" to listOf("Юниорки_4")),
        points = short_distance_points,
    )

val ME_26_Group_W =
    Distance(
        name = "МЭ гр Ж 03.05.26",
        orgeoEventId = "51501",
        orgeoSubId = "12",
        categories = listOf("Ж" to listOf("Женщины_5")),
        points =
            listOf(
                RunPoint(201),
                RunPoint(51),
                TechnicalPoint("||ки", 61, failureCode = 101),
                RunPoint(31),
                RunPoint(52),
                TechnicalPoint("Подъем", 62, failureCode = 102),
                RunPoint(33),
                RunPoint(53),
                TechnicalPoint("Навеска", 63, failureCode = 103),
                RunPoint(34),
                RunPoint(40),
                RunPoint(39),
                RunPoint(38),
                RunPoint(37),
                RunPoint(36),
                RunPoint(34),
                RunPoint(41),
                RunPoint(54),
                TechnicalPoint("Лка", 64, failureCode = 104),
                RunPoint(43),
                RunPoint(55),
                TechnicalPoint("Дом", 65, failureCode = 105),
                RunPoint("FIN", length = 12500, "000"),
            ),
    )

val ME_26_Group_M =
    Distance(
        name = "МЭ гр М 03.05.26",
        orgeoEventId = "51501",
        orgeoSubId = "12",
        categories = listOf("М" to listOf("Мужчины_5")),
        points =
            listOf(
                RunPoint(201),
                RunPoint(51),
                TechnicalPoint("||ки", 61, failureCode = 101),
                RunPoint(31),
                RunPoint(52),
                TechnicalPoint("Подъем", 62, failureCode = 102),
                RunPoint(32),
                RunPoint(33),
                RunPoint(53),
                TechnicalPoint("Навеска", 63, failureCode = 103),
                RunPoint(34),
                RunPoint(36),
                RunPoint(37),
                RunPoint(38),
                RunPoint(39),
                RunPoint(40),
                RunPoint(34),
                RunPoint(41),
                RunPoint(42),
                RunPoint(54),
                TechnicalPoint("Лка", 64, failureCode = 104),
                RunPoint(43),
                RunPoint(55),
                TechnicalPoint("Дом", 65, failureCode = 105),
                RunPoint("FIN", length = 12500, "000"),
            ),
    )

val ME_26_Group_W_4 =
    Distance(
        name = "МЭ гр Ж 03.05.26",
        orgeoEventId = "51501",
        orgeoSubId = "12",
        categories = listOf("М" to listOf("Юниорки_4")),
        points =
            listOf(
                RunPoint(201),
                RunPoint(51),
                TechnicalPoint("||ки", 61, failureCode = 101),
                RunPoint(31),
                RunPoint(52),
                TechnicalPoint("Подъем", 62, failureCode = 102),
                RunPoint(33),
                RunPoint(53),
                TechnicalPoint("Навеска", 63, failureCode = 103),
                RunPoint(34),
                RunPoint(41),
                RunPoint(54),
                TechnicalPoint("Лка", 64, failureCode = 104),
                RunPoint(43),
                RunPoint(55),
                TechnicalPoint("Дом", 65, failureCode = 105),
                RunPoint("FIN", length = 8100, "000"),
            ),
    )

val ME_26_Group_M_4 =
    Distance(
        name = "МЭ гр М 03.05.26",
        orgeoEventId = "51501",
        orgeoSubId = "12",
        categories = listOf("М" to listOf("Юниоры_4")),
        points =
            listOf(
                RunPoint(201),
                RunPoint(51),
                TechnicalPoint("||ки", 61, failureCode = 101),
                RunPoint(31),
                RunPoint(52),
                TechnicalPoint("Подъем", 62, failureCode = 102),
                RunPoint(32),
                RunPoint(33),
                RunPoint(53),
                TechnicalPoint("Навеска", 63, failureCode = 103),
                RunPoint(34),
                RunPoint(40),
                RunPoint(39),
                RunPoint(36),
                RunPoint(34),
                RunPoint(41),
                RunPoint(42),
                RunPoint(54),
                TechnicalPoint("Лка", 64, failureCode = 104),
                RunPoint(43),
                RunPoint(55),
                TechnicalPoint("Дом", 65, failureCode = 105),
                RunPoint("FIN", length = 9500, "000"),
            ),
    )