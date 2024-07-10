package tourism.exporter

import tourism.exporter.distance.KK24TeamM3
import tourism.exporter.distance.KK24TeamW3
import tourism.exporter.googlesheets.GoogleSheetsImporter
import tourism.exporter.orgeo.OrgeoReciever

fun main() {
    // Orgeo Test https://docs.google.com/spreadsheets/d/1UR0XH6FxLsNTHCj39FCbhJ-87kA2erIs_3fvd-SEmlo/
    // GoogleSheetsImporter.sheetId = "1UR0XH6FxLsNTHCj39FCbhJ-87kA2erIs_3fvd-SEmlo"
    // Тренировки и соревнования сборной МО https://docs.google.com/spreadsheets/d/1JH1R9DmHwbh8zOXspYa5UHaOxhljhegJgirC3Pr2zMg/
    GoogleSheetsImporter.sheetId = "1JH1R9DmHwbh8zOXspYa5UHaOxhljhegJgirC3Pr2zMg"

    val distances = listOf(KK24TeamM3, KK24TeamW3)
    distances.forEach { distance ->
        val results =
            distance.orgeoCategories.map { category ->
                Calculator.processOrgeoData(
                    category.first,
                    category.second.map { OrgeoReciever.getSplits(distance.orgeoEventId, distance.orgeoSubId, it) },
                    distance,
                )
            }
        GoogleSheetsImporter(distance, results).import()
    }
}
