package tourism.exporter.distance.chmo

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val ChMO_25_Sprint =
    Distance(
        name = "ЧМО лч 24.05.25",
        orgeoEventId = "43696",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("МУЖЧИНЫ_4", "ЮНИОРЫ_4"), "Ж" to listOf("ЖЕНЩИНЫ_4", "ЮНИОРКИ_4")),
        points =
            listOf(
                RunPoint(101, 170),
                TechnicalPoint("Дом", 102, failureCode = 105),
                RunPoint(111, 240),
                TechnicalPoint("Навеска", 112, failureCode = 115),
                RunPoint(121, 400),
                TechnicalPoint("Подъём", 122, failureCode = 125),
                RunPoint(31),
                RunPoint(131, 600),
                TechnicalPoint("Лка", 132, failureCode = 135),
                RunPoint(32),
                RunPoint(141, 560),
                TechnicalPoint("Бревно", 142, failureCode = 145),
                RunPoint(-1, length = 140, "000"),
            ),
        fixesSplit = listOf(
            "Кириллов Алексей Денисович" to "00:00:30|101|00:02:35|102|00:00:55|111|00:02:12|112|00:01:40|121|00:02:00|122|00:01:20|31|00:01:38|131|00:02:41|132|00:01:39|32|00:00:45|141|00:01:04|142|",
            "Тельбух Иван" to "00:00:29|101|00:02:32|102|00:01:00|111|00:02:23|112|00:01:43|121|00:02:23|122|00:01:21|31|00:01:44|131|00:02:29|132|00:01:40|32|00:00:46|141|00:00:54|142|",
            "Калиновская Мария" to "00:00:40|101|00:02:22|102|00:01:15|111|00:02:14|112|00:02:16|121|00:01:44|122|00:01:43|31|00:02:02|131|00:02:36|132|00:02:03|32|00:00:53|141|00:00:59|142|",
            "Денисова Екатерина Алексеевна" to "00:00:43|101|00:03:37|102|00:01:24|111|00:03:20|112|00:02:18|121|00:02:12|122|00:02:04|31|00:02:31|131|00:02:47|132|00:02:28|32|00:00:59|141|00:02:06|142|"
        )
    )

val ChMO_25_Pair_M =
    Distance(
        name = "ЧМО св м 25.05.25",
        orgeoEventId = "43705",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("м_М-Ж_4", "м_ЮНР-ЮНРК_4")),// "Ж" to listOf("ж_М-Ж_4", "ж_ЮНР-ЮНРК_4")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 102, failureCode = 105),
                RunPoint(31),
                RunPoint(32),
                RunPoint(33),
                RunPoint(34),
                RunPoint(111),
                TechnicalPoint("Спуск", 112, failureCode = 115),
                RunPoint(35),
                RunPoint(36),
                RunPoint(37),
                RunPoint(38),
                RunPoint(39),
                RunPoint(121),
                TechnicalPoint("Навеска", 122, failureCode = 125),
                RunPoint(40),
                RunPoint(41),
                RunPoint(42),
                RunPoint(43),
                RunPoint(44),
                RunPoint(131),
                TechnicalPoint("Лка", 132, failureCode = 135),
                RunPoint(141),
                TechnicalPoint("Бревно", 142, failureCode = 145),
                RunPoint(-1, length = 10250, "000"),
            ),
        fixesSplit = listOf(
            "Безруков-Тюрин" to "00:01:14|101|00:05:21|102|00:02:49|31|00:02:38|32|00:08:18|33|00:07:14|34|00:11:33|111|00:01:46|112|00:02:25|35|00:07:15|36|00:03:55|37|00:06:17|38|00:07:46|39|00:01:20|121|00:02:57|122|00:05:13|40|00:04:48|41|00:04:44|42|00:04:01|43|00:06:00|44|00:02:13|131|00:04:07|132|00:01:12|141|00:01:21|142|",
            "Драченков-Нагибин" to "00:01:14|101|00:09:11|102|00:03:05|31|00:03:34|32|00:17:00|33|00:09:12|34|00:16:51|111|00:03:23|112|00:07:03|35|00:00:16|35|00:21:03|36|00:07:53|37|00:11:48|38|"
        )
    )

