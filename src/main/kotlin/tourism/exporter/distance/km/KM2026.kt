package tourism.exporter.distance.km

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val KM_26_W =
    Distance(
        name = "КМ лч Ж 10.10.26",
        orgeoEventId = "56064",
        orgeoSubId = "7",
        categories = listOf("Ж" to listOf("4кл_Женщины")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(32),
                RunPoint(116),
                TechnicalPoint("П-ка", 146, failureCode = 246),
                RunPoint(108),
                TechnicalPoint("||ки", 138, failureCode = 238),
                RunPoint(109),
                TechnicalPoint("Маятник", 139, failureCode = 239),
                RunPoint(57),
                RunPoint(50),
                RunPoint(110),
                TechnicalPoint("Дом", 140, failureCode = 240),
                RunPoint(52),
                RunPoint(53),
                RunPoint(111),
                TechnicalPoint("Спуск", 141, failureCode = 241),
                RunPoint(35),
                RunPoint(36),
                RunPoint(50),
                RunPoint("FIN", length = 7110, "000"),
            ),
    )

val KM_26_M =
    Distance(
        name = "КМ лч М 10.10.26",
        orgeoEventId = "56064",
        orgeoSubId = "7",
        categories = listOf("М" to listOf("4кл_Мужчины")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(58),
                RunPoint(56),
                RunPoint(55),
                RunPoint(116),
                TechnicalPoint("П-ка", 146, failureCode = 246),
                RunPoint(108),
                TechnicalPoint("||ки", 138, failureCode = 238),
                RunPoint(41),
                RunPoint(109),
                TechnicalPoint("Маятник", 139, failureCode = 239),
                RunPoint(35),
                RunPoint(50),
                RunPoint(110),
                TechnicalPoint("Дом", 140, failureCode = 240),
                RunPoint(33),
                RunPoint(59),
                RunPoint(111),
                TechnicalPoint("Спуск", 141, failureCode = 241),
                RunPoint(36),
                RunPoint(50),
                RunPoint("FIN", length = 7860, "000"),
            ),
    )

val KM_26_M_PROF =
    Distance(
        name = "КМ лч М Профи 10.10.26",
        orgeoEventId = "56064",
        orgeoSubId = "7",
        categories = listOf("М" to listOf("4кл_Мужчины_Profi")),
        points =
            listOf(
                RunPoint(31),
                RunPoint(34),
                RunPoint(51),
                RunPoint(40),
                RunPoint(42),
                RunPoint(116),
                TechnicalPoint("П-ка", 146, failureCode = 246),
                RunPoint(39),
                RunPoint(108),
                TechnicalPoint("||ки", 138, failureCode = 238),
                RunPoint(37),
                RunPoint(38),
                RunPoint(109),
                TechnicalPoint("Маятник", 139, failureCode = 239),
                RunPoint(54),
                RunPoint(57),
                RunPoint(52),
                RunPoint(50),
                RunPoint(110),
                TechnicalPoint("Дом", 140, failureCode = 240),
                RunPoint(33),
                RunPoint(59),
                RunPoint(111),
                TechnicalPoint("Спуск", 141, failureCode = 241),
                RunPoint(35),
                RunPoint(36),
                RunPoint(50),
                RunPoint("FIN", length = 8960, "000"),
            ),
    )

val KM_26_MS_M =
    Distance(
        name = "КМ масс М 11.10.26",
        orgeoEventId = "56064",
        orgeoSubId = "6",
        categories = listOf("М" to listOf("4кл_МУЖЧИНЫ")),
        points =
            listOf(
                RunPoint(80),
                RunPoint(81),
                RunPoint(78),
                RunPoint(76),
                RunPoint(72),
                RunPoint(78),
                RunPoint(52),
                RunPoint(110),
                TechnicalPoint("Л-ка", 140, failureCode = 240),
                RunPoint(84),
                RunPoint(88),
                RunPoint(87),
                RunPoint(116),
                TechnicalPoint("П-ка", 146, failureCode = 246),
                RunPoint(86),
                RunPoint(90),
                RunPoint(101),
                TechnicalPoint("Навеска", 131, failureCode = 231),
                RunPoint(80),
                RunPoint(82),
                RunPoint(78),
                RunPoint(71),
                RunPoint(73),
                RunPoint(75),
                RunPoint(77),
                RunPoint(78),
                RunPoint(79),
                RunPoint(83),
                RunPoint(110),
                TechnicalPoint("Дом", 140, failureCode = 240),
                RunPoint("FIN", length = 8870, "000"),
            ),
        seedingPoints = listOf(80, 78).map { it.toString() },
        seeding =
            listOf(
                listOf(82, 78).map { it.toString() } to listOf(81, 78).map { it.toString() },
                listOf(71, 73, 75, 77, 78).map { it.toString() } to listOf(76, 72, 78).map { it.toString() },
                listOf(79, 83, 110).map { it.toString() } to listOf(52, 110).map { it.toString() },
            ),
    )

