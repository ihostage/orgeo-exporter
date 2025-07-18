package tourism.exporter.googlesheets

import com.google.api.client.auth.oauth2.Credential
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.JsonFactory
import com.google.api.client.json.gson.GsonFactory
import com.google.api.client.util.store.MemoryDataStoreFactory
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.SheetsScopes
import com.google.api.services.sheets.v4.model.AddConditionalFormatRuleRequest
import com.google.api.services.sheets.v4.model.AddSheetRequest
import com.google.api.services.sheets.v4.model.AutoResizeDimensionsRequest
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest
import com.google.api.services.sheets.v4.model.BooleanCondition
import com.google.api.services.sheets.v4.model.BooleanRule
import com.google.api.services.sheets.v4.model.Border
import com.google.api.services.sheets.v4.model.Borders
import com.google.api.services.sheets.v4.model.CellData
import com.google.api.services.sheets.v4.model.CellFormat
import com.google.api.services.sheets.v4.model.ConditionValue
import com.google.api.services.sheets.v4.model.ConditionalFormatRule
import com.google.api.services.sheets.v4.model.DeleteConditionalFormatRuleRequest
import com.google.api.services.sheets.v4.model.DimensionRange
import com.google.api.services.sheets.v4.model.GradientRule
import com.google.api.services.sheets.v4.model.GridProperties
import com.google.api.services.sheets.v4.model.GridRange
import com.google.api.services.sheets.v4.model.InterpolationPoint
import com.google.api.services.sheets.v4.model.NumberFormat
import com.google.api.services.sheets.v4.model.RepeatCellRequest
import com.google.api.services.sheets.v4.model.Request
import com.google.api.services.sheets.v4.model.Sheet
import com.google.api.services.sheets.v4.model.SheetProperties
import com.google.api.services.sheets.v4.model.Spreadsheet
import com.google.api.services.sheets.v4.model.TextFormat
import com.google.api.services.sheets.v4.model.UpdateBordersRequest
import com.google.api.services.sheets.v4.model.UpdateSheetPropertiesRequest
import com.google.api.services.sheets.v4.model.UpdateValuesResponse
import com.google.api.services.sheets.v4.model.ValueRange
import org.apache.commons.lang3.time.DurationFormatUtils.formatDuration
import tourism.exporter.Distance
import tourism.exporter.Result
import tourism.exporter.RunPoint
import tourism.exporter.TechnicalPoint
import tourism.exporter.colName
import tourism.exporter.googlesheets.Alignment.CENTER
import tourism.exporter.googlesheets.Borders.BottomSolidThick
import tourism.exporter.googlesheets.Borders.LeftSolidThick
import tourism.exporter.googlesheets.Borders.RightSolidThick
import tourism.exporter.googlesheets.Borders.SolidMedium
import tourism.exporter.googlesheets.Colors.BlueLight
import tourism.exporter.googlesheets.Colors.Green
import tourism.exporter.googlesheets.Colors.Red
import tourism.exporter.googlesheets.Colors.Yellow
import tourism.exporter.googlesheets.Fonts.Exo2
import tourism.exporter.googlesheets.Fonts.Exo2Bold
import tourism.exporter.googlesheets.Formats.Percent
import tourism.exporter.googlesheets.Formats.ResultTimeFormat
import tourism.exporter.googlesheets.Formats.SplitTimeFormat
import java.io.InputStreamReader
import java.util.Locale

