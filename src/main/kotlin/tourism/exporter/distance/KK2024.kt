package tourism.exporter.distance

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val KK24Pair =
    Distance(
        name = "КК св 04.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(101, 360),
                TechnicalPoint("Дом", 131, failureCode = 249),
                RunPoint(102, 315),
                TechnicalPoint("Лка", 132, failureCode = 249),
                RunPoint(202),
                RunPoint(103, 715),
                TechnicalPoint("IIки", 133, failureCode = 249),
                RunPoint(104, 50),
                TechnicalPoint("Спуск 1", 134, failureCode = 249),
                RunPoint(203),
                RunPoint(105, 1260),
                TechnicalPoint("Маятник", 135, failureCode = 249),
                RunPoint(106, 550),
                TechnicalPoint("Треугольник", 136, failureCode = 249),
                RunPoint(107, 40),
                TechnicalPoint("Спуск 2", 137, failureCode = 249),
                RunPoint(-1, length = 330, "000"),
            ),
    )

val KK24Pair4 =
    Distance(
        name = "КК св 4кл 04.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("4_юниоры"), "Ж" to listOf("4_юниорки")),
        points =
            listOf(
                RunPoint(101, 360),
                TechnicalPoint("Дом", 131, failureCode = 161),
                RunPoint(102, 315),
                TechnicalPoint("Лка", 132, failureCode = 162),
                RunPoint(202),
                RunPoint(103, 715),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(104, 50),
                TechnicalPoint("Спуск 1", 134, failureCode = 164),
                RunPoint(105, 605),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(106, 575),
                TechnicalPoint("Навеска", 136, failureCode = 166),
                RunPoint(107, 40),
                TechnicalPoint("Спуск 2", 137, failureCode = 167),
                RunPoint(-1, length = 330, "000"),
            ),
    )

val KK24Pair3 =
    Distance(
        name = "КК св 3кл 04.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("3_юноши"), "Ж" to listOf("3_девушки")),
        points =
            listOf(
                RunPoint(101, 360),
                TechnicalPoint("2xНавеска", 131, failureCode = 161),
                RunPoint(202),
                RunPoint(103, 1045),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(104, 50),
                TechnicalPoint("Спуск 1", 134, failureCode = 164),
                RunPoint(105, 605),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(106, 550),
                TechnicalPoint("Навеска", 136, failureCode = 166),
                RunPoint(107, 40),
                TechnicalPoint("Спуск 2", 137, failureCode = 167),
                RunPoint(-1, length = 330, "000"),
            ),
    )

val KK24Short =
    Distance(
        name = "КК лич кор 05.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(101, 360),
                TechnicalPoint("Дом", 131, failureCode = 161),
                RunPoint(102, 315),
                TechnicalPoint("Лка", 132, failureCode = 162),
                RunPoint(202),
                RunPoint(103, 715),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(104, 50),
                TechnicalPoint("Спуск 1", 134, failureCode = 164),
                RunPoint(203),
                RunPoint(105, 1260),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(106, 550),
                TechnicalPoint("Треугольник", 136, failureCode = 166),
                RunPoint(107, 40),
                TechnicalPoint("Спуск 2", 137, failureCode = 167),
                RunPoint(-1, length = 330, "000"),
            ),
    )

val KK24Short4 =
    Distance(
        name = "КК лич кор 4кл 05.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("4_юниоры"), "Ж" to listOf("4_юниорки")),
        points =
            listOf(
                RunPoint(101, 360),
                TechnicalPoint("Дом", 131, failureCode = 161),
                RunPoint(102, 315),
                TechnicalPoint("Лка", 132, failureCode = 162),
                RunPoint(202),
                RunPoint(103, 715),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(104, 50),
                TechnicalPoint("Спуск 1", 134, failureCode = 164),
                RunPoint(105, 605),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(106, 575),
                TechnicalPoint("Навеска", 136, failureCode = 166),
                RunPoint(107, 40),
                TechnicalPoint("Спуск 2", 137, failureCode = 167),
                RunPoint(-1, length = 330, "000"),
            ),
    )

