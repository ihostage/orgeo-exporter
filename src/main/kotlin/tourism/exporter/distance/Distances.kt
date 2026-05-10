package tourism.exporter.distance

import tourism.exporter.Distance
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint

val SVAO =
    Distance(
        name = "ЧиП Сев.Медведково 3/4кл 19.04.26",
        orgeoEventId = "51625",
        orgeoSubId = "5",
        categories = listOf(
            "М_4" to listOf("Мужчины_4"),
            "Ж_4" to listOf("Женщины_4"),
            "Ю_3" to listOf("Юноши_3"),
            "Д_3" to listOf("Девушки_3"),
        ),
        points =
            listOf(
                RunPoint(32),
                TechnicalPoint("Маятник", 33, failureCode = 133),
                TechnicalPoint("Блок", 34, failureCode = 134),
                RunPoint("FIN", length = 1100, "Бревно"),
            ),
    )
