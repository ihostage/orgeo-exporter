package tourism.exporter

val Elec2024Short =
    Distance(
        name = "ВС5 лич кор 08.05.24",
        orgeoEventId = "34974",
        orgeoSubId = "2",
        orgeoCategories = listOf("М" to "5_мужчины", "Ж" to "5_женщины"),
        points =
            listOf(
                TechnicalPoint("ВСС", 61, failureCode = 161),
                TechnicalPoint("П+Бревно", 62, failureCode = 162),
                TechnicalPoint("П+IIки", 63, failureCode = 163),
                TechnicalPoint("П+Дом1", 64, failureCode = 164),
                RunPoint("201", 201, 300),
                TechnicalPoint("П+Спуск", 65, failureCode = 165),
                TechnicalPoint("П+Дом2", 66, failureCode = 166),
                TechnicalPoint("П+Дом2+Ф", -1),
            ),
    )

val Elec2024Sprint =
    Distance(
        name = "ВС5 лич спр 09.05.24",
        orgeoEventId = "34974",
        orgeoSubId = "3",
        orgeoCategories = listOf("М" to "5_мужчины", "Ж" to "5_женщины"),
        points =
            listOf(
                TechnicalPoint("ВСС", 61, failureCode = 161),
                TechnicalPoint("П+Бревно", 62, failureCode = 162),
                TechnicalPoint("П+IIки", 63, failureCode = 163),
                TechnicalPoint("П+Дом1", 64, failureCode = 164),
                TechnicalPoint("П+Спуск", 65, failureCode = 165),
                TechnicalPoint("П+Подъём", 66, failureCode = 166),
                TechnicalPoint("П+Дом2", 67, failureCode = 166),
                RunPoint("000", -1, length = 100),
            ),
    )