val KM_26_MS_W =
    Distance(
        name = "КМ масс Ж 11.10.26",
        orgeoEventId = "56064",
        orgeoSubId = "6",
        categories = listOf("М" to listOf("4кл_ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(80),
                RunPoint(82),
                RunPoint(59),
                RunPoint(52),
                RunPoint(110),
                TechnicalPoint("Л-ка", 140, failureCode = 240),
                RunPoint(51),
                RunPoint(116),
                TechnicalPoint("П-ка", 146, failureCode = 246),
                RunPoint(85),
                RunPoint(58),
                RunPoint(90),
                RunPoint(101),
                TechnicalPoint("Навеска", 131, failureCode = 231),
                RunPoint(80),
                RunPoint(81),
                RunPoint(59),
                RunPoint(72),
                RunPoint(74),
                RunPoint(76),
                RunPoint(59),
                RunPoint(79),
                RunPoint(110),
                TechnicalPoint("Дом", 140, failureCode = 240),
                RunPoint("FIN", length = 7290, "000"),
            ),
        seedingPoints = listOf(80, 59).map { it.toString() },
        seeding =
            listOf(
                listOf(81, 59).map { it.toString() } to listOf(82, 59).map { it.toString() },
                listOf(79, 110).map { it.toString() } to listOf(52, 110).map { it.toString() },
                listOf(72, 74, 76, 59, 52, 110).map { it.toString() } to listOf(79, 110).map { it.toString() },
                listOf(79, 110).map { it.toString() } to listOf(52, 110).map { it.toString() },
            ),
    )

val KM_26_2_Short =
    Distance(
        name = "КМ кр 2 10.10.26",
        orgeoEventId = "56064",
        orgeoSubId = "1",
        categories =
            listOf(
                "Дев" to listOf("2кл_Девочки"),
                "Девушки" to listOf("2кл_Девушки"),
                "Юн-Ж" to listOf("2кл_Юниорки"),
                "Ж" to listOf("2кл_Женщины"),
                "Мал" to listOf("2кл_Мальчики"),
                "Юноши" to listOf("2кл_Юноши"),
                "Юн-М" to listOf("2кл_Юниоры"),
                "М" to listOf("2кл_Мужчины"),
            ),
        points =
            listOf(
                RunPoint(101, length = 30),
                TechnicalPoint("Навеска", 131, failureCode = 201),
                RunPoint(102, length = 250),
                TechnicalPoint("Маятник", 132, failureCode = 202),
                RunPoint(104, length = 460),
                TechnicalPoint("Спуск", 134, failureCode = 204),
                TechnicalPoint("Подъём", 135, failureCode = 205),
                RunPoint(106, length = 330),
                TechnicalPoint("Бревно", 136, failureCode = 206),
                RunPoint(107, length = 180),
                TechnicalPoint("||ки", 137, failureCode = 207),
                RunPoint("FIN", length = 130, "000"),
            ),
    )

val KM_26_3_Short =
    Distance(
        name = "КМ кр 3 10.10.26",
        orgeoEventId = "56064",
        orgeoSubId = "7",
        categories =
            listOf(
                "Д" to listOf("3кл_Девушки"),
                "Ж" to listOf("3кл_Женщины"),
                "Ю" to listOf("3кл_Юноши"),
                "М" to listOf("3кл_Мужчины"),
            ),
        points =
            listOf(
                RunPoint(101, length = 30),
                TechnicalPoint("Навеска", 131, failureCode = 201),
                RunPoint(102, length = 250),
                TechnicalPoint("Маятник", 132, failureCode = 202),
                RunPoint(103, length = 90),
                TechnicalPoint("П-ка", 133, failureCode = 203),
                RunPoint(104, length = 370),
                TechnicalPoint("Спуск", 134, failureCode = 204),
                TechnicalPoint("Подъём", 135, failureCode = 205),
                RunPoint(106, length = 330),
                TechnicalPoint("Бревно", 136, failureCode = 206),
                RunPoint(107, length = 180),
                TechnicalPoint("||ки", 137, failureCode = 207),
                RunPoint("FIN", length = 130, "000"),
            ),
    )