class GoogleSheetsImporter(
    private val distance: Distance,
    private val results: List<Result>,
) {
    private val spreadsheet: Spreadsheet
        get() = sheets.spreadsheets().get(sheetId).execute()
    private lateinit var sheet: Sheet

    private val sheetName: String = distance.name
    private val countBestRows = results.size

    // Заголовок + Идеальное прохождение + Участники + Пустые строки между протоколами
    private val countRows: Int = 1 + countBestRows + results.sumOf { it.players.size } + (countBestRows - 1)
    private val countCols: Int = StartCols.size + distance.points.size + FinishCols.size
    private val firstBestRow: Int = 2
    private val firstResultRow: Int = 1 + results.size + 1 // Заголовок + строки идеального прохождения

    // Номера столбцов
    private val placeColumn = StartCols.indexOf(TitleNames.PLACE) + 1
    private val fioColumn = StartCols.indexOf(TitleNames.FIO) + 1
    private val teamColumn = StartCols.indexOf(TitleNames.TEAM) + 1
    private val resultColumn = StartCols.indexOf(TitleNames.RESULT) + 1
    private val percentColumn = StartCols.indexOf(TitleNames.PERCENT) + 1
    private val firstSplitColumn = StartCols.size + 1
    private val techSumColumn = StartCols.size + distance.points.size + FinishCols.indexOf(TitleNames.TECH_SUM) + 1
    private val techPercentColumn = StartCols.size + distance.points.size + FinishCols.indexOf(TitleNames.TECH_PERCENT) + 1
    private val techRankColumn = StartCols.size + distance.points.size + FinishCols.indexOf(TitleNames.TECH_RANK) + 1
    private val runSumColumn = StartCols.size + distance.points.size + FinishCols.indexOf(TitleNames.RUN_SUM) + 1
    private val runPercentColumn = StartCols.size + distance.points.size + FinishCols.indexOf(TitleNames.RUN_PERCENT) + 1
    private val runPaceColumn = StartCols.size + distance.points.size + FinishCols.indexOf(TitleNames.RUN_PACE) + 1
    private val runRankColumn = StartCols.size + distance.points.size + FinishCols.indexOf(TitleNames.RUN_RANK) + 1

    fun import() {
        createSheetIfNotExist()
        writeTitle()
        formatSheet()
        writeResults()
        formatGradient()
        formatMoscowRegion()
        autoResize()
    }

    private fun writeResults() {
        var startRow = firstResultRow
        var bestLineRow = firstBestRow
        for (result in results) {
            writePlayerResults(startRow, result)
            writeBestLine(bestLineRow, startRow, result)
            startRow += result.players.size + 1
            bestLineRow += 1
        }
    }

    private fun createSheetIfNotExist() {
        if (spreadsheet.sheets.none { it.properties.title == sheetName }) {
            updateSheet(
                Request().setAddSheet(
                    AddSheetRequest().setProperties(
                        SheetProperties().setTitle(sheetName).setIndex(0),
                    ),
                ),
            )
        }
        sheet = spreadsheet.sheets.find { it.properties.title == sheetName }!!
        updateSheet(
            Request().setUpdateSheetProperties(
                UpdateSheetPropertiesRequest()
                    .setProperties(
                        SheetProperties().setSheetId(sheet.properties.sheetId).apply {
                            gridProperties =
                                GridProperties().apply {
                                    // Заголовок + Идеальное прохождение
                                    frozenRowCount = 1 + results.size
                                    frozenColumnCount = 2
                                    columnCount = countCols
                                    rowCount = countRows
                                }
                        },
                    ).setFields("gridProperties(frozenRowCount,frozenColumnCount,columnCount,rowCount)"),
            ),
        )
    }

    private fun writeTitle() {
        updateRawValues(
            "$sheetName!A1",
            listOf(
                mutableListOf<Any>().apply {
                    addAll(StartCols)
                    addAll(distance.points.map { it.name })
                    addAll(FinishCols)
                },
            ),
        )
    }

    private fun writeBestLine(
        row: Int,
        startRow: Int,
        result: Result,
    ) {
        val endRow = startRow + result.countSuccessFinish - 1
        updateUserEnteredValues(
            "$sheetName!B$row",
            listOf(
                mutableListOf<Any>().apply {
                    addAll(
                        listOf(
                            "Идеальное прохождение (${result.name})",
                            "",
                            "=SUM(${firstSplitColumn.colName}$row:${(firstSplitColumn + distance.points.size - 1).colName}$row)",
                            "=D$row/\$D\$$startRow",
                        ),
                    )
                    addAll(
                        (0..<distance.points.size).map {
                            val range =
                                "${(firstSplitColumn + it).colName}$startRow:${(firstSplitColumn + it).colName}$endRow"
                            "=MINIFS($range;$range;\"<>0\")"
                        },
                    )
                    add("=${distance.technicalIndexes.joinToString("+") { "${(firstSplitColumn + it).colName}$row" }}")
                    add("=${techSumColumn.colName}$row/MINIFS(${techSumColumn.colName}$startRow:${techSumColumn.colName}$endRow;${techSumColumn.colName}$startRow:${techSumColumn.colName}$endRow;\"<>0\")")
                    add("")
                    if (distance.runIndexes.isNotEmpty()) {
                        add("=${distance.runIndexes.joinToString("+") { "${(firstSplitColumn + it).colName}$row" }}")
                        add("=${runSumColumn.colName}$row/MINIFS(${runSumColumn.colName}$startRow:${runSumColumn.colName}$endRow;${techSumColumn.colName}$startRow:${techSumColumn.colName}$endRow;\"<>0\")")
                        add("")
                        add("")
                    } else {
                        addAll(listOf("", "", "", ""))
                    }
                },
            ),
        )
    }

    private fun writePlayerResults(
        startRow: Int,
        result: Result,
    ) {
        val endRow = startRow + result.countSuccessFinish - 1
        val values =
            result.players.mapIndexed { index, player ->
                mutableListOf<Any>().apply {
                    val row = startRow + index
                    // Место
                    add(if (player.isSuccessFinish) index + 1 else "")
                    // Фамилия Имя
                    add(player.name)
                    // Команда
                    add(player.team)
                    // Результат
                    add(formatDuration(player.result.inWholeMilliseconds, "HH:mm:ss"))
                    // % рез.
                    add("=${resultColumn.colName}$row/\$${resultColumn.colName}\$$startRow")
                    // Сплиты
                    addAll(
                        player.split.map {
                            // TODO: нужно как-то учитывать отсечки, чтобы перегон на финиш не был отрицательным
                            if (it.time.inWholeMilliseconds > 0) {
                                formatDuration(it.time.inWholeMilliseconds, "HH:mm:ss")
                            } else {
                                ""
                            }
                        },
                    )
                    // ∑ Этапы
                    add(
                        if (player.isGoodSplit) {
                            "=${distance.technicalIndexes.joinToString("+") { "${(firstSplitColumn + it).colName}$row" }}"
                        } else {
                            ""
                        }
                    )
                    // % эт.
                    add(
                        if (player.isGoodSplit) {
                            "=${techSumColumn.colName}$row/MIN(\$${techSumColumn.colName}\$$startRow:\$${techSumColumn.colName}\$$endRow)"
                        } else {
                            ""
                        }
                    )
                    // Ранг эт.
                    add(
                        if (player.isSuccessFinish && player.isGoodSplit) {
                            "=RANK(${techSumColumn.colName}$row;\$${techSumColumn.colName}\$$startRow:\$${techSumColumn.colName}\$$endRow; 1)"
                        } else {
                            ""
                        },
                    )
                    if (distance.runIndexes.isNotEmpty()) {
                        val runSumCol = runSumColumn.colName
                        // ∑ Перебеги
                        add(
                            if (player.isGoodSplit) {
                                "=${distance.runIndexes.joinToString("+") { "${(firstSplitColumn + it).colName}$row" }}"
                            } else {
                                ""
                            }
                        )
                        // % пер.
                        add(
                            if (player.isGoodSplit) {
                                "=$runSumCol$row/MIN(\$$runSumCol\$$startRow:\$$runSumCol\$$endRow)"
                            } else {
                                ""
                            }
                        )
                        // Темп
                        add(
                            if (player.isGoodSplit) {
                                "=$runSumCol$row/${
                                    "%.2f".format(
                                        RussiaLocale,
                                        distance.points.filterIsInstance<RunPoint>().sumOf { it.length } / 1000.0,
                                    )
                                }"
                            } else {
                                ""
                            }
                        )
                        // Ранг пер.
                        if (player.isSuccessFinish && player.isGoodSplit) {
                            add("=RANK($runSumCol$row;\$$runSumCol\$$startRow:\$$runSumCol\$$endRow; 1)")
                        } else {
                            add("")
                        }
                    } else {
                        addAll(listOf("", "", "", ""))
                    }
                }
            }
        updateUserEnteredValues("$sheetName!A$startRow", values)
    }

    private fun updateSheet(vararg requests: Request) =
        sheets
            .spreadsheets()
            .batchUpdate(sheetId, BatchUpdateSpreadsheetRequest().setRequests(requests.asList()))
            .execute()

    private fun updateValues(
        range: String,
        valueInputOption: String,
        values: List<List<Any>>,
    ): UpdateValuesResponse =
        sheets
            .spreadsheets()
            .values()
            .update(sheetId, range, ValueRange().setValues(values))
            .setValueInputOption(valueInputOption)
            .execute()

    private fun updateRawValues(
        range: String,
        values: List<List<Any>>,
    ): UpdateValuesResponse = updateValues(range, "RAW", values)

    private fun updateUserEnteredValues(
        range: String,
        values: List<List<Any>>,
    ): UpdateValuesResponse = updateValues(range, "USER_ENTERED", values)

    private fun formatTitle() = updateSheet(repeatCell(oneRowRange(1), CENTER, Exo2Bold, borders = BottomSolidThick))

    private fun formatPlaceColumn() = updateSheet(repeatCell(oneColRange(placeColumn), CENTER, Exo2))

    private fun formatFioColumn() = updateSheet(repeatCell(oneColRange(fioColumn), textFormat = Exo2))

    private fun formatTeamColumn() = updateSheet(repeatCell(oneColRange(teamColumn), textFormat = Exo2))

    private fun formatResultColumn() = updateSheet(repeatCell(oneColRange(resultColumn), CENTER, Exo2, ResultTimeFormat))

    private fun formatPercentColumn() = updateSheet(repeatCell(oneColRange(percentColumn), CENTER, Exo2, Percent, RightSolidThick))

    private fun formatSplitColumns() =
        updateSheet(
            requests =
                distance.points
                    .mapIndexed { index, point ->
                        repeatCell(
                            oneColRange(firstSplitColumn + index),
                            CENTER,
                            if (point is TechnicalPoint) Exo2Bold else Exo2,
                            SplitTimeFormat,
                        )
                    }.toTypedArray(),
        )

    private fun formatTechSumColumn() =
        updateSheet(repeatCell(oneColRange(techSumColumn), CENTER, Exo2Bold, ResultTimeFormat, LeftSolidThick))

    private fun formatTechPercentColumn() = updateSheet(repeatCell(oneColRange(techPercentColumn), CENTER, Exo2Bold, Percent))

    private fun formatTechRankColumn() = updateSheet(repeatCell(oneColRange(techRankColumn), CENTER, Exo2Bold))

    private fun formatRunSumColumn() = updateSheet(repeatCell(oneColRange(runSumColumn), CENTER, Exo2, ResultTimeFormat))

    private fun formatRunPercentColumn() = updateSheet(repeatCell(oneColRange(runPercentColumn), CENTER, Exo2, Percent))

    private fun formatRunPaceColumn() = updateSheet(repeatCell(oneColRange(runPaceColumn), CENTER, Exo2, SplitTimeFormat))

    private fun formatRunRankColumn() = updateSheet(repeatCell(oneColRange(runRankColumn), CENTER, Exo2))

    private fun formatResultRowBlocks() {
        var startRowBlock = firstResultRow
        val requests = mutableListOf<Request>()
        for (result in results) {
            requests.add(updateBorders(oneRowRange(startRowBlock), top = SolidMedium))
            requests.add(updateBorders(oneRowRange(startRowBlock + result.players.size - 1), bottom = SolidMedium))
            startRowBlock += result.players.size + 1
        }
        updateSheet(requests = requests.toTypedArray())
    }

    private fun formatSheet() {
        formatTitle()
        formatPlaceColumn()
        formatFioColumn()
        formatTeamColumn()
        formatResultColumn()
        formatPercentColumn()
        formatSplitColumns()
        formatTechSumColumn()
        formatTechPercentColumn()
        formatTechRankColumn()
        formatRunSumColumn()
        formatRunPercentColumn()
        formatRunPaceColumn()
        formatRunRankColumn()
        formatResultRowBlocks()
    }

    private fun formatGradient() {
        sheet.conditionalFormats?.let {
            val requests =
                (it.size - 1 downTo 0)
                    .map { index ->
                        Request().setDeleteConditionalFormatRule(
                            DeleteConditionalFormatRuleRequest().setSheetId(sheet.properties.sheetId).setIndex(index),
                        )
                    }.toTypedArray()
            updateSheet(requests = requests)
        }
        val requests = mutableListOf<Request>()
        var startRow = firstResultRow
        for (result in results) {
            val endRow = startRow + result.players.size - 1
            requests.addAll(
                (0..<distance.points.size).map {
                    val minimalSplitValue = result.minimalGoodSplitValue(it)
                    addConditionalFormatRule(
                        listOf(oneColRange(firstSplitColumn + it, startRow, endRow)),
                        GradientRule().apply {
                            minpoint = InterpolationPoint().setType("PERCENTILE").setValue("5").setColor(Green)
                            midpoint = InterpolationPoint().setType("PERCENTILE").setValue("50").setColor(Yellow)
                            maxpoint = InterpolationPoint().setType("PERCENTILE").setValue("90").setColor(Red)
                        },
                    )
                },
            )
            requests.addAll(
                listOf(techSumColumn, techPercentColumn, techRankColumn, runSumColumn, runPercentColumn, runRankColumn).map {
                    addConditionalFormatRule(
                        listOf(oneColRange(it, startRow, endRow)),
                        GradientRule().apply {
                            minpoint = InterpolationPoint().setType("MIN").setColor(Green)
                            midpoint = InterpolationPoint().setType("PERCENT").setValue("50").setColor(Yellow)
                            maxpoint = InterpolationPoint().setType("MAX").setColor(Red)
                        },
                    )
                },
            )
            startRow += result.players.size + 1
        }
        updateSheet(requests = requests.toTypedArray())
    }

    private fun formatMoscowRegion() =
        updateSheet(
            addConditionalFormatRule(
                listOf(
                    rowRange(firstResultRow, placeColumn, percentColumn),
                    oneColRange(runPaceColumn, firstResultRow),
                ),
                booleanRule =
                    BooleanRule().apply {
                        condition =
                            BooleanCondition()
                                .setType("CUSTOM_FORMULA")
                                .setValues(
                                    listOf(
                                        ConditionValue().setUserEnteredValue(
                                            "=REGEXMATCH(\$${teamColumn.colName}$firstResultRow; \"Москов\")",
                                        ),
                                    ),
                                )
                        format = CellFormat().setBackgroundColor(BlueLight)
                    },
            ),
        )

    private fun autoResize() {
        updateSheet(
            Request().setAutoResizeDimensions(
                AutoResizeDimensionsRequest().setDimensions(
                    DimensionRange().apply {
                        this.sheetId = sheet.properties.sheetId
                        dimension = "COLUMNS"
                        startIndex = 0
                        endIndex = countCols
                    },
                ),
            ),
        )
    }

    private fun rowRange(
        startRow: Int,
        startCol: Int? = null,
        endCol: Int? = null,
    ) = GridRange().apply {
        this.sheetId = sheet.properties.sheetId
        startRowIndex = startRow - 1
        startCol?.let { setStartColumnIndex(it - 1) }
        endCol?.let { setEndColumnIndex(it) }
    }

    private fun oneRowRange(row: Int) =
        GridRange().apply {
            this.sheetId = sheet.properties.sheetId
            startRowIndex = row - 1
            endRowIndex = row
        }

    private fun oneColRange(
        col: Int,
        startRow: Int = 2,
        endRow: Int? = null,
    ) = GridRange().apply {
        this.sheetId = sheet.properties.sheetId
        startRowIndex = startRow - 1
        endRow?.let { setEndRowIndex(it) }
        startColumnIndex = col - 1
        endColumnIndex = col
    }

    private fun formatCell(
        horizontalAlignment: String? = null,
        textFormat: TextFormat? = null,
        numberFormat: NumberFormat? = null,
        borders: Borders? = null,
    ): CellData =
        CellData().apply {
            userEnteredFormat =
                CellFormat().apply {
                    horizontalAlignment?.let { setHorizontalAlignment(it) }
                    textFormat?.let { setTextFormat(it) }
                    borders?.let { setBorders(it) }
                    numberFormat?.let { setNumberFormat(it) }
                }
        }

    private fun repeatCell(
        range: GridRange,
        horizontalAlignment: String? = null,
        textFormat: TextFormat? = null,
        numberFormat: NumberFormat? = null,
        borders: Borders? = null,
    ) = Request().setRepeatCell(
        RepeatCellRequest().apply {
            this.range = range
            cell = formatCell(horizontalAlignment, textFormat, numberFormat, borders)
            val f =
                mutableListOf<String>().apply {
                    horizontalAlignment?.let { add("horizontalAlignment") }
                    textFormat?.let { add("textFormat") }
                    numberFormat?.let { add("numberFormat") }
                    borders?.let { add("borders") }
                }
            fields = "userEnteredFormat(${f.joinToString(",")})"
        },
    )

    private fun addConditionalFormatRule(
        ranges: List<GridRange>,
        gradientRule: GradientRule? = null,
        booleanRule: BooleanRule? = null,
    ) = Request().setAddConditionalFormatRule(
        AddConditionalFormatRuleRequest().setRule(
            ConditionalFormatRule().setRanges(ranges).apply {
                gradientRule?.let { setGradientRule(gradientRule) }
                booleanRule?.let { setBooleanRule(booleanRule) }
            },
        ),
    )

    private fun updateBorders(
        range: GridRange,
        top: Border? = null,
        bottom: Border? = null,
        left: Border? = null,
        right: Border? = null,
    ) = Request().setUpdateBorders(
        UpdateBordersRequest().apply {
            this.range = range
            top?.let { setTop(it) }
            bottom?.let { setBottom(it) }
            left?.let { setLeft(it) }
            right?.let { setRight(it) }
        },
    )

    companion object {
        private const val APPLICATION_NAME: String = "Orgeo Exporter"

        lateinit var sheetId: String
        private val RussiaLocale = Locale.of("ru")
        private val StartCols =
            listOf(
                TitleNames.PLACE,
                TitleNames.FIO,
                TitleNames.TEAM,
                TitleNames.RESULT,
                TitleNames.PERCENT,
            )
        private val FinishCols =
            listOf(
                TitleNames.TECH_SUM,
                TitleNames.TECH_PERCENT,
                TitleNames.TECH_RANK,
                TitleNames.RUN_SUM,
                TitleNames.RUN_PERCENT,
                TitleNames.RUN_PACE,
                TitleNames.RUN_RANK,
            )

        private val transport: NetHttpTransport = GoogleNetHttpTransport.newTrustedTransport()
        private val jsonFactory: JsonFactory = GsonFactory.getDefaultInstance()
        private val credentials: Credential by lazy { authorizeByCodeFlow() }
        private val sheets: Sheets by lazy {
            Sheets
                .Builder(transport, jsonFactory, credentials)
                .setApplicationName(APPLICATION_NAME)
                .build()
        }

        private fun authorizeByCodeFlow(): Credential {
            val creds = GoogleSheetsImporter::class.java.getResourceAsStream("/google-sheets-client-secret.json")!!
            val clientSecrets = GoogleClientSecrets.load(jsonFactory, InputStreamReader(creds))
            val flow =
                GoogleAuthorizationCodeFlow
                    .Builder(
                        transport,
                        jsonFactory,
                        clientSecrets,
                        listOf(SheetsScopes.SPREADSHEETS),
                    ).setDataStoreFactory(
                        MemoryDataStoreFactory(),
                    ).setAccessType("offline")
                    .build()
            return AuthorizationCodeInstalledApp(flow, LocalServerReceiver()).authorize("user")
        }
    }
}
