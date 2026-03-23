package tourism.exporter

import tourism.exporter.distance.chmo.ChMO_26_Ski_Pair
import tourism.exporter.googlesheets.GoogleSheetsImporter
import tourism.exporter.orgeo.OrgeoReciever

fun main() {
    // Orgeo Test https://docs.google.com/spreadsheets/d/1UR0XH6FxLsNTHCj39FCbhJ-87kA2erIs_3fvd-SEmlo/
    GoogleSheetsImporter.sheetId = "1UR0XH6FxLsNTHCj39FCbhJ-87kA2erIs_3fvd-SEmlo"
    // Сборной МО 5 класс https://docs.google.com/spreadsheets/d/1JH1R9DmHwbh8zOXspYa5UHaOxhljhegJgirC3Pr2zMg/
    // GoogleSheetsImporter.sheetId = "1JH1R9DmHwbh8zOXspYa5UHaOxhljhegJgirC3Pr2zMg"
    // Сборной МО 3/4 класс https://docs.google.com/spreadsheets/d/1IalMl9eYJUVWdXPu1lfv-bydwu0wiLI2jUQNtvUnuk4/
    // GoogleSheetsImporter.sheetId = "1IalMl9eYJUVWdXPu1lfv-bydwu0wiLI2jUQNtvUnuk4"
    // Лёха Безруков https://docs.google.com/spreadsheets/d/1mSvBTc0YZG681Vm1fZxfxEqP4KZCNdUN_3VYnZyd6IE/
    // GoogleSheetsImporter.sheetId = "1mSvBTc0YZG681Vm1fZxfxEqP4KZCNdUN_3VYnZyd6IE"
    val distances: List<Distance> = listOf(ChMO_26_Ski_Pair)
    distances.forEach { distance ->
        val results =
            distance.categories.map { category ->
                if (distance.orgeoEventId != null && distance.orgeoSubId != null) {
                    Calculator.processOrgeoData(
                        category.first,
                        category.second.map { OrgeoReciever.getSplits(distance.orgeoEventId, distance.orgeoSubId, it) },
                        distance,
                    )
                } else {
                    Calculator.processSportOrgData(
                        category.first,
                        category.second,
                        distance,
                    )
                }
            }
        GoogleSheetsImporter(distance, results).import()
    }
}
