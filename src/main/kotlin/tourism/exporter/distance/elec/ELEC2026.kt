package tourism.exporter.distance.elec

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val ELEC_26_Long =
    Distance(
        name = "Елец дл 07.05.25",
        orgeoEventId = "43223",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("5_МУЖЧИНЫ"), "Ж" to listOf("5_ЖЕНЩИНЫ")),
        points = listOf()
    )

val ELEC_26_Long_4 =
    Distance(
        name = "Елец дл 07.05.25",
        orgeoEventId = "43223",
        orgeoSubId = "1",
        categories = listOf("М" to listOf("4_ЮНИОРЫ"), "Ж" to listOf("4_ЮНИОРКИ")),
        points = listOf()
    )

val ELEC_26_Short =
    Distance(
        name = "Елец кр 08.05.26",
        orgeoEventId = "50771",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("5_МУЖЧИНЫ"), "Ж" to listOf("5_ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(61, length = 470),
                TechnicalPoint("Навеска", 81, failureCode = 101),
                RunPoint(62, length = 390),
                TechnicalPoint("||ки", 82, failureCode = 102),
                RunPoint(63, length = 390),
                TechnicalPoint("Бревно", 83, failureCode = 103),
                RunPoint(64, length = 390),
                TechnicalPoint("Дом", 84, failureCode = 104),
                RunPoint(65, length = 180),
                TechnicalPoint("Спуск", 85, failureCode = 105),
                RunPoint(66, length = 80),
                TechnicalPoint("Подъём", 86, failureCode = 106),
                RunPoint(67, length = 130 + 140),
                TechnicalPoint("Маятник", "FIN", failureCode = 107),
            ),
    )

val ELEC_26_Short_4 =
    Distance(
        name = "Елец кр 08.05.26",
        orgeoEventId = "50771",
        orgeoSubId = "2",
        categories = listOf("М" to listOf("4_ЮНИОРЫ"), "Ж" to listOf("4_ЮНИОРКИ")),
        points =
            listOf(
                RunPoint(61, length = 470),
                TechnicalPoint("Навеска", 81, failureCode = 101),
                RunPoint(62, length = 390),
                TechnicalPoint("||ки", 82, failureCode = 102),
                RunPoint(63, length = 390),
                TechnicalPoint("Бревно", 83, failureCode = 103),
                RunPoint(64, length = 390),
                TechnicalPoint("Дом", 84, failureCode = 104),
                RunPoint(65, length = 180),
                TechnicalPoint("Спуск", 85, failureCode = 105),
                RunPoint(66, length = 80),
                TechnicalPoint("Подъём", 86, failureCode = 106),
                RunPoint(67, length = 130 + 140),
                TechnicalPoint("Маятник", "FIN", failureCode = 107),
            ),
        fixesSplit = listOf()
    )

val ELEC_26_Sprint =
    Distance(
        name = "Елец сп 09.05.26",
        orgeoEventId = "50771",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("5_МУЖЧИНЫ"), "Ж" to listOf("5_ЖЕНЩИНЫ")),
        points =
            listOf(
                RunPoint(61, length = 470),
                TechnicalPoint("Навеска", 81, failureCode = 101),
                RunPoint(62, length = 30),
                TechnicalPoint("||ки", 82, failureCode = 102),
                RunPoint(63, length = 30),
                TechnicalPoint("Бревно", 83, failureCode = 103),
                RunPoint(64, length = 10),
                TechnicalPoint("Дом", 84, failureCode = 104),
//                RunPoint(65, length = 180),
//                TechnicalPoint("Спуск", 85, failureCode = 105),
//                RunPoint(66, length = 80),
                TechnicalPoint("Спуск/Подъём", 65, failureCode = 106),
//                RunPoint(67, length = 130 + 140),
                TechnicalPoint("Маятник/Финиш", "FIN", failureCode = 107),
            ),
    )

val ELEC_26_Sprint_4 =
    Distance(
        name = "Елец сп 09.05.26",
        orgeoEventId = "50771",
        orgeoSubId = "3",
        categories = listOf("М" to listOf("4_ЮНИОРЫ"), "Ж" to listOf("4_ЮНИОРКИ")),
        points =
            listOf(
                RunPoint(61, length = 470),
                TechnicalPoint("Навеска", 81, failureCode = 101),
                RunPoint(62, length = 30),
                TechnicalPoint("||ки", 82, failureCode = 102),
                RunPoint(63, length = 30),
                TechnicalPoint("Бревно", 83, failureCode = 103),
                RunPoint(64, length = 10),
                TechnicalPoint("Дом", 84, failureCode = 104),
                RunPoint(73, length = 180),
                TechnicalPoint("Спуск", 85, failureCode = 105),
                RunPoint(66, length = 80),
                TechnicalPoint("Подъём", 65, failureCode = 106),
                RunPoint(67, length = 130),
                TechnicalPoint("Маятник", 87, failureCode = 107),
                RunPoint("FIN", length = 140, name = "000"),
            ),
    )