val KK24Short3 =
    Distance(
        name = "КК лич кор 3кл 05.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("3_юноши"), "Ж" to listOf("3_девушки")),
        points =
            listOf(
                RunPoint(101, 360),
                TechnicalPoint("Навеска-Навеска", 131, failureCode = 161),
                RunPoint(202),
                RunPoint(103, 1045),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(104, 50),
                TechnicalPoint("Спуск 1", 134, failureCode = 164),
                RunPoint(105, 605),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(106, 550),
                TechnicalPoint("Навеска", 136, failureCode = 166),
                RunPoint(107, 40),
                TechnicalPoint("Спуск 2", 137, failureCode = 167),
                RunPoint(-1, length = 330, "000"),
            ),
    )

val KK24LongM =
    Distance(
        name = "КК лич дл М 06.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to listOf("5_мужчины")),
        points =
            listOf(
                RunPoint(100),
                RunPoint(105),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(49),
                RunPoint(108),
                TechnicalPoint("Бревно I", 138, failureCode = 168),
                RunPoint(77),
                RunPoint(109),
                TechnicalPoint("Бревно II", 139, failureCode = 169),
                RunPoint(71),
                RunPoint(72),
                RunPoint(75),
                RunPoint(31),
                RunPoint(110),
                TechnicalPoint("Обр. треугольник", 140, failureCode = 170),
                RunPoint(35),
                RunPoint(32),
                RunPoint(103),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(40),
                RunPoint(43),
                RunPoint(42),
                RunPoint(249),
                TechnicalPoint("Треугольник", 136, failureCode = 166),
                RunPoint(45),
                RunPoint(47),
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 161),
                RunPoint(70),
                RunPoint(-1, length = 10700, "000"),
            ),
    )

val KK24LongW =
    Distance(
        name = "КК лич дл Ж 06.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "3",
        orgeoCategories = listOf("Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(100),
                RunPoint(105),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(108),
                TechnicalPoint("Бревно I", 138, failureCode = 168),
                RunPoint(76),
                RunPoint(109),
                TechnicalPoint("Бревно II", 139, failureCode = 169),
                RunPoint(73),
                RunPoint(74),
                RunPoint(79),
                RunPoint(110),
                TechnicalPoint("Обр. треугольник", 140, failureCode = 170),
                RunPoint(31),
                RunPoint(103),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(40),
                RunPoint(249),
                TechnicalPoint("Треугольник", 136, failureCode = 166),
                RunPoint(46),
                RunPoint(48),
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 161),
                RunPoint(70),
                RunPoint(-1, length = 8100, "000"),
            ),
    )

val KK24LongM3 =
    Distance(
        name = "КК лич дл М 3кл 06.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to listOf("3_юноши")),
        points =
            listOf(
                RunPoint(100),
                RunPoint(38),
                RunPoint(110),
                TechnicalPoint("Спуск", 140, failureCode = 170),
                RunPoint(36),
                RunPoint(33),
                RunPoint(31),
                RunPoint(103),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(105),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(40),
                RunPoint(43),
                RunPoint(42),
                RunPoint(249),
                TechnicalPoint("Навеска", 136, failureCode = 166),
                RunPoint(45),
                RunPoint(47),
                RunPoint(101),
                TechnicalPoint("2xНавеска", 131, failureCode = 161),
                RunPoint(70),
                RunPoint(name = "000", code = -1, length = 6000),
            ),
        fixesSplit = listOf(
            "Власов Денис" to "00:00:26|100|00:02:23|38|00:05:33|110|00:01:08|140|00:03:58|36|00:02:59|33|00:04:26|31|00:01:34|103|00:03:01|133|00:03:07|105|00:00:21|135|00:01:03|40|00:02:21|43|00:02:43|42|00:02:26|249|00:00:18|136|00:02:47|45|00:05:34|47|00:00:47|101|00:01:58|131|00:00:59|70|"
        )
    )

val KK24LongW3 =
    Distance(
        name = "КК лич дл Ж 3кл 06.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "3",
        orgeoCategories = listOf("Ж" to listOf("3_девушки")),
        points =
            listOf(
                RunPoint(100),
                RunPoint(110),
                TechnicalPoint("Спуск", 140, failureCode = 170),
                RunPoint(37),
                RunPoint(34),
                RunPoint(32),
                RunPoint(103),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(105),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(40),
                RunPoint(44),
                RunPoint(41),
                RunPoint(249),
                TechnicalPoint("Навеска", 136, failureCode = 166),
                RunPoint(46),
                RunPoint(48),
                RunPoint(101),
                TechnicalPoint("2xНавеска", 131, failureCode = 161),
                RunPoint(70),
                RunPoint(name = "000", code = -1, length = 5300),
            ),
    )

