package tourism.exporter.distance.kh

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val KH26Short =
    Distance(
        name = "КХ лч 16.10.26",
        orgeoEventId = "55678",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(101, 30),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(102, 30),
                TechnicalPoint("Бревно", 132, failureCode = 202),
                RunPoint(103, 750),
                TechnicalPoint("Спуск", 133, failureCode = 203),
                RunPoint(104, 50),
                TechnicalPoint("Подъём", 134, failureCode = 204),
                RunPoint(105, 650),
                TechnicalPoint("Навеска", 135, failureCode = 205),
                RunPoint(101, 660),
                TechnicalPoint("Дом 2", 131, failureCode = 201),
                RunPoint("FIN", length = 30, "000"),
            ),
    )

val KH26PairM =
    Distance(
        name = "КХ св М 17.10.26",
        orgeoEventId = "55678",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("5_мужчины")),
        points =
            listOf(
                RunPoint(102),
                TechnicalPoint("Бревно", 132, failureCode = 202),
                RunPoint(39),
                RunPoint(40),
                RunPoint(44),
                RunPoint(31),
                RunPoint(32),
                RunPoint(108),
                TechnicalPoint("Навеска", 138, failureCode = 208),
                RunPoint(45),
                RunPoint(107),
                TechnicalPoint("Маятник", 137, failureCode = 207),
                RunPoint(48),
                RunPoint(34),
                RunPoint(46),
                RunPoint(106),
                TechnicalPoint("Спуск", 136, failureCode = 206),
                RunPoint(105),
                TechnicalPoint("Навеска 2", 135, failureCode = 205),
                RunPoint(36),
                RunPoint(103),
                TechnicalPoint("Спуск", 133, failureCode = 203),
                RunPoint(104),
                TechnicalPoint("Подъём", 134, failureCode = 204),
                RunPoint(47),
                RunPoint(51),
                RunPoint(43),
                RunPoint(35),
                RunPoint(33),
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(-1, length = 8690, "000"),
            ),
    )

val KH26PairW =
    Distance(
        name = "КХ св Ж 17.10.26",
        orgeoEventId = "55678",
        orgeoSubId = "2",
        categories = listOf("Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(102),
                TechnicalPoint("Бревно", 132, failureCode = 202),
                RunPoint(37),
                RunPoint(40),
                RunPoint(32),
                RunPoint(108),
                TechnicalPoint("Навеска", 138, failureCode = 208),
                RunPoint(45),
                RunPoint(107),
                TechnicalPoint("Маятник", 137, failureCode = 207),
                RunPoint(34),
                RunPoint(106),
                TechnicalPoint("Спуск", 136, failureCode = 206),
                RunPoint(105),
                TechnicalPoint("Навеска 2", 135, failureCode = 205),
                RunPoint(36),
                RunPoint(103),
                TechnicalPoint("Спуск", 133, failureCode = 203),
                RunPoint(104),
                TechnicalPoint("Подъём", 134, failureCode = 204),
                RunPoint(47),
                RunPoint(42),
                RunPoint(43),
                RunPoint(35),
                RunPoint(33),
                RunPoint(101),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint("FIN", length = 7170, "000"),
            ),
    )

val KH26Group =
    Distance(
        name = "КХ гр 18.10.26",
        orgeoEventId = "55678",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("5_мужчины"), "Ж" to listOf("5_женщины")),
        points =
            listOf(
                RunPoint(101, 30),
                TechnicalPoint("Дом", 131, failureCode = 201),
                RunPoint(102, 30),
                TechnicalPoint("Бревно", 132, failureCode = 202),
                RunPoint(103, 750),
                TechnicalPoint("Спуск", 133, failureCode = 203),
                RunPoint(104, 50),
                TechnicalPoint("Подъём", 134, failureCode = 204),
                RunPoint(105, 650),
                TechnicalPoint("Навеска", 135, failureCode = 205),
                RunPoint(101, 660),
                TechnicalPoint("Дом 2", 131, failureCode = 201),
                RunPoint("FIN", length = 30, "000"),
            ),
    )
