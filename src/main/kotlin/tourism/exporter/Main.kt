package tourism.exporter

import tourism.exporter.googlesheets.GoogleSheetsImporter
import tourism.exporter.orgeo.OrgeoReciever

fun main() {
    val distance = Elec2024Sprint
    val results =
        distance.orgeoCategories.map { category ->
            Calculator.processOrgeoData(
                category.first,
                OrgeoReciever.getSplits(distance.orgeoEventId, distance.orgeoSubId, category.second),
                distance,
            )
        }
    GoogleSheetsImporter(distance, results).import()
}
