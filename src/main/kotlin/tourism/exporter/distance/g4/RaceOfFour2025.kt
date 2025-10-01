package tourism.exporter.distance.g4

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val G4_25_5M =
    Distance(
        name = "Г4 5кл М 20.09.25",
        orgeoEventId = "45796",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("5_Мужчины")),
        points =
        listOf(
            RunPoint(83),
            RunPoint(74),
            RunPoint(101),
            TechnicalPoint("Спуск", 131, failureCode = 231),
            RunPoint(41),
            RunPoint(36),
            RunPoint(35),
            RunPoint(31),
            RunPoint(32),
            RunPoint(33),
            RunPoint(34),
            RunPoint(38),
            RunPoint(102),
            TechnicalPoint("Подъём", 132, failureCode = 232),
            RunPoint(103),
            TechnicalPoint("Дом", 133, failureCode = 233),
            RunPoint(104),
            TechnicalPoint("Навеска", 134, failureCode = 234),
            RunPoint(86),
            RunPoint(105),
            TechnicalPoint("||ки", 135, failureCode = 235),
            RunPoint(107),
            TechnicalPoint("П-ка", 137, failureCode = 237),
            RunPoint(73),
            RunPoint(103),
            TechnicalPoint("Дом 2", 133, failureCode = 233),
            RunPoint(108),
            TechnicalPoint("Навеска 2", 138, failureCode = 238),
            RunPoint(88),
            RunPoint(-1, length = 13090, "000"),
        ),
    )

val G4_25_5W =
    Distance(
        name = "Г4 5кл Ж 20.09.25",
        orgeoEventId = "45796",
        orgeoSubId = "1",
        orgeoCategories = listOf("Ж" to listOf("5_Женщины")),
        points =
        listOf(
            RunPoint(83),
            RunPoint(72),
            RunPoint(101),
            TechnicalPoint("Спуск", 131, failureCode = 231),
            RunPoint(41),
            RunPoint(36),
            RunPoint(37),
            RunPoint(102),
            TechnicalPoint("Подъём", 132, failureCode = 232),
            RunPoint(42),
            RunPoint(103),
            TechnicalPoint("Дом", 133, failureCode = 233),
            RunPoint(104),
            TechnicalPoint("Навеска", 134, failureCode = 234),
            RunPoint(105),
            TechnicalPoint("||ки", 135, failureCode = 235),
            RunPoint(43),
            RunPoint(107),
            TechnicalPoint("П-ка", 137, failureCode = 237),
            RunPoint(103),
            TechnicalPoint("Дом 2", 133, failureCode = 233),
            RunPoint(108),
            TechnicalPoint("Навеска 2", 138, failureCode = 238),
            RunPoint(88),
            RunPoint(-1, length = 8730, "000"),
        ),
    )

val G4_25_4M =
    Distance(
        name = "Г4 4кл М 20.09.25",
        orgeoEventId = "45796",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("4_Мужчины")),
        points =
            listOf(
                RunPoint(87),
                RunPoint(105),
                TechnicalPoint("||ки", 135, failureCode = 235),
                RunPoint(107),
                TechnicalPoint("П-ка", 137, failureCode = 237),
                RunPoint(101),
                TechnicalPoint("Спуск", 131, failureCode = 231),
                RunPoint(41),
                RunPoint(36),
                RunPoint(35),
                RunPoint(39),
                RunPoint(102),
                TechnicalPoint("Подъём", 132, failureCode = 232),
                RunPoint(42),
                RunPoint(103),
                TechnicalPoint("Дом", 133, failureCode = 233),
                RunPoint(108),
                TechnicalPoint("Навеска", 138, failureCode = 238),
                RunPoint(88),
                RunPoint(-1, length = 8000, "000"),
            ),
    )

val G4_25_4M_2day =
    Distance(
        name = "Г4 4кл М 21.09.25",
        orgeoEventId = "45796",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("4_Мужчины")),
        points =
            listOf(
                TechnicalPoint("Дом", 103, failureCode = 233),
                RunPoint(listOf(55, 80).map { it.toString() }),
                RunPoint(87),
                RunPoint(54),
                RunPoint(107),
                TechnicalPoint("П-ка", 137, failureCode = 237),
                RunPoint(72),
                RunPoint(listOf(74, 77).map { it.toString() }),
                RunPoint(73),
                RunPoint(72),
                RunPoint(listOf(74, 77).map { it.toString() }),
                RunPoint(73),
                RunPoint(58),
                RunPoint(103),
                TechnicalPoint("Дом", 133, failureCode = 233),
                RunPoint(listOf(55, 80).map { it.toString() }),
                RunPoint(87),
                RunPoint(56),
                RunPoint(57),
                RunPoint(109),
                TechnicalPoint("Лка", 139, failureCode = 239),
                RunPoint(103),
                TechnicalPoint("Лка 2", 133, failureCode = 233),
                RunPoint(85),
                RunPoint("FIN", length = 9080, "000"),
            ),
        fixesSplit = listOf(
            "Тельбух-Лапин-Муханов-Кириллов" to "00:04:40|103|00:04:18|80|00:05:33|87|00:07:06|54|00:02:49|107|00:07:45|137|00:01:24|72|00:02:09|74|00:01:36|73|00:02:32|72|00:02:18|77|00:01:39|73|00:02:29|58|00:03:34|103|00:08:07|133|00:07:08|55|00:06:03|87|00:05:39|56|00:02:42|57|00:05:55|109|00:07:13|139|00:07:29|103|00:04:23|133|00:02:31|85|00:01:31|FIN|"
        )
    )

