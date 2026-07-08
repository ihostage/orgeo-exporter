package tourism.exporter.distance.kk

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val KK26Pair =
    Distance(
        name = "КК св 03.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(101, 240),
                TechnicalPoint("Дом", 102, failureCode = 205),
                TechnicalPoint("IIки", 132, failureCode = 232),
                RunPoint(103, 180),
                TechnicalPoint("Лка", 133, failureCode = 233),
                RunPoint(104, 390),
                TechnicalPoint("Бревно", 134, failureCode = 234),
                RunPoint(105, 240),
                TechnicalPoint("Маятник I", 135, failureCode = 235),
                RunPoint(106, 710),
                TechnicalPoint("Маятник II", 136, failureCode = 236),
                RunPoint("FIN", length = 230, "000"),
            ),
    )

val KK26Short =
    Distance(
        name = "КК лч кор 04.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(101, 240),
                TechnicalPoint("Дом", 102, failureCode = 205),
                TechnicalPoint("IIки", 132, failureCode = 232),
                RunPoint(103, 180),
                TechnicalPoint("Лка", 133, failureCode = 233),
                RunPoint(104, 390),
                TechnicalPoint("Бревно", 134, failureCode = 234),
                RunPoint(105, 240),
                TechnicalPoint("Маятник I", 135, failureCode = 235),
                RunPoint(106, 710),
                TechnicalPoint("Маятник II", 136, failureCode = 236),
                RunPoint("FIN", length = 230, "000"),
            ),
    )

val KK26LongM =
    Distance(
        name = "КК лч дл М 05.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "4",
        categories = listOf("М" to listOf("5_мужчины")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 102, failureCode = 205),
                TechnicalPoint("IIки", 132, failureCode = 232),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 235),
                RunPoint(51),
                RunPoint(66),
                RunPoint(52),
                RunPoint(53),
                RunPoint(66),
                RunPoint(54),
                RunPoint(55),
                RunPoint(66),
                RunPoint(56),
                RunPoint(57),
                RunPoint(40),
                RunPoint(103),
                TechnicalPoint("Лка", 133, failureCode = 233),
                RunPoint(58),
                RunPoint(59),
                RunPoint(60),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 234),
                RunPoint(40),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 236),
                RunPoint("FIN", length = 8800, "000"),
            ),
        seeding = listOf(listOf(54, 55).map { it.toString() } to listOf(52, 53).map { it.toString() }),
    )

val KK26LongW =
    Distance(
        name = "КК лч дл Ж 05.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "4",
        categories = listOf("Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 102, failureCode = 205),
                TechnicalPoint("IIки", 132, failureCode = 232),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 235),
                RunPoint(65),
                RunPoint(64),
                RunPoint(55),
                RunPoint(67),
                RunPoint(64),
                RunPoint(68),
                RunPoint(69),
                RunPoint(64),
                RunPoint(62),
                RunPoint(57),
                RunPoint(40),
                RunPoint(103),
                TechnicalPoint("Лка", 133, failureCode = 233),
                RunPoint(58),
                RunPoint(63),
                RunPoint(61),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 234),
                RunPoint(40),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 236),
                RunPoint("FIN", length = 7400, "000"),
            ),
        seeding = listOf(listOf(68, 69).map { it.toString() } to listOf(55, 67).map { it.toString() }),
    )

val KK26GroupM =
    Distance(
        name = "КК гр дл М 06.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "5",
        categories = listOf("М" to listOf("5_мужчины")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(86),
                RunPoint(85),
                RunPoint(84),
                RunPoint(107),
                TechnicalPoint("Навеска I", 137, failureCode = 207),
                RunPoint(83),
                RunPoint(100),
                RunPoint(49),
                RunPoint(43),
                RunPoint(42),
                RunPoint(41),
                RunPoint(109),
                TechnicalPoint("Навеска II", 139, failureCode = 209),
                RunPoint(108),
                TechnicalPoint("Брод", 138, failureCode = 208),
                RunPoint(70),
                RunPoint(102),
                TechnicalPoint("IIки", 132, failureCode = 202),
                RunPoint(103),
                TechnicalPoint("П-ка", 133, failureCode = 203),
                RunPoint(92),
                RunPoint(96),
                RunPoint(97),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 12500, "000"),
            ),
    )

val KK26GroupW =
    Distance(
        name = "КК гр дл Ж 06.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "5",
        categories = listOf("М" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(86),
                RunPoint(85),
                RunPoint(84),
                RunPoint(107),
                TechnicalPoint("Навеска I", 137, failureCode = 207),
                RunPoint(83),
                RunPoint(100),
                RunPoint(45),
                RunPoint(46),
                RunPoint(108),
                TechnicalPoint("Брод", 138, failureCode = 208),
                RunPoint(102),
                TechnicalPoint("IIки", 132, failureCode = 202),
                RunPoint(103),
                TechnicalPoint("П-ка", 133, failureCode = 203),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(98),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 9400, "000"),
            ),
    )

val KK26Pair4 =
    Distance(
        name = "КК св 4кл 03.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("4_юниоры"), "Ж" to listOf("4_юниорки")),
        points =
            listOf(
                RunPoint(101, 240),
                TechnicalPoint("Дом", 102, failureCode = 201),
                TechnicalPoint("IIки", 132, failureCode = 202),
                RunPoint(103, 180),
                TechnicalPoint("Лка", 133, failureCode = 203),
                RunPoint(104, 390),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105, 240),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106, 710),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 230, "000"),
            ),
    )

