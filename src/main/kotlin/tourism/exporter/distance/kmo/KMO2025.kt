package tourism.exporter.distance.kmo

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val KMO_25_Sprint =
    Distance(
        name = "КМО лч сп 29.03.25",
        orgeoEventId = "41994",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("МУЖЧИНЫ_4", "ЮНИОРЫ_4"), "Ж" to listOf("ЖЕНЩИНЫ_4", "ЮНИОРКИ_4")),
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
        categories = listOf("М" to listOf("МАЛЬЧИКИ_2", "ЮНОШИ_2"), "Ж" to listOf("ДЕВОЧКИ_2", "ДЕВУШКИ_2")),
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
        categories = listOf("М" to listOf("Мужчины_4", "Юниоры_4"), "Ж" to listOf("Женщины_4", "Юниорки_4")),
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
        categories = listOf("М" to listOf("м-М-Ж_4", "м-ЮНР-ЮНРК_4"), "Ж" to listOf("ж-М-Ж_4", "ж-ЮНР-ЮНРК_4")),
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
        categories = listOf("М" to listOf("м-ЮН-ДЕВ_3", "м-ЮНР-ЮНРК_3"), "Ж" to listOf("ж-ЮН-ДЕВ_3", "ж-ЮНР-ЮНРК_3")),
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
        categories = listOf("М" to listOf("м_М-Ж_4", "м_ЮНР-ЮНРК_4"), "Ж" to listOf("ж_М-Ж_4", "ж_ЮНР-ЮНРК_4")),
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
        categories = listOf(
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

val KMO_25_S4_Pair =
    Distance(
        name = "КМО св сп 11.10.25",
        orgeoEventId = "46786",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("МУЖЧИНЫ_4 класс", "ЮНИОРЫ_4 класс"), "Ж" to listOf("ЖЕНЩИНЫ_4 класс", "ЮНИОРКИ_4 класс")),
        points =
            listOf(
                RunPoint(101, 50),
                TechnicalPoint("Дом", 102, failureCode = 105),
                RunPoint(111, 180),
                TechnicalPoint("||ки", 112, failureCode = 115),
                RunPoint(31),
                RunPoint(121, 340),
                TechnicalPoint("Бревно", 122, failureCode = 125),
                RunPoint(32),
                RunPoint(131, 320),
                TechnicalPoint("Лка", 132, failureCode = 135),
                RunPoint(141, 150),
                TechnicalPoint("Спуск", 142, failureCode = 145),
                RunPoint(151, 70),
                TechnicalPoint("Подъём", 152, failureCode = 155),
                RunPoint(-1, length = 15, "000"),
            ),
    )

val KMO_25_S4_Pair_3 =
    Distance(
        name = "КМО св 3кл 11.10.25",
        orgeoEventId = "46786",
        orgeoSubId = "1",
        categories = listOf(
            "М" to listOf("ЮНИОРЫ_3 класс", "ЮНОШИ_3 класс"),
            "Ж" to listOf("ДЕВУШКИ_3 класс", "ЖЕНЩИНЫ_3 класс", "ЮНИОРКИ_3 класс")
        ),
        points =
            listOf(
                RunPoint(101, 50),
                TechnicalPoint("Лка", 102, failureCode = 105),
                RunPoint(111, 180),
                TechnicalPoint("||ки", 112, failureCode = 115),
                RunPoint(31),
                RunPoint(121, 340),
                TechnicalPoint("Бревно", 122, failureCode = 125),
                RunPoint(32),
                RunPoint(131, 320),
                TechnicalPoint("Маятник", 132, failureCode = 135),
                RunPoint(141, 150),
                TechnicalPoint("Спуск", 142, failureCode = 145),
                RunPoint(151, 70),
                TechnicalPoint("Спуск", 152, failureCode = 155),
                RunPoint(-1, length = 15, "000"),
            ),
    )

val KMO_25_S4_Long_M =
    Distance(
        name = "КМО лч дл М 12.10.25",
        orgeoEventId = "46788",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("4_Юниоры", "4_Мужчины")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 102, failureCode = 105),
                RunPoint(49),
                RunPoint(42),
                RunPoint(33),
                RunPoint(111),
                TechnicalPoint("||ки", 112, failureCode = 115),
                RunPoint(121),
                TechnicalPoint("Бревно", 122, failureCode = 125),
                RunPoint(48),
                RunPoint(39),
                RunPoint(37),
                RunPoint(141),
                TechnicalPoint("Спуск", 142, failureCode = 145),
                RunPoint(44),
                RunPoint(46),
                RunPoint(41),
                RunPoint(131),
                TechnicalPoint("Лка", 132, failureCode = 135),
                RunPoint(-1, length = 7200, "000"),
            ),
    )

val KMO_25_S4_Long_W =
    Distance(
        name = "КМО лч дл Ж 12.10.25",
        orgeoEventId = "46788",
        orgeoSubId = "1",
        categories = listOf("Ж" to listOf("4_Женщины", "4_Юниорки")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 102, failureCode = 105),
                RunPoint(49),
                RunPoint(40),
                RunPoint(33),
                RunPoint(111),
                TechnicalPoint("||ки", 112, failureCode = 115),
                RunPoint(121),
                TechnicalPoint("Бревно", 122, failureCode = 125),
                RunPoint(48),
                RunPoint(39),
                RunPoint(38),
                RunPoint(141),
                TechnicalPoint("Спуск", 142, failureCode = 145),
                RunPoint(43),
                RunPoint(46),
                RunPoint(41),
                RunPoint(131),
                TechnicalPoint("Лка", 132, failureCode = 135),
                RunPoint(-1, length = 6400, "000"),
            ),
    )

val KMO_25_S4_Long_3 =
    Distance(
        name = "КМО лч дл 3л 12.10.25",
        orgeoEventId = "46788",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("3_Юноши"), "Ж" to listOf("3_Девушки")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Лка", 102, failureCode = 105),
                RunPoint(48),
                RunPoint(40),
                RunPoint(33),
                RunPoint(111),
                TechnicalPoint("||ки", 112, failureCode = 115),
                RunPoint(121),
                TechnicalPoint("Бревно", 122, failureCode = 125),
                RunPoint(46),
                RunPoint(47),
                RunPoint(38),
                RunPoint(141),
                TechnicalPoint("Спуск", 142, failureCode = 145),
                RunPoint(42),
                RunPoint(41),
                RunPoint(131),
                TechnicalPoint("Маятник", 132, failureCode = 135),
                RunPoint(-1, length = 5200, "000"),
            ),
    )