val KK24LongM4 =
    Distance(
        name = "КК лич дл М 4кл 06.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to listOf("4_юниоры")),
        points =
        listOf(
            RunPoint(100),
            RunPoint(105),
            TechnicalPoint("Маятник", 135, failureCode = 165),
            RunPoint(49),
            RunPoint(108),
            TechnicalPoint("Бревно I", 138, failureCode = 168),
            RunPoint(74),
            RunPoint(72),
            RunPoint(71),
            RunPoint(109),
            TechnicalPoint("Бревно II", 139, failureCode = 169),
            RunPoint(110),
            TechnicalPoint("Спуск", 140, failureCode = 170),
            RunPoint(38),
            RunPoint(103),
            TechnicalPoint("IIки", 133, failureCode = 163),
            RunPoint(40),
            RunPoint(44),
            RunPoint(41),
            RunPoint(249),
            TechnicalPoint("Навеска", 136, failureCode = 166),
            RunPoint(45),
            RunPoint(48),
            RunPoint(101),
            TechnicalPoint("Дом", 131, failureCode = 161),
            RunPoint(70),
            RunPoint(-1, length = 8800, "000"),
        ),
    )

val KK24LongW4 =
    Distance(
        name = "КК лич дл Ж 4кл 06.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "3",
        orgeoCategories = listOf("Ж" to listOf("4_юниорки")),
        points =
        listOf(
            RunPoint(100),
            RunPoint(105),
            TechnicalPoint("Маятник", 135, failureCode = 165),
            RunPoint(108),
            TechnicalPoint("Бревно I", 138, failureCode = 168),
            RunPoint(76),
            RunPoint(73),
            RunPoint(109),
            TechnicalPoint("Бревно II", 139, failureCode = 169),
            RunPoint(78),
            RunPoint(110),
            TechnicalPoint("Спуск", 140, failureCode = 170),
            RunPoint(103),
            TechnicalPoint("IIки", 133, failureCode = 163),
            RunPoint(40),
            RunPoint(249),
            TechnicalPoint("Навеска", 136, failureCode = 166),
            RunPoint(46),
            RunPoint(101),
            TechnicalPoint("Дом", 131, failureCode = 161),
            RunPoint(70),
            RunPoint(-1, length = 7800, "000"),
        ),
    )

val KK24TeamM =
    Distance(
        name = "КК гр М 07.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "4",
        orgeoCategories = listOf("М" to listOf("5_мужчины")),
        points =
            listOf(
                RunPoint(100),
                RunPoint(110),
                TechnicalPoint("Обр. треугольник", 140, failureCode = 170),
                RunPoint(59),
                RunPoint(109),
                TechnicalPoint("Бревно", 139, failureCode = 169),
                RunPoint(57),
                RunPoint(111),
                TechnicalPoint("Навеска", 141, failureCode = 171),
                RunPoint(53),
                RunPoint(54),
                RunPoint(55),
                RunPoint(106),
                TechnicalPoint("Треугольник", 136, failureCode = 166),
                RunPoint(105),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 161),
                RunPoint(50),
                RunPoint(60),
                RunPoint(64),
                RunPoint(63),
                RunPoint(103),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(name = "000", code = -1, length = 11000),
            ),
    )

val KK24TeamW =
    Distance(
        name = "КК гр Ж 07.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "4",
        orgeoCategories = listOf("Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(100),
                RunPoint(110),
                TechnicalPoint("Обр. треугольник", 140, failureCode = 170),
                RunPoint(58),
                RunPoint(109),
                TechnicalPoint("Бревно", 139, failureCode = 169),
                RunPoint(111),
                TechnicalPoint("Навеска", 141, failureCode = 171),
                RunPoint(56),
                RunPoint(49),
                RunPoint(106),
                TechnicalPoint("Треугольник", 136, failureCode = 166),
                RunPoint(105),
                TechnicalPoint("Маятник", 135, failureCode = 165),
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 161),
                RunPoint(69),
                RunPoint(63),
                RunPoint(64),
                RunPoint(103),
                TechnicalPoint("IIки", 133, failureCode = 163),
                RunPoint(name = "000", code = -1, length = 8100),
            ),
    )

