package tourism.exporter.distance.kmo

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val KMO_24_Sprint =
    Distance(
        name = "КМО лч сп 21.09.24",
        orgeoEventId = "37614",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("4 класс мужчины", "4 класс юниоры"), "Ж" to listOf("4 класс женщины", "4 класс юниорки")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(101, 290),
                TechnicalPoint("Бревно", 102, failureCode = 202),
                RunPoint(111, 170),
                TechnicalPoint("Лка", 112, failureCode = 212),
                RunPoint(121, 200),
                TechnicalPoint("Спуск", 122, failureCode = 222),
                TechnicalPoint("Подъем", 123, failureCode = 223),
                RunPoint(32),
                RunPoint(131, 290),
                TechnicalPoint("Дом", 132, failureCode = 232),
                RunPoint(141, 160),
                TechnicalPoint("Навеска", 142, failureCode = 242),
                RunPoint(-1, length = 100, "000"),
            ),
        fixesSplit =
            listOf(
                // Добавлена примерная отметка на выходе с навески (142)
                "Моргунов Сергей" to
                    "00:00:42|31|00:00:21|101|00:01:01|102|00:00:36|111|00:04:20|112|00:00:43|121|00:01:43|122|00:00:26|123|00:00:42|32|00:00:33|131|00:02:30|132|00:00:31|141|00:03:08|142|",
            ),
    )

val KMO_24_Pair_Sprint =
    Distance(
        name = "КМО св сп 22.09.24",
        orgeoEventId = "37613",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("4 класс мужчины", "4 класс юниоры"), "Ж" to listOf("4 класс женщины", "4 класс юниорки")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(101, 290),
                TechnicalPoint("Бревно", 102, failureCode = 202),
                RunPoint(111, 170),
                TechnicalPoint("Лка", 112, failureCode = 212),
                RunPoint(121, 200),
                TechnicalPoint("Спуск", 122, failureCode = 222),
                TechnicalPoint("Подъем", 123, failureCode = 223),
                RunPoint(32),
                RunPoint(131, 290),
                TechnicalPoint("Дом", 132, failureCode = 232),
                RunPoint(141, 160),
                TechnicalPoint("Навеска", 142, failureCode = 242),
                RunPoint(-1, length = 100, "000"),
            ),
    )

val KMO_24_Short =
    Distance(
        name = "КМО лч кр 12.10.24",
        orgeoEventId = "38340",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("м-М-Ж_4", "м-ЮНР-ЮНРК-16-21_4"), "Ж" to listOf("ж-М-Ж_4", "ж-ЮНР-ЮНРК-16-21_4")),
        points =
            listOf(
                RunPoint(101, 420),
                TechnicalPoint("Бревно", 102, failureCode = 105),
                RunPoint(111, 170),
                TechnicalPoint("Лка", 112, failureCode = 115),
                RunPoint(31),
                RunPoint(32),
                RunPoint(121, 620),
                TechnicalPoint("Спуск", 122, failureCode = 125),
                RunPoint(33),
                RunPoint(131, 300),
                TechnicalPoint("Дом", 132, failureCode = 135),
                RunPoint(141, 320),
                TechnicalPoint("Навеска", 142, failureCode = 145),
                RunPoint(-1, length = 490, "000"),
            ),
    )

val KMO_24_Long_M_Pair =
    Distance(
        name = "КМО св дл М 13.10.24",
        orgeoEventId = "38343",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("м_М-Ж-22-и старше_4", "м_ЮНР-ЮНРК-16-21_4")),
        points =
            listOf(
                RunPoint(38),
                RunPoint(37),
                RunPoint(111),
                TechnicalPoint("Лка", 112, failureCode = 115),
                RunPoint(34),
                RunPoint(40),
                RunPoint(41),
                RunPoint(151),
                TechnicalPoint("Навеска", 152, failureCode = 155),
                RunPoint(43),
                RunPoint(33),
                RunPoint(36),
                RunPoint(39),
                RunPoint(161),
                TechnicalPoint("Спуск", 162, failureCode = 165),
                RunPoint(38),
                RunPoint(31),
                RunPoint(131),
                TechnicalPoint("Дом", 132, failureCode = 135),
                RunPoint(34),
                RunPoint(-1, length = 7500, "000"),
            ),
    )