val ChMO_25_Pair_W =
    Distance(
        name = "ЧМО св ж 25.05.25",
        orgeoEventId = "43705",
        orgeoSubId = "1",
        orgeoCategories = listOf("Ж" to listOf("ж_М-Ж_4", "ж_ЮНР-ЮНРК_4")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 102, failureCode = 105),
                RunPoint(31),
                RunPoint(32),
                RunPoint(33),
                RunPoint(45),
                RunPoint(111),
                TechnicalPoint("Спуск", 112, failureCode = 115),
                RunPoint(35),
                RunPoint(40),
                RunPoint(37),
                RunPoint(38),
                RunPoint(39),
                RunPoint(121),
                TechnicalPoint("Навеска", 122, failureCode = 125),
                RunPoint(42),
                RunPoint(43),
                RunPoint(44),
                RunPoint(131),
                TechnicalPoint("Лка", 132, failureCode = 135),
                RunPoint(141),
                TechnicalPoint("Бревно", 142, failureCode = 145),
                RunPoint(-1, length = 8000, "000"),
            ),
        fixesSplit = listOf(
            "Беляева-Калиновская" to "00:01:09|101|00:05:02|102|00:02:59|31|00:02:44|32|00:09:06|33|00:06:29|45|00:07:21|111|00:01:55|112|00:02:33|35|00:05:12|40|00:02:35|37|00:05:01|38|00:06:51|39|00:01:23|121|00:02:17|122|00:06:33|42|00:05:18|43|00:05:25|44|00:02:28|131|00:04:03|132|00:01:03|141|00:01:03|142|",
            "Лизунова-Денисова" to "00:01:26|101|00:07:03|102|00:02:55|31|00:02:54|32|00:12:15|33|00:09:21|45|00:09:18|111|00:01:58|112|00:02:47|35|00:08:10|40|00:02:27|37|00:06:37|38|00:10:52|39|00:01:04|121|00:02:29|122|00:07:02|42|00:04:19|43|00:03:43|44|00:02:46|131|00:03:50|132|00:01:01|141|00:01:49|142|"
        )
    )

val ChMO_25_Pair_2 =
    Distance(
        name = "ССМО св 2кл 25.05.25",
        orgeoEventId = "43705",
        orgeoSubId = "1",
        orgeoCategories = listOf(
            "МАЛ" to listOf("м_МАЛ-ДЕВ_2"),
            "ДЕВЧ" to listOf("ж_МАЛ-ДЕВ_2"),
            "ЮН" to listOf("м_ЮН-ДЕВ_2"),
            "ДЕВ" to listOf("ж_ЮН-ДЕВ_2"),
            "ЮНР" to listOf("м_ЮНР-ЮНРК_2"),
            "ЮНРК" to listOf("ж_ЮНР-ЮНРК_2")
        ),
        points =
            listOf(
                RunPoint(141),
                TechnicalPoint("Бревно", 142, failureCode = 145),
                RunPoint(31),
                RunPoint(51),
                RunPoint(151),
                TechnicalPoint("Спуск", 152, failureCode = 155),
                RunPoint(52),
                RunPoint(53),
                RunPoint(54),
                RunPoint(161),
                TechnicalPoint("Подъём", 162, failureCode = 165),
                RunPoint(55),
                RunPoint(56),
                RunPoint(57),
                RunPoint(58),
                RunPoint(171),
                TechnicalPoint("Навеска", 172, failureCode = 175),
                RunPoint(-1, length = 3600, "000"),
            )
    )

val ChMO_25_Sprint_3 =
    Distance(
        name = "ПМО лч 24.05.25",
        orgeoEventId = "43696",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("ЮНОШИ_3", "ЮНИОРЫ_3"), "Ж" to listOf("ДЕВУШКИ_3", "ЮНИОРКИ_3")),
        points =
            listOf(
                RunPoint(101, 170),
                TechnicalPoint("Лка", 102, failureCode = 105),
                RunPoint(111, 240),
                TechnicalPoint("Навеска", 112, failureCode = 115),
                RunPoint(121, 400),
                TechnicalPoint("Подъём", 122, failureCode = 125),
                RunPoint(31),
                RunPoint(131, 600),
                TechnicalPoint("Маятник", 132, failureCode = 135),
                RunPoint(32),
                RunPoint(141, 560),
                TechnicalPoint("Бревно", 142, failureCode = 145),
                RunPoint(-1, length = 140, "000"),
            ),
        fixesSplit = listOf()
    )
