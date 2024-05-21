package tourism.exporter.googlesheets

import com.google.api.services.sheets.v4.model.Border
import com.google.api.services.sheets.v4.model.Color
import com.google.api.services.sheets.v4.model.NumberFormat
import com.google.api.services.sheets.v4.model.TextFormat
import com.google.api.services.sheets.v4.model.Borders as GoogleBorders

object Colors {
    val Green: Color = Color().setBlue(0.5411765f).setGreen(0.73333335f).setRed(0.34117648f)
    val Yellow: Color = Color().setBlue(0.4f).setGreen(0.8392157f).setRed(1.0f)
    val Red: Color = Color().setBlue(0.4509804f).setGreen(0.4862745f).setRed(0.9019608f)
    val BlueLight: Color = Color().setRed(164 / 255f).setGreen(194 / 255f).setBlue(244 / 255f)
}

object Fonts {
    val Exo2: TextFormat = TextFormat().setFontFamily("Exo 2").setFontSize(9).setBold(false)
    val Exo2Bold: TextFormat = TextFormat().setFontFamily("Exo 2").setFontSize(9).setBold(true)
}

object Formats {
    val SplitTimeFormat: NumberFormat = NumberFormat().setType("TIME").setPattern("[m]:ss")
    val ResultTimeFormat: NumberFormat = NumberFormat().setType("TIME").setPattern("[h]:mm:ss")
    val Percent: NumberFormat = NumberFormat().setType("NUMBER").setPattern("#%")
}

object Alignment {
    const val CENTER = "CENTER"
}

object Borders {
    val SolidThick: Border = Border().setStyle("SOLID_THICK")
    val SolidMedium: Border = Border().setStyle("SOLID_MEDIUM")
    val BottomSolidThick: GoogleBorders = GoogleBorders().setBottom(SolidThick)
    val RightSolidThick: GoogleBorders = GoogleBorders().setRight(SolidThick)
    val LeftSolidThick: GoogleBorders = GoogleBorders().setLeft(SolidThick)
}

object TitleNames {
    const val PLACE = "Место"
    const val FIO = "Фамилия Имя"
    const val TEAM = "Команда"
    const val RESULT = "Результат"
    const val PERCENT = "% рез."
    const val TECH_SUM = "∑ Этапы"
    const val TECH_PERCENT = "% эт."
    const val TECH_RANK = "Ранг эт."
    const val RUN_SUM = "∑ Перебеги"
    const val RUN_PERCENT = "% пер."
    const val RUN_PACE = "Темп"
    const val RUN_RANK = "Ранг пер."
}
