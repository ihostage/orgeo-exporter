package tourism.exporter.distance.prchr

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val ChR25Spring =
    Distance(
        name = "ЧР лч 25.08.25",
        orgeoEventId = "45073",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to listOf("МУЖЧИНЫ"), "Ж" to listOf("ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(21, 100),
                TechnicalPoint("Дом", 31, failureCode = 131),
                RunPoint(22, 150),
                TechnicalPoint("Треугольник", 32, failureCode = 132),
                RunPoint(23, 40),
                TechnicalPoint("Спуск", 33, failureCode = 133),
                RunPoint(100),
                RunPoint(24, 210),
                TechnicalPoint("Бревно", 25, failureCode = 125),
                TechnicalPoint("Подъем", 35, failureCode = 135),
                RunPoint(26, 210),
                TechnicalPoint("||ки", 36, failureCode = 136),
                RunPoint(27, 220),
                TechnicalPoint("Лка", 200, failureCode = 300),
                RunPoint(21, 300),
                TechnicalPoint("Дом 2", 31, failureCode = 131),
                RunPoint(-1, length = 60, "000"),
            ),
        fixesSplit = listOf(
            "Жаркова Екатерина" to "00:00:10|21|00:02:23|31|00:00:55|22|00:02:44|32|00:00:12|23|00:01:11|33|00:00:34|100|00:00:15|24|00:01:07|25|00:02:05|35|00:00:56|26|00:03:43|36|00:01:31|27|00:02:09|200|00:01:37|21|00:02:49|31|"
        )
    )

