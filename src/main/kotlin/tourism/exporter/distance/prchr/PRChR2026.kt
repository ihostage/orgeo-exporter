package tourism.exporter.distance.prchr

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val ChR26SprintM =
    Distance(
        name = "ЧР лч М 15.08.26",
        orgeoEventId = "54015",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("мужчины")),
        points =
            listOf(
                RunPoint(101, 450),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(102, 50),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(89),
                RunPoint(103, 500),
                TechnicalPoint("Пка", 133, failureCode = 203),
                RunPoint(104, 450),
                TechnicalPoint("Спуск", 134, failureCode = 204),
                RunPoint(100),
                RunPoint(105, 710),
                TechnicalPoint("Брод", 135, failureCode = 205),
                RunPoint(89),
                RunPoint(103, 870),
                TechnicalPoint("Лка", 133, failureCode = 203),
                RunPoint("FIN", length = 130, "000"),
            ),
    )

val ChR26SprintW =
    Distance(
        name = "ЧР лч Ж 15.08.26",
        orgeoEventId = ChR26SprintM.orgeoEventId,
        orgeoSubId = "8",
        categories = listOf("Ж" to listOf("женщины")),
        points = ChR26SprintM.points,
    )

val ChR26PairShortM =
    Distance(
        name = "ЧР св кр М 16.08.26",
        orgeoEventId = ChR26SprintM.orgeoEventId,
        orgeoSubId = "3",
        categories = listOf("М" to listOf("мужчины")),
        points = ChR26SprintM.points,
    )

val ChR26PairShortW =
    Distance(
        name = "ЧР св кр Ж 16.08.26",
        orgeoEventId = ChR26SprintM.orgeoEventId,
        orgeoSubId = "4",
        categories = listOf("Ж" to listOf("женщины")),
        points = ChR26SprintM.points,
    )

val ChR26PairM =
    Distance(
        name = "ЧР св дл М 17.08.26",
        orgeoEventId = ChR26SprintM.orgeoEventId,
        orgeoSubId = "5",
        categories = listOf("М" to listOf("мужчины")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(102),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(51),
                RunPoint(52),
                RunPoint(53),
                RunPoint(106),
                TechnicalPoint("||ки", 136, failureCode = 206),
                RunPoint(55),
                RunPoint(56),
                RunPoint(57),
                RunPoint(59),
                RunPoint(136),
                TechnicalPoint("Брод", 106, failureCode = 206),
                RunPoint(60),
                RunPoint(107),
                TechnicalPoint("Бревно", 137, failureCode = 207),
                RunPoint(62),
                RunPoint(63),
                RunPoint(66),
                RunPoint(67),
                RunPoint(63),
                RunPoint(64),
                RunPoint(65),
                RunPoint(63),
                RunPoint(69),
                RunPoint(70),
                RunPoint(71),
                RunPoint(72),
                RunPoint(100),
                RunPoint(105),
                TechnicalPoint("Лка", 135, failureCode = 205),
                RunPoint(73),
                RunPoint(104),
                TechnicalPoint("Подъем", 134, failureCode = 204),
                RunPoint(89),
                RunPoint(103),
                TechnicalPoint("Пка", 133, failureCode = 203),
                RunPoint("FIN", length = 11300, "000"),
            ),
        seeding = listOf(listOf(64, 65).map { it.toString() } to listOf(66, 67).map { it.toString() }),
    )

val ChR26PairW =
    Distance(
        name = "ЧР св дл Ж 17.08.26",
        orgeoEventId = ChR26SprintM.orgeoEventId,
        orgeoSubId = "5",
        categories = listOf("Ж" to listOf("женщины")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(102),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(61),
                RunPoint(106),
                TechnicalPoint("||ки", 136, failureCode = 206),
                RunPoint(54),
                RunPoint(57),
                RunPoint(59),
                RunPoint(136),
                TechnicalPoint("Брод", 106, failureCode = 206),
                RunPoint(60),
                RunPoint(107),
                TechnicalPoint("Бревно", 137, failureCode = 207),
                RunPoint(66),
                RunPoint(64),
                RunPoint(70),
                RunPoint(68),
                RunPoint(62),
                RunPoint(100),
                RunPoint(105),
                TechnicalPoint("Лка", 135, failureCode = 205),
                RunPoint(73),
                RunPoint(104),
                TechnicalPoint("Подъем", 134, failureCode = 204),
                RunPoint(89),
                RunPoint(103),
                TechnicalPoint("Пка", 133, failureCode = 203),
                RunPoint("FIN", length = 8100, "000"),
            ),
    )

