package tourism.exporter.sportorg

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinFeature
import com.fasterxml.jackson.module.kotlin.KotlinModule
import kotlin.io.path.Path

object SportOrgParser {

    private var objectMapper: ObjectMapper =
        ObjectMapper()
            .registerModule(KotlinModule.Builder().configure(KotlinFeature.NullIsSameAsDefault, true).build())
            .registerModule(JavaTimeModule())
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)


    fun parse(path: String): SportOrg =
        objectMapper.readValue(Path(path).toFile(), SportOrg::class.java)
}
