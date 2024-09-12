package tourism.exporter.distance

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val PR24Pair4 =
    Distance(
        name = "ПР св 4кл 04.07.24",
        orgeoEventId = "36593",
        orgeoSubId = "4",
        orgeoCategories = listOf("М" to listOf("ЮНР"), "Ж" to listOf("ЮНРК")),
        points =
            listOf(
                RunPoint(61, 440),
                TechnicalPoint("Маятник", 62, failureCode = 161),
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

val ChR24PairM =
    Distance(
        name = "ЧР св М 03.09.24",
        orgeoEventId = "36737",
        orgeoSubId = "5",
        orgeoCategories = listOf("М" to listOf("Мужчины")),
        points =
            listOf(
                RunPoint(101, 90),
                TechnicalPoint("Дом", 111, failureCode = 161),
                RunPoint(102, 1110),
                TechnicalPoint("IIки", 112, failureCode = 162),
                RunPoint(103, 300),
                TechnicalPoint("Бревно", 113, failureCode = 163),
                RunPoint(201),
                RunPoint(104, 770),
                TechnicalPoint("Спуск 1", 114, failureCode = 164),
                RunPoint(105, 90),
                TechnicalPoint("Спуск 2", 115, failureCode = 165),
                RunPoint(202),
                RunPoint(106, 870),
                TechnicalPoint("Маятник", 116, failureCode = 166),
                RunPoint(202),
                RunPoint(101, 960),
                TechnicalPoint("Дом 2", 111, failureCode = 167),
                RunPoint(-1, length = 280, "000"),
            ),
    )

val ChR24PairW =
    Distance(
        name = "ЧР св Ж 03.09.24",
        orgeoEventId = "36737",
        orgeoSubId = "5",
        orgeoCategories = listOf("Ж" to listOf("Женщины")),
        points =
            listOf(
                RunPoint(101, 90),
                TechnicalPoint("Дом", 111, failureCode = 161),
                RunPoint(102, 1110),
                TechnicalPoint("IIки", 112, failureCode = 162),
                RunPoint(103, 300),
                TechnicalPoint("Бревно", 113, failureCode = 163),
                RunPoint(201),
                RunPoint(104, 770),
                TechnicalPoint("Спуск 1", 114, failureCode = 164),
                RunPoint(105, 90),
                TechnicalPoint("Спуск 2", 115, failureCode = 165),
                RunPoint(202),
                RunPoint(101, 840),
                TechnicalPoint("Дом 2", 111, failureCode = 167),
                RunPoint(-1, length = 280, "000"),
            ),
    )

val ChR24M =
    Distance(
        name = "ЧР М 04.09.24",
        orgeoEventId = "36737",
        orgeoSubId = "6",
        orgeoCategories = listOf("М" to listOf("Мужчины")),
        points =
            listOf(
                RunPoint(101, 90),
                TechnicalPoint("Дом", 111, failureCode = 191),
                RunPoint(102, 1110),
                TechnicalPoint("IIки", 112, failureCode = 192),
                RunPoint(103, 300),
                TechnicalPoint("Бревно", 113, failureCode = 193),
                RunPoint(201),
                RunPoint(104, 770),
                TechnicalPoint("Спуск 1", 114, failureCode = 194),
                RunPoint(105, 90),
                TechnicalPoint("Спуск 2", 115, failureCode = 195),
                RunPoint(202),
                RunPoint(106, 870),
                TechnicalPoint("Маятник", 116, failureCode = 196),
                RunPoint(202),
                RunPoint(101, 960),
                TechnicalPoint("Дом 2", 111, failureCode = 197),
                RunPoint(-1, length = 280, "000"),
            ),
    )

val ChR24W =
    Distance(
        name = "ЧР Ж 03.09.24",
        orgeoEventId = "36737",
        orgeoSubId = "6",
        orgeoCategories = listOf("Ж" to listOf("Женщины")),
        points =
            listOf(
                RunPoint(101, 90),
                TechnicalPoint("Дом", 111, failureCode = 191),
                RunPoint(102, 1110),
                TechnicalPoint("IIки", 112, failureCode = 192),
                RunPoint(103, 300),
                TechnicalPoint("Бревно", 113, failureCode = 193),
                RunPoint(201),
                RunPoint(104, 770),
                TechnicalPoint("Спуск 1", 114, failureCode = 194),
                RunPoint(105, 90),
                TechnicalPoint("Спуск 2", 115, failureCode = 195),
                RunPoint(202),
                RunPoint(101, 840),
                TechnicalPoint("Дом 2", 111, failureCode = 197),
                RunPoint(-1, length = 280, "000"),
            ),
    )

val ChR24GroupM =
    Distance(
        name = "ЧР гр М 06.09.24",
        orgeoEventId = "36737",
        orgeoSubId = "8",
        orgeoCategories = listOf("М" to listOf("Мужчины")),
        points =
            listOf(
                RunPoint(61),
                RunPoint(104),
                TechnicalPoint("Подъём", 114, failureCode = 194),
                RunPoint(62),
                RunPoint(63),
                RunPoint(102),
                TechnicalPoint("IIки", 112, failureCode = 192),
                RunPoint(103),
                TechnicalPoint("Бревно", 113, failureCode = 193),
                RunPoint(62),
                RunPoint(64),
                RunPoint(65),
                RunPoint(67),
                RunPoint(69),
                RunPoint(70),
                RunPoint(100),
                RunPoint(71),
                RunPoint(72),
                RunPoint(73),
                RunPoint(107),
                TechnicalPoint("Ущелье", 117, failureCode = 197),
                RunPoint(74),
                RunPoint(75),
                RunPoint(76),
                RunPoint(77),
                RunPoint(78),
                RunPoint(79),
                RunPoint(100),
                RunPoint(106),
                TechnicalPoint("Маятник", 116, failureCode = 196),
                RunPoint(101),
                TechnicalPoint("Дом", 111, failureCode = 197),
                RunPoint(-1, length = 13550, "000"),
            ),
    )

val ChR24GroupW =
    Distance(
        name = "ЧР гр Ж 06.09.24",
        orgeoEventId = "36737",
        orgeoSubId = "8",
        orgeoCategories = listOf("Ж" to listOf("Женщины")),
        points =
            listOf(
                RunPoint(61),
                RunPoint(104),
                TechnicalPoint("Подъём", 114, failureCode = 194),
                RunPoint(62),
                RunPoint(63),
                RunPoint(102),
                TechnicalPoint("IIки", 112, failureCode = 192),
                RunPoint(103),
                TechnicalPoint("Бревно", 113, failureCode = 193),
                RunPoint(62),
                RunPoint(64),
                RunPoint(80),
                RunPoint(70),
                RunPoint(100),
                RunPoint(71),
                RunPoint(81),
                RunPoint(107),
                TechnicalPoint("Ущелье", 117, failureCode = 197),
                RunPoint(82),
                RunPoint(83),
                RunPoint(84),
                RunPoint(78),
                RunPoint(79),
                RunPoint(100),
                RunPoint(106),
                TechnicalPoint("Маятник", 116, failureCode = 196),
                RunPoint(101),
                TechnicalPoint("Дом", 111, failureCode = 197),
                RunPoint(-1, length = 6900, "000"),
            ),
    )
