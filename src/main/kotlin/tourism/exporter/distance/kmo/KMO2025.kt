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

val KMO_25_S3_Sprint =
    Distance(
        name = "КМО лч сп 27.09.25",
        orgeoEventId = "45850",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("м-М-Ж_4", "м-ЮНР-ЮНРК_4"), "Ж" to listOf("ж-М-Ж_4", "ж-ЮНР-ЮНРК_4")),
        points =
            listOf(
                TechnicalPoint("Дом", 102, failureCode = 202),
                RunPoint(111, 170),
                TechnicalPoint("||ки", 112, failureCode = 212),
                RunPoint(31),
                RunPoint(121, 340),
                TechnicalPoint("Бревно", 122, failureCode = 225),
                RunPoint(32),
                RunPoint(131, 320),
                TechnicalPoint("Маятник", 132, failureCode = 232),
                RunPoint(141, 150),
                TechnicalPoint("Спуск", 142, failureCode = 242),
                RunPoint(-1, length = 120, "000"),
            ),
    )

val KMO_25_S3_Sprint_3 =
    Distance(
        name = "КМО лч 3кл 27.09.25",
        orgeoEventId = "45850",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("м-ЮН-ДЕВ_3", "м-ЮНР-ЮНРК_3"), "Ж" to listOf("ж-ЮН-ДЕВ_3", "ж-ЮНР-ЮНРК_3")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Лка", 102, failureCode = 202),
                RunPoint(111, 170),
                TechnicalPoint("||ки", 112, failureCode = 212),
                RunPoint(31),
                RunPoint(121, 340),
                TechnicalPoint("Бревно", 122, failureCode = 225),
                RunPoint(32),
                RunPoint(131, 320),
                TechnicalPoint("Маятник", 132, failureCode = 232),
                RunPoint(141, 150),
                TechnicalPoint("Спуск", 142, failureCode = 242),
                RunPoint(-1, length = 120, "000"),
            ),
    )

val KMO_25_S3_Pair =
    Distance(
        name = "КМО св сп 28.09.25",
        orgeoEventId = "45851",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("м_М-Ж_4", "м_ЮНР-ЮНРК_4"), "Ж" to listOf("ж_М-Ж_4", "ж_ЮНР-ЮНРК_4")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 102, failureCode = 202),
                RunPoint(111, 170),
                TechnicalPoint("||ки", 112, failureCode = 212),
                RunPoint(31),
                RunPoint(121, 340),
                TechnicalPoint("Бревно", 122, failureCode = 225),
                RunPoint(32),
                RunPoint(131, 320),
                TechnicalPoint("Лка", 132, failureCode = 232),
                RunPoint(141, 150),
                TechnicalPoint("Спуск", 142, failureCode = 242),
                RunPoint(-1, length = 120, "000"),
            ),
    )

val KMO_25_S3_Pair_3 =
    Distance(
        name = "КМО св 3кл 28.09.25",
        orgeoEventId = "45851",
        orgeoSubId = "1",
        orgeoCategories = listOf(
            "М" to listOf("м_М-Ж_3", "м_ЮН-ДЕВ-14-15_3", "м_ЮНР-ЮНРК-16-21_3"),
            "Ж" to listOf("ж_ЮН-ДЕВ-14-15_3", "ж_ЮНР-ЮНРК-16-21_3", "ж_М-Ж_3")
        ),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Лка", 102, failureCode = 202),
                RunPoint(111, 170),
                TechnicalPoint("||ки", 112, failureCode = 212),
                RunPoint(31),
                RunPoint(121, 340),
                TechnicalPoint("Бревно", 122, failureCode = 225),
                RunPoint(32),
                RunPoint(131, 320),
                TechnicalPoint("Маятник", 132, failureCode = 232),
                RunPoint(141, 150),
                TechnicalPoint("Спуск", 142, failureCode = 242),
                RunPoint(-1, length = 120, "000"),
            ),
    )