val KK26Short4 =
    Distance(
        name = "КК лч кр 4кл 04.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("4_юниоры"), "Ж" to listOf("4_юниорки")),
        points =
            listOf(
                RunPoint(101, 240),
                TechnicalPoint("Дом", 102, failureCode = 201),
                TechnicalPoint("IIки", 132, failureCode = 202),
                RunPoint(103, 180),
                TechnicalPoint("Лка", 133, failureCode = 203),
                RunPoint(104, 390),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105, 240),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106, 710),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 230, "000"),
            ),
    )

val KK26Long4M =
    Distance(
        name = "КК лч дл 4кл М 05.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "4",
        categories = listOf("М" to listOf("4_юниоры")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 102, failureCode = 201),
                TechnicalPoint("IIки", 132, failureCode = 202),
                RunPoint(103),
                TechnicalPoint("Лка", 133, failureCode = 203),
                RunPoint(71),
                RunPoint(72),
                RunPoint(73),
                RunPoint(74),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(75),
                RunPoint(76),
                RunPoint(77),
                RunPoint(78),
                RunPoint(79),
                RunPoint(40),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 6100, "000"),
            ),
    )

val KK26Long4W =
    Distance(
        name = "КК лч дл 4кл Ж 05.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "4",
        categories = listOf("М" to listOf("4_юниорки")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 102, failureCode = 201),
                TechnicalPoint("IIки", 132, failureCode = 202),
                RunPoint(103),
                TechnicalPoint("Лка", 133, failureCode = 203),
                RunPoint(71),
                RunPoint(72),
                RunPoint(80),
                RunPoint(74),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(81),
                RunPoint(76),
                RunPoint(77),
                RunPoint(74),
                RunPoint(78),
                RunPoint(79),
                RunPoint(40),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 6000, "000"),
            ),
    )

val KK26Group4M =
    Distance(
        name = "КК гр дл 4кл М 06.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "5",
        categories = listOf("М" to listOf("4_юниоры")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(86),
                RunPoint(85),
                RunPoint(84),
                RunPoint(107),
                TechnicalPoint("Навеска I", 137, failureCode = 207),
                RunPoint(83),
                RunPoint(100),
                RunPoint(49),
                RunPoint(48),
                RunPoint(47),
                RunPoint(108),
                TechnicalPoint("Брод", 138, failureCode = 208),
                RunPoint(91),
                RunPoint(103),
                TechnicalPoint("Л-ка", 133, failureCode = 203),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(98),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 9000, "000"),
            ),
    )

val KK26Group4W =
    Distance(
        name = "КК гр дл 4кл Ж 06.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "5",
        categories = listOf("Ж" to listOf("4_юниорки")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(86),
                RunPoint(85),
                RunPoint(84),
                RunPoint(107),
                TechnicalPoint("Навеска I", 137, failureCode = 207),
                RunPoint(83),
                RunPoint(100),
                RunPoint(48),
                RunPoint(47),
                RunPoint(108),
                TechnicalPoint("Брод", 138, failureCode = 208),
                RunPoint(91),
                RunPoint(103),
                TechnicalPoint("Л-ка", 133, failureCode = 203),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 8600, "000"),
            ),
    )

val KK26Pair3 =
    Distance(
        name = "КК св 3кл 03.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("3_юноши"), "Ж" to listOf("3_девушки")),
        points =
            listOf(
                RunPoint(101, 240),
                TechnicalPoint("Лка", 102, failureCode = 201),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(104, 580),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105, 240),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106, 710),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 230, "000"),
            ),
    )

val KK26Short3 =
    Distance(
        name = "КК лч кр 3кл 04.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("3_юноши"), "Ж" to listOf("3_девушки")),
        points =
            listOf(
                RunPoint(101, 240),
                TechnicalPoint("Лка", 102, failureCode = 201),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(104, 580),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105, 240),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106, 710),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 230, "000"),
            ),
    )

val KK26Long3M =
    Distance(
        name = "КК лч дл 3кл М 05.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "4",
        categories = listOf("М" to listOf("3_юноши")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Лка", 102, failureCode = 201),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(31),
                RunPoint(32),
                RunPoint(33),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(34),
                RunPoint(35),
                RunPoint(36),
                RunPoint(37),
                RunPoint(38),
                RunPoint(40),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 5500, "000"),
            ),
    )

val KK26Long3W =
    Distance(
        name = "КК лч дл 3кл Ж 05.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "4",
        categories = listOf("Ж" to listOf("3_девушки")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Лка", 102, failureCode = 201),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(31),
                RunPoint(37),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(39),
                RunPoint(35),
                RunPoint(33),
                RunPoint(38),
                RunPoint(40),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 5000, "000"),
            ),
    )

val KK26Group3M =
    Distance(
        name = "КК гр дл 3кл М 06.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "5",
        categories = listOf("М" to listOf("3_юноши")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(94),
                RunPoint(92),
                RunPoint(95),
                RunPoint(89),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(98),
                RunPoint(88),
                RunPoint(90),
                RunPoint(99),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 5200, "000"),
            ),
    )

val KK26Group3W =
    Distance(
        name = "КК гр дл 3кл Ж 06.07.26",
        orgeoEventId = "53934",
        orgeoSubId = "5",
        categories = listOf("Ж" to listOf("3_девушки")),
        points =
            listOf(
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                TechnicalPoint("Навеска", 132, failureCode = 202),
                RunPoint(94),
                RunPoint(104),
                TechnicalPoint("Бревно", 134, failureCode = 204),
                RunPoint(92),
                RunPoint(89),
                RunPoint(87),
                RunPoint(93),
                RunPoint(90),
                RunPoint(99),
                RunPoint(105),
                TechnicalPoint("Маятник I", 135, failureCode = 205),
                RunPoint(106),
                TechnicalPoint("Маятник II", 136, failureCode = 206),
                RunPoint("FIN", length = 5000, "000"),
            ),
    )
