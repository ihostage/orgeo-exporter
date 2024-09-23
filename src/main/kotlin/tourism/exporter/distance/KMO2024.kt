package tourism.exporter.distance

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
