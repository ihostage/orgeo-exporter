package tourism.exporter.distance.g4

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val G4_26_5M =
    Distance(
        name = "Г4 5кл М 19.09.26",
        orgeoEventId = "55482",
        orgeoSubId = "5",
        categories = listOf("М" to listOf("5_МУЖЧИНЫ")),
        points =
            listOf(
                RunPoint(110),
                TechnicalPoint("Дом", 210, failureCode = 10),
                RunPoint(42),
                RunPoint(115),
                TechnicalPoint("||ки", 215, failureCode = 15),
                RunPoint(47),
                RunPoint(38),
                RunPoint(45),
                RunPoint(46),
                RunPoint(117),
                TechnicalPoint("П-ка", 217, failureCode = 17),
                RunPoint(48),
                RunPoint(65),
                RunPoint(40),
                RunPoint(116),
                TechnicalPoint("Мл. П-ка", 216, failureCode = 16),
                RunPoint(50),
                RunPoint(43),
                RunPoint(51),
                RunPoint(52),
                RunPoint(67),
                RunPoint(117),
                TechnicalPoint("Л-ка", 217, failureCode = 17),
                RunPoint(36),
                RunPoint(110),
                TechnicalPoint("Дом 2", 210, failureCode = 10),
                RunPoint("FIN", length = 12190, "000"),
            ),
    )

val G4_26_5W =
    Distance(
        name = "Г4 5кл Ж 19.09.26",
        orgeoEventId = "55482",
        orgeoSubId = "5",
        categories = listOf("Ж" to listOf("5_ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(110),
                TechnicalPoint("Дом", 210, failureCode = 10),
                RunPoint(64),
                RunPoint(115),
                TechnicalPoint("||ки", 215, failureCode = 15),
                RunPoint(66),
                RunPoint(117),
                TechnicalPoint("П-ка", 217, failureCode = 17),
                RunPoint(36),
                RunPoint(86),
                RunPoint(65),
                RunPoint(40),
                RunPoint(116),
                TechnicalPoint("Мл. П-ка", 216, failureCode = 16),
                RunPoint(50),
                RunPoint(37),
                RunPoint(68),
                RunPoint(69),
                RunPoint(117),
                TechnicalPoint("Л-ка", 217, failureCode = 17),
                RunPoint(85),
                RunPoint(62),
                RunPoint(87),
                RunPoint(110),
                TechnicalPoint("Дом 2", 210, failureCode = 10),
                RunPoint("FIN", length = 9950, "000"),
            ),
    )

val G4_26_4M =
    Distance(
        name = "Г4 4кл М 19.09.26",
        orgeoEventId = "55482",
        orgeoSubId = "5",
        categories = listOf("М" to listOf("4_МУЖЧИНЫ")),
        points =
            listOf(
                RunPoint(110),
                TechnicalPoint("Л-ка", 210, failureCode = 10),
                RunPoint(44),
                RunPoint(41),
                RunPoint(112),
                TechnicalPoint("Маятник", 212, failureCode = 12),
                RunPoint(42),
                RunPoint(43),
                RunPoint(115),
                TechnicalPoint("||ки", 215, failureCode = 15),
                RunPoint(38),
                RunPoint(45),
                RunPoint(46),
                RunPoint(48),
                RunPoint(114),
                TechnicalPoint("Л-ка 2", 214, failureCode = 14),
                RunPoint(65),
                RunPoint(40),
                RunPoint(116),
                TechnicalPoint("П-ка", 216, failureCode = 16),
                RunPoint(44),
                RunPoint("FIN", length = 8450, "000"),
            ),
    )

val G4_26_4W =
    Distance(
        name = "Г4 4кл Ж 19.09.26",
        orgeoEventId = "55482",
        orgeoSubId = "5",
        categories = listOf("Ж" to listOf("4_ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(110),
                TechnicalPoint("Л-ка", 210, failureCode = 10),
                RunPoint(44),
                RunPoint(64),
                RunPoint(37),
                RunPoint(112),
                TechnicalPoint("Маятник", 212, failureCode = 12),
                RunPoint(115),
                TechnicalPoint("||ки", 215, failureCode = 15),
                RunPoint(47),
                RunPoint(38),
                RunPoint(39),
                RunPoint(62),
                RunPoint(114),
                TechnicalPoint("Л-ка 2", 214, failureCode = 14),
                RunPoint(65),
                RunPoint(40),
                RunPoint(116),
                TechnicalPoint("П-ка", 216, failureCode = 16),
                RunPoint(44),
                RunPoint("FIN", length = 6180, "000"),
            ),
    )

val G4_26_4M_2day =
    Distance(
        name = "Г4 4кл М 20.09.26",
        orgeoEventId = "55482",
        orgeoSubId = "6",
        categories = listOf("М" to listOf("4_МУЖЧИНЫ")),
        points =
            listOf(
                TechnicalPoint("Дом + 60", 60, failureCode = 10),
                RunPoint(61),
                RunPoint(69),
                RunPoint(89),
                RunPoint(55),
                RunPoint(114),
                TechnicalPoint("Маятник", 214, failureCode = 14),
                RunPoint(56),
                RunPoint(85),
                RunPoint(55),
                RunPoint(59),
                RunPoint(65),
                RunPoint(53),
                RunPoint(116),
                TechnicalPoint("П-ка", 216, failureCode = 16),
                RunPoint(60),
                RunPoint(64),
                RunPoint(54),
                RunPoint(57),
                RunPoint(55),
                RunPoint(58),
                RunPoint(86),
                RunPoint(53),
                RunPoint(110, length = 8890),
                TechnicalPoint("Л-ка + FIN", "FIN", failureCode = 10),
            ),
        seeding =
            listOf(
                listOf(64, 54, 57).map { it.toString() } to listOf(61, 69, 89).map { it.toString() },
                listOf(58, 86).map { it.toString() } to listOf(59, 65).map { it.toString() },
            ),
    )

val G4_26_4W_2day =
    Distance(
        name = "Г4 4кл Ж 20.09.26",
        orgeoEventId = "55482",
        orgeoSubId = "6",
        categories = listOf("Ж" to listOf("4_ЖЕНЩИНЫ")),
        points =
            listOf(
                TechnicalPoint("Дом + 60", 60, failureCode = 10),
                RunPoint(61),
                RunPoint(67),
                RunPoint(55),
                RunPoint(114),
                TechnicalPoint("Маятник", 214, failureCode = 14),
                RunPoint(65),
                RunPoint(53),
                RunPoint(116),
                TechnicalPoint("П-ка", 216, failureCode = 16),
                RunPoint(60),
                RunPoint(54),
                RunPoint(57),
                RunPoint(55),
                RunPoint(62),
                RunPoint(58),
                RunPoint(59),
                RunPoint(60),
                RunPoint(110, length = 6620),
                TechnicalPoint("Л-ка + FIN", "FIN", failureCode = 10),
            ),
        seeding =
            listOf(
                listOf(54, 57).map { it.toString() } to listOf(61, 67).map { it.toString() },
            ),
    )