val ChR26GroupM =
    Distance(
        name = "ЧР гр М 18.08.26",
        orgeoEventId = ChR26SprintM.orgeoEventId,
        orgeoSubId = "9",
        categories = listOf("М" to listOf("мужчины")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(102),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(41),
                RunPoint(105),
                TechnicalPoint("Лка", 100, failureCode = 205),
                RunPoint(40),
                RunPoint(32),
                RunPoint(108),
                TechnicalPoint("Дл навеска", 138, failureCode = 208),
                RunPoint(33),
                RunPoint(34),
                RunPoint(35),
                RunPoint(45),
                RunPoint(136),
                TechnicalPoint("||ки", 136, failureCode = 206),
                RunPoint(36),
                RunPoint(37),
                RunPoint(38),
                RunPoint(32),
                RunPoint(39),
                RunPoint(43),
                RunPoint(44),
                RunPoint(107),
                TechnicalPoint("Бревно", 137, failureCode = 207),
                RunPoint(100),
                TechnicalPoint("Брод", 105, failureCode = 205),
                RunPoint(104),
                TechnicalPoint("Подъем", 134, failureCode = 204),
                RunPoint(90),
                RunPoint(103),
                TechnicalPoint("Пка", 133, failureCode = 203),
                RunPoint("FIN", length = 12700, "000"),
            ),
    )

val ChR26GroupW =
    Distance(
        name = "ЧР гр Ж 18.08.26",
        orgeoEventId = ChR26SprintM.orgeoEventId,
        orgeoSubId = "9",
        categories = listOf("Ж" to listOf("женщины")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(102),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(41),
                RunPoint(105),
                TechnicalPoint("Лка", 100, failureCode = 205),
                RunPoint(40),
                RunPoint(32),
                RunPoint(36),
                RunPoint(37),
                RunPoint(38),
                RunPoint(31),
                RunPoint(108),
                TechnicalPoint("Дл навеска", 138, failureCode = 208),
                RunPoint(33),
                RunPoint(42),
                RunPoint(35),
                RunPoint(136),
                TechnicalPoint("||ки", 136, failureCode = 206),
                RunPoint(43),
                RunPoint(44),
                RunPoint(107),
                TechnicalPoint("Бревно", 137, failureCode = 207),
                RunPoint(100),
                TechnicalPoint("Брод", 105, failureCode = 205),
                RunPoint(104),
                TechnicalPoint("Подъем", 134, failureCode = 204),
                RunPoint(90),
                RunPoint(103),
                TechnicalPoint("Пка", 133, failureCode = 203),
                RunPoint("FIN", length = 10900, "000"),
            ),
    )

val PR26Spring3 =
    Distance(
        name = "ПР лч 3кл 22.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "4",
        categories = listOf("М" to listOf("3_ЮН"), "Ж" to listOf("3_ДЕВ")),
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
            ),
    )

val PR26Spring4 =
    Distance(
        name = "ПР лч 4кл 22.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "4",
        categories = listOf("М" to listOf("4_ЮНР"), "Ж" to listOf("4_ЮНРК")),
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
            ),
    )

val PR26Pair3 =
    Distance(
        name = "ПР св 3кл 21.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("м_ЮН-ДЕВ"), "Ж" to listOf("ж_ЮН-ДЕВ")),
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
            ),
    )

val PR26Pair4 =
    Distance(
        name = "ПР св 4кл 21.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("м_ЮНР-ЮН"), "Ж" to listOf("ж_ЮНР-ЮН")),
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
            ),
    )

val PR26Group3 =
    Distance(
        name = "ПР гр 3кл 23.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "5",
        categories = listOf("М" to listOf("3_ЮН"), "Ж" to listOf("3_ДЕВ")),
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
            ),
    )

val PR26Group4M =
    Distance(
        name = "ПР гр 4кл М 23.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "5",
        categories = listOf("М" to listOf("4_ЮНР")),
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
            ),
    )

val PR26Group4W =
    Distance(
        name = "ПР гр 4кл Ж 23.08.25",
        orgeoEventId = "45072",
        orgeoSubId = "5",
        categories = listOf("Ж" to listOf("4_ЮНРК")),
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
            ),
    )
