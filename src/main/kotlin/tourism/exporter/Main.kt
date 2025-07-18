package tourism.exporter

import tourism.exporter.distance.kk.KK25Group3M
import tourism.exporter.distance.kk.KK25Group3W
import tourism.exporter.googlesheets.GoogleSheetsImporter
import tourism.exporter.orgeo.OrgeoReciever

fun main() {
    // Orgeo Test https://docs.google.com/spreadsheets/d/1UR0XH6FxLsNTHCj39FCbhJ-87kA2erIs_3fvd-SEmlo/
    // GoogleSheetsImporter.sheetId = "1UR0XH6FxLsNTHCj39FCbhJ-87kA2erIs_3fvd-SEmlo"
    // Сборной МО 5 класс https://docs.google.com/spreadsheets/d/1JH1R9DmHwbh8zOXspYa5UHaOxhljhegJgirC3Pr2zMg/
    // GoogleSheetsImporter.sheetId = "1JH1R9DmHwbh8zOXspYa5UHaOxhljhegJgirC3Pr2zMg"
    // Сборной МО 3/4 класс https://docs.google.com/spreadsheets/d/1IalMl9eYJUVWdXPu1lfv-bydwu0wiLI2jUQNtvUnuk4/
    GoogleSheetsImporter.sheetId = "1IalMl9eYJUVWdXPu1lfv-bydwu0wiLI2jUQNtvUnuk4"
    // Лёха Безруков https://docs.google.com/spreadsheets/d/1mSvBTc0YZG681Vm1fZxfxEqP4KZCNdUN_3VYnZyd6IE/
    // GoogleSheetsImporter.sheetId = "1mSvBTc0YZG681Vm1fZxfxEqP4KZCNdUN_3VYnZyd6IE"

    val distances = listOf(KK25Group3W, KK25Group3M)
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