val G4_25_4W =
    Distance(
        name = "Г4 4кл Ж 20.09.25",
        orgeoEventId = "45796",
        orgeoSubId = "1",
        orgeoCategories = listOf("Ж" to listOf("4_Женщины")),
        points =
            listOf(
                RunPoint(84),
                RunPoint(105),
                TechnicalPoint("||ки", 135, failureCode = 235),
                RunPoint(43),
                RunPoint(107),
                TechnicalPoint("П-ка", 137, failureCode = 237),
                RunPoint(101),
                TechnicalPoint("Спуск", 131, failureCode = 231),
                RunPoint(41),
                RunPoint(36),
                RunPoint(37),
                RunPoint(102),
                TechnicalPoint("Подъём", 132, failureCode = 232),
                RunPoint(75),
                RunPoint(103),
                TechnicalPoint("Дом", 133, failureCode = 233),
                RunPoint(108),
                TechnicalPoint("Навеска", 138, failureCode = 238),
                RunPoint(88),
                RunPoint(-1, length = 6750, "000"),
            ),
    )

val G4_25_4W_2day =
    Distance(
        name = "Г4 4кл Ж 21.09.25",
        orgeoEventId = "45796",
        orgeoSubId = "2",
        orgeoCategories = listOf("Ж" to listOf("4_Женщины")),
        points =
            listOf(
                TechnicalPoint("Дом", 103, failureCode = 233),
                RunPoint(listOf(55, 80).map { it.toString() }),
                RunPoint(86),
                RunPoint(54),
                RunPoint(107),
                TechnicalPoint("П-ка", 137, failureCode = 237),
                RunPoint(58),
                RunPoint(103),
                TechnicalPoint("Дом", 133, failureCode = 233),
                RunPoint(listOf(55, 80).map { it.toString() }),
                RunPoint(86),
                RunPoint(56),
                RunPoint(57),
                RunPoint(109),
                TechnicalPoint("Лка", 139, failureCode = 239),
                RunPoint(103),
                TechnicalPoint("Лка 2", 133, failureCode = 233),
                RunPoint(85),
                RunPoint("FIN", length = 7910, "000"),
            ),
    )

val G4_25_3 =
    Distance(
        name = "Г4 3кл 20.09.25",
        orgeoEventId = "45796",
        orgeoSubId = "1",
        orgeoCategories = listOf("М" to listOf("3_Юноши"), "Ж" to listOf("3_Девушки")),
        points =
            listOf(
                RunPoint(109),
                TechnicalPoint("Лка", 139, failureCode = 239),
                RunPoint(84),
                RunPoint(104),
                TechnicalPoint("Навеска", 134, failureCode = 234),
                RunPoint(101),
                TechnicalPoint("Спуск", 131, failureCode = 231),
                RunPoint(41),
                RunPoint(71),
                RunPoint(110),
                TechnicalPoint("Маятник", 140, failureCode = 240),
                RunPoint(106),
                TechnicalPoint("Подъём", 136, failureCode = 236),
                RunPoint(85),
                RunPoint(-1, length = 5660, "000"),
            ),
    )

val G4_25_3_2day =
    Distance(
        name = "Г4 3кл 21.09.25",
        orgeoEventId = "45796",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to listOf("3_юноши"), "Ж" to listOf("3_девушки")),
        points =
            listOf(
                RunPoint(53),
                RunPoint(108),
                TechnicalPoint("Навеска", 138, failureCode = 238),
                RunPoint(51),
                RunPoint(110),
                TechnicalPoint("Маятник", 140, failureCode = 240),
                RunPoint(102),
                TechnicalPoint("Спуск", 101, failureCode = 201),
                TechnicalPoint("Подъём", 131, failureCode = 231),
                RunPoint(71),
                RunPoint(105),
                TechnicalPoint("||ки", 135, failureCode = 235),
                RunPoint(86),
                RunPoint(104),
                TechnicalPoint("Навеска 2", 134, failureCode = 234),
                RunPoint(76),
                RunPoint(85),
                RunPoint("FIN", length = 5920, "000"),
            ),
    )