val KMO_24_Long_W_Pair =
    Distance(
        name = "КМО св дл Ж 13.10.24",
        orgeoEventId = "38343",
        orgeoSubId = "1",
        orgeoCategories = listOf("Ж" to listOf("ж_М-Ж-22-и старше_4", "ж_ЮНР-ЮНРК-16-21_4")),
        points =
        listOf(
            RunPoint(38),
            RunPoint(37),
            RunPoint(111),
            TechnicalPoint("Лка", 112, failureCode = 115),
            RunPoint(34),
            RunPoint(40),
            RunPoint(41),
            RunPoint(151),
            TechnicalPoint("Навеска", 152, failureCode = 155),
            RunPoint(43),
            RunPoint(44),
            RunPoint(39),
            RunPoint(161),
            TechnicalPoint("Спуск", 162, failureCode = 165),
            RunPoint(38),
            RunPoint(31),
            RunPoint(131),
            TechnicalPoint("Дом", 132, failureCode = 135),
            RunPoint(34),
            RunPoint(-1, length = 6400, "000"),
        ),
    )

val KMO_24_Short_3 =
    Distance(
        name = "КМО лч кр 3кл 12.10.24",
        orgeoEventId = "38340",
        orgeoSubId = "1",
        orgeoCategories =
            listOf(
                "М" to listOf("м-ЮН-ДЕВ-14-15_3", "м-ЮНР-ЮНРК-16-21_3", "м-М-Ж_3"),
                "Ж" to listOf("ж-ЮН-ДЕВ-14-15_3", "ж-ЮНР-ЮНРК-16-21_3", "ж-М-Ж_3"),
            ),
        points =
            listOf(
                RunPoint(101, 420),
                TechnicalPoint("Бревно", 102, failureCode = 105),
                RunPoint(111, 170),
                TechnicalPoint("Лка", 112, failureCode = 115),
                RunPoint(31),
                RunPoint(32),
                RunPoint(121, 620),
                TechnicalPoint("Спуск", 122, failureCode = 125),
                RunPoint(33),
                RunPoint(131, 300),
                TechnicalPoint("Дом", 132, failureCode = 135),
                RunPoint(141, 320),
                TechnicalPoint("Навеска", 142, failureCode = 145),
                RunPoint(-1, length = 490, "000"),
            ),
    )

val KMO_24_Short_2 =
    Distance(
        name = "КМО лч кр 2кл 12.10.24",
        orgeoEventId = "38340",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("м-МАЛ-ДЕВЧ-10-13_2"), "Ж" to listOf("ж-МАЛ-ДЕВЧ-10-13_2")),
        points =
            listOf(
                RunPoint(101, 420),
                TechnicalPoint("Бревно", 102, failureCode = 105),
                RunPoint(111, 170),
                TechnicalPoint("Лка", 112, failureCode = 115),
                RunPoint(32),
                RunPoint(121, 290),
                TechnicalPoint("Спуск", 122, failureCode = 125),
                TechnicalPoint("Подъём", 123, failureCode = 125),
                RunPoint(33),
                RunPoint(141, 350),
                TechnicalPoint("Навеска", 142, failureCode = 145),
                RunPoint(-1, length = 490, "000"),
            ),
    )

val KMO_24_Group =
    Distance(
        name = "КМО гр 12.10.24",
        orgeoEventId = "38341",
        orgeoSubId = "1",
        orgeoCategories = listOf("МЖ" to listOf("гр_М-Ж_4", "гр_ЮНР-ЮНРК-16-21_4")),
        points =
        listOf(
            RunPoint(101, 420),
            TechnicalPoint("Бревно", 102, failureCode = 105),
            RunPoint(111, 170),
            TechnicalPoint("Лка", 112, failureCode = 115),
            RunPoint(32),
            RunPoint(121, 280),
            TechnicalPoint("Спуск", 122, failureCode = 125),
            RunPoint(33),
            RunPoint(131, 300),
            TechnicalPoint("Дом", 132, failureCode = 135),
            RunPoint(141, 320),
            TechnicalPoint("Навеска", 142, failureCode = 145),
            RunPoint(-1, length = 490, "000"),
        ),
    )