val KK24TeamM4 =
    Distance(
        name = "КК гр М 4кл 07.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "4",
        orgeoCategories = listOf("М" to listOf("4_юниоры")),
        points =
        listOf(
            RunPoint(100),
            RunPoint(110),
            TechnicalPoint("Спуск", 140, failureCode = 170),
            RunPoint(59),
            RunPoint(58),
            RunPoint(109),
            TechnicalPoint("Бревно", 139, failureCode = 169),
            RunPoint(111),
            TechnicalPoint("Навеска", 141, failureCode = 171),
            RunPoint(51),
            RunPoint(52),
            RunPoint(106),
            TechnicalPoint("Треугольник", 136, failureCode = 166),
            RunPoint(105),
            TechnicalPoint("Маятник", 135, failureCode = 165),
            RunPoint(101),
            TechnicalPoint("Лка", 131, failureCode = 161),
            RunPoint(67),
            RunPoint(69),
            RunPoint(103),
            TechnicalPoint("IIки", 133, failureCode = 163),
            RunPoint(name = "000", code = -1, length = 8400),
        ),
    )

val KK24TeamW4 =
    Distance(
        name = "КК гр Ж 4кл 07.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "4",
        orgeoCategories = listOf("Ж" to listOf("4_юниорки")),
        points =
        listOf(
            RunPoint(100),
            RunPoint(110),
            TechnicalPoint("Спуск", 140, failureCode = 170),
            RunPoint(109),
            TechnicalPoint("Бревно", 139, failureCode = 169),
            RunPoint(57),
            RunPoint(56),
            RunPoint(49),
            RunPoint(106),
            TechnicalPoint("Треугольник", 136, failureCode = 166),
            RunPoint(105),
            TechnicalPoint("Маятник", 135, failureCode = 165),
            RunPoint(101),
            TechnicalPoint("Лка", 131, failureCode = 161),
            RunPoint(50),
            RunPoint(103),
            TechnicalPoint("IIки", 133, failureCode = 163),
            RunPoint(name = "000", code = -1, length = 6700),
        ),
    )

val KK24TeamM3 =
    Distance(
        name = "КК гр М 3кл 07.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "4",
        orgeoCategories = listOf("М" to listOf("3_юноши")),
        points =
        listOf(
            RunPoint(100),
            RunPoint(65),
            RunPoint(110),
            TechnicalPoint("Спуск", 140, failureCode = 170),
            RunPoint(62),
            RunPoint(65),
            RunPoint(106),
            TechnicalPoint("Навеска", 136, failureCode = 166),
            RunPoint(105),
            TechnicalPoint("Маятник", 135, failureCode = 165),
            RunPoint(65),
            RunPoint(60),
            RunPoint(101),
            TechnicalPoint("Лка", 131, failureCode = 161),
            RunPoint(67),
            RunPoint(69),
            RunPoint(103),
            TechnicalPoint("IIки", 133, failureCode = 163),
            RunPoint(name = "000", code = -1, length = 6500),
        ),
    )

val KK24TeamW3 =
    Distance(
        name = "КК гр Ж 3кл 07.07.24",
        orgeoEventId = "36129",
        orgeoSubId = "4",
        orgeoCategories = listOf("Ж" to listOf("3_девушки")),
        points =
        listOf(
            RunPoint(100),
            RunPoint(60),
            RunPoint(110),
            TechnicalPoint("Спуск", 140, failureCode = 170),
            RunPoint(62),
            RunPoint(64),
            RunPoint(60),
            RunPoint(65),
            RunPoint(106),
            TechnicalPoint("Навеска", 136, failureCode = 166),
            RunPoint(105),
            TechnicalPoint("Маятник", 135, failureCode = 165),
            RunPoint(60),
            RunPoint(101),
            TechnicalPoint("Лка", 131, failureCode = 161),
            RunPoint(50),
            RunPoint(103),
            TechnicalPoint("IIки", 133, failureCode = 163),
            RunPoint(name = "000", code = -1, length = 5500),
        ),
    )