val ChR25PairSpring =
    Distance(
        name = "ЧР св сп 26.08.25",
        orgeoEventId = "45073",
        orgeoSubId = "6",
        orgeoCategories = listOf("М" to listOf("МУЖЧИНЫ"), "Ж" to listOf("ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(21, 100),
                TechnicalPoint("Дом", 31, failureCode = 131),
                RunPoint(22, 130),
                TechnicalPoint("Треугольник", 32, failureCode = 132),
                RunPoint(100),
                RunPoint(24, 100),
                TechnicalPoint("Бревно", 25, failureCode = 125),
                TechnicalPoint("Подъем", 35, failureCode = 135),
                RunPoint(26, 210),
                TechnicalPoint("||ки", 36, failureCode = 136),
                RunPoint(27, 220),
                TechnicalPoint("Лка", 200, failureCode = 300),
                RunPoint(21, 300),
                TechnicalPoint("Дом 2", 31, failureCode = 131),
                RunPoint(-1, length = 60, "000"),
            )
    )

val ChR25PairM =
    Distance(
        name = "ЧР св дл М 27.08.25",
        orgeoEventId = "45073",
        orgeoSubId = "8",
        orgeoCategories = listOf("М" to listOf("МУЖЧИНЫ")),
        points =
            listOf(
                RunPoint(21),
                TechnicalPoint("Дом", 31, failureCode = 131),
                RunPoint(27),
                TechnicalPoint("Лка", 37, failureCode = 137),
                RunPoint(51),
                RunPoint(52),
                RunPoint(28),
                TechnicalPoint("2xСпуск", 38, failureCode = 132),
                RunPoint(55),
                RunPoint(56),
                RunPoint(57),
                RunPoint(26),
                TechnicalPoint("||ки", 36, failureCode = 136),
                RunPoint(27),
                TechnicalPoint("Лка", 37, failureCode = 137),
                RunPoint(58),
                RunPoint(63),
                RunPoint(29),
                TechnicalPoint("Подъем", 39, failureCode = 139),
                RunPoint(59),
                RunPoint(62),
                RunPoint(65),
                RunPoint(67),
                RunPoint(69),
                RunPoint(70),
                RunPoint(72),
                RunPoint(73),
                RunPoint(30),
                TechnicalPoint("Спуск", 40, failureCode = 140),
                RunPoint(74),
                RunPoint(77),
                RunPoint(75),
                RunPoint(57),
                RunPoint(76),
                RunPoint(24),
                TechnicalPoint("Бревно", 34, failureCode = 134),
                RunPoint(22),
                TechnicalPoint("Треугольник", 32, failureCode = 132),
                RunPoint(-1, length = 10200, "000"),
            )
    )

val ChR25PairW =
    Distance(
        name = "ЧР св дл Ж 27.08.25",
        orgeoEventId = "45073",
        orgeoSubId = "8",
        orgeoCategories = listOf("Ж" to listOf("ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(21),
                TechnicalPoint("Дом", 31, failureCode = 131),
                RunPoint(27),
                TechnicalPoint("Лка", 37, failureCode = 137),
                RunPoint(54),
                RunPoint(28),
                TechnicalPoint("2xСпуск", 38, failureCode = 132),
                RunPoint(78),
                RunPoint(57),
                RunPoint(26),
                TechnicalPoint("||ки", 36, failureCode = 136),
                RunPoint(27),
                TechnicalPoint("Лка", 37, failureCode = 137),
                RunPoint(60),
                RunPoint(63),
                RunPoint(29),
                TechnicalPoint("Подъем", 39, failureCode = 139),
                RunPoint(61),
                RunPoint(64),
                RunPoint(66),
                RunPoint(68),
                RunPoint(71),
                RunPoint(73),
                RunPoint(30),
                TechnicalPoint("Спуск", 40, failureCode = 140),
                RunPoint(74),
                RunPoint(75),
                RunPoint(57),
                RunPoint(76),
                RunPoint(24),
                TechnicalPoint("Бревно", 34, failureCode = 134),
                RunPoint(22),
                TechnicalPoint("Треугольник", 32, failureCode = 132),
                RunPoint(-1, length = 8700, "000"),
            )
    )

val ChR25GroupM =
    Distance(
        name = "ЧР гр М 28.08.25",
        orgeoEventId = "45073",
        orgeoSubId = "9",
        orgeoCategories = listOf("М" to listOf("МУЖЧИНЫ")),
        points =
            listOf(
                RunPoint(21),
                TechnicalPoint("Дом", 31, failureCode = 131),
                RunPoint(27),
                TechnicalPoint("Лка", 37, failureCode = 137),
                RunPoint(31),
                TechnicalPoint("Навеска", 41, failureCode = 141),
                RunPoint(86),
                RunPoint(85),
                RunPoint(84),
                RunPoint(83),
                RunPoint(82),
                RunPoint(87),
                RunPoint(28),
                TechnicalPoint("2xСпуск", 38, failureCode = 108),
                RunPoint(88),
                RunPoint(26),
                TechnicalPoint("||ки", 36, failureCode = 136),
                RunPoint(27),
                TechnicalPoint("Лка", 37, failureCode = 137),
                RunPoint(29),
                TechnicalPoint("Спуск", 39, failureCode = 139),
                RunPoint(89),
                RunPoint(91),
                RunPoint(30),
                TechnicalPoint("Подъём", 40, failureCode = 140),
                RunPoint(24),
                TechnicalPoint("Бревно", 34, failureCode = 134),
                RunPoint(22),
                TechnicalPoint("Треугольник", 32, failureCode = 132),
                RunPoint("FIN", length = 9660),
            )
    )

val ChR25GroupW =
    Distance(
        name = "ЧР гр Ж 28.08.25",
        orgeoEventId = "45073",
        orgeoSubId = "9",
        orgeoCategories = listOf("Ж" to listOf("ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(21),
                TechnicalPoint("Дом", 31, failureCode = 131),
                RunPoint(27),
                TechnicalPoint("Лка", 37, failureCode = 137),
                RunPoint(81),
                RunPoint(31),
                TechnicalPoint("Навеска", 41, failureCode = 141),
                RunPoint(90),
                RunPoint(87),
                RunPoint(28),
                TechnicalPoint("2xСпуск", 38, failureCode = 108),
                RunPoint(88),
                RunPoint(26),
                TechnicalPoint("||ки", 36, failureCode = 136),
                RunPoint(27),
                TechnicalPoint("Лка", 37, failureCode = 137),
                RunPoint(29),
                TechnicalPoint("Спуск", 39, failureCode = 139),
                RunPoint(89),
                RunPoint(91),
                RunPoint(30),
                TechnicalPoint("Подъём", 40, failureCode = 140),
                RunPoint(24),
                TechnicalPoint("Бревно", 34, failureCode = 134),
                RunPoint(22),
                TechnicalPoint("Треугольник", 32, failureCode = 132),
                RunPoint("FIN", length = 8320),
            )
    )

val PR25Spring3 =
    Distance(
        name = "ПР лч 3кл 22.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "4",
        orgeoCategories = listOf("М" to listOf("3_ЮН"), "Ж" to listOf("3_ДЕВ")),
        points =
            listOf(
                RunPoint(61, 100),
                TechnicalPoint("Лка", 71, failureCode = 101),
                RunPoint(62, 150),
                TechnicalPoint("Навеска", 72, failureCode = 102),
                RunPoint(100),
                RunPoint(64, 100),
                TechnicalPoint("Бревно", 65, failureCode = 105),
                TechnicalPoint("Подъем", 75, failureCode = 105),
                RunPoint(66, 210),
                TechnicalPoint("||ки", 76, failureCode = 106),
                RunPoint(61, 330),
                TechnicalPoint("Лка 2", 71, failureCode = 131),
                RunPoint(-1, length = 60, "000"),
            )
    )

val PR25Spring4 =
    Distance(
        name = "ПР лч 4кл 22.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "4",
        orgeoCategories = listOf("М" to listOf("4_ЮНР"), "Ж" to listOf("4_ЮНРК")),
        points =
            listOf(
                RunPoint(61, 100),
                TechnicalPoint("Лка", 71, failureCode = 101),
                RunPoint(62, 150),
                TechnicalPoint("Навеска", 72, failureCode = 102),
                RunPoint(63, 40),
                TechnicalPoint("Спуск", 73, failureCode = 133),
                RunPoint(100),
                RunPoint(64, 210),
                TechnicalPoint("Бревно", 65, failureCode = 105),
                TechnicalPoint("Подъем", 75, failureCode = 105),
                RunPoint(66, 210),
                TechnicalPoint("||ки", 76, failureCode = 106),
                RunPoint(61, 330),
                TechnicalPoint("Лка 2", 71, failureCode = 131),
                RunPoint(-1, length = 60, "000"),
            )
    )

val PR25Pair3 =
    Distance(
        name = "ПР св 3кл 21.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to listOf("м_ЮН-ДЕВ"), "Ж" to listOf("ж_ЮН-ДЕВ")),
        points =
            listOf(
                RunPoint(61, 100),
                TechnicalPoint("Лка", 71, failureCode = 101),
                RunPoint(62, 150),
                TechnicalPoint("Навеска", 72, failureCode = 102),
                RunPoint(100),
                RunPoint(64, 100),
                TechnicalPoint("Бревно", 65, failureCode = 105),
                TechnicalPoint("Подъем", 75, failureCode = 105),
                RunPoint(66, 210),
                TechnicalPoint("||ки", 76, failureCode = 106),
                RunPoint(61, 330),
                TechnicalPoint("Лка 2", 71, failureCode = 131),
                RunPoint(-1, length = 60, "000"),
            )
    )

val PR25Pair4 =
    Distance(
        name = "ПР св 4кл 21.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to listOf("м_ЮНР-ЮН"), "Ж" to listOf("ж_ЮНР-ЮН")),
        points =
            listOf(
                RunPoint(61, 100),
                TechnicalPoint("Лка", 71, failureCode = 101),
                RunPoint(62, 150),
                TechnicalPoint("Навеска", 72, failureCode = 102),
                RunPoint(63, 40),
                TechnicalPoint("Спуск", 73, failureCode = 133),
                RunPoint(100),
                RunPoint(64, 210),
                TechnicalPoint("Бревно", 65, failureCode = 105),
                TechnicalPoint("Подъем", 75, failureCode = 105),
                RunPoint(66, 210),
                TechnicalPoint("||ки", 76, failureCode = 106),
                RunPoint(61, 330),
                TechnicalPoint("Лка 2", 71, failureCode = 131),
                RunPoint(-1, length = 60, "000"),
            )
    )

val PR25Group3 =
    Distance(
        name = "ПР гр 3кл 23.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "5",
        orgeoCategories = listOf("М" to listOf("3_ЮН"), "Ж" to listOf("3_ДЕВ")),
        points =
            listOf(
                RunPoint(61),
                TechnicalPoint("Лка", 71, failureCode = 101),
                RunPoint(64),
                TechnicalPoint("Бревно", 65, failureCode = 105),
                TechnicalPoint("Подъем", 75, failureCode = 105),
                RunPoint(46),
                RunPoint(60),
                TechnicalPoint("Спуск", 70, failureCode = 100),
                RunPoint(34),
                RunPoint(35),
                RunPoint(47),
                RunPoint(68),
                TechnicalPoint("2хСпуск", 78, failureCode = 108),
                RunPoint(32),
                RunPoint(33),
                RunPoint(66),
                TechnicalPoint("||ки", 76, failureCode = 106),
                RunPoint(62),
                TechnicalPoint("Навеска", 72, failureCode = 102),
                RunPoint("FIN", length = 4500, "000"),
            )
    )

val PR25Group4M =
    Distance(
        name = "ПР гр 4кл М 23.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "5",
        orgeoCategories = listOf("М" to listOf("4_ЮНР")),
        points =
            listOf(
                RunPoint(61),
                TechnicalPoint("Дом", 71, failureCode = 101),
                RunPoint(64),
                TechnicalPoint("Бревно", 65, failureCode = 105),
                TechnicalPoint("Подъем", 75, failureCode = 105),
                RunPoint(68),
                TechnicalPoint("2хСпуск", 78, failureCode = 108),
                RunPoint(41),
                RunPoint(42),
                RunPoint(48),
                RunPoint(43),
                RunPoint(69),
                TechnicalPoint("Подъём 2", 79, failureCode = 100),
                RunPoint(50),
                RunPoint(44),
                RunPoint(45),
                RunPoint(46),
                RunPoint(60),
                TechnicalPoint("Спуск", 70, failureCode = 100),
                RunPoint(34),
                RunPoint(35),
                RunPoint(47),
                RunPoint(66),
                TechnicalPoint("||ки", 76, failureCode = 106),
                RunPoint(62),
                TechnicalPoint("Навеска", 72, failureCode = 102),
                RunPoint("FIN", length = 6800, "000"),
            )
    )

val PR25Group4W =
    Distance(
        name = "ПР гр 4кл Ж 23.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "5",
        orgeoCategories = listOf("Ж" to listOf("4_ЮНРК")),
        points =
            listOf(
                RunPoint(61),
                TechnicalPoint("Дом", 71, failureCode = 101),
                RunPoint(64),
                TechnicalPoint("Бревно", 65, failureCode = 105),
                TechnicalPoint("Подъем", 75, failureCode = 105),
                RunPoint(68),
                TechnicalPoint("2хСпуск", 78, failureCode = 108),
                RunPoint(67),
                TechnicalPoint("Подъём 2", 77, failureCode = 107),
                RunPoint(32),
                RunPoint(47),
                RunPoint(49),
                RunPoint(44),
                RunPoint(45),
                RunPoint(46),
                RunPoint(60),
                TechnicalPoint("Спуск", 70, failureCode = 100),
                RunPoint(34),
                RunPoint(35),
                RunPoint(47),
                RunPoint(66),
                TechnicalPoint("||ки", 76, failureCode = 106),
                RunPoint(62),
                TechnicalPoint("Навеска", 72, failureCode = 102),
                RunPoint("FIN", length = 5900, "000"),
            )
    )
