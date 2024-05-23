package tourism.exporter

import tourism.exporter.googlesheets.GoogleSheetsImporter
import tourism.exporter.orgeo.OrgeoReciever

fun main() {
    val distance = CHiPMO2024LongM
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
