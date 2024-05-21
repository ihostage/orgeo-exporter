package tourism.exporter.orgeo

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import okio.IOException

object OrgeoReciever {
    private val baseUrl = "https://orgeo.ru/online/finish"

    private val client: OkHttpClient = OkHttpClient()

    private var objectMapper: ObjectMapper =
        ObjectMapper()
            .registerModule(KotlinModule.Builder().build())
            .registerModule(JavaTimeModule())
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    fun getSplits(
        eventId: String,
        subId: String,
        category: String,
    ): OrgeoResponse {
        // https://orgeo.ru/online/finish/34974?api=json&d=девушки&s=1
        val httpUrl =
            baseUrl.toHttpUrl().newBuilder()
                .addPathSegment(eventId)
                .addQueryParameter("api", "json")
                .addQueryParameter("s", subId)
                .addQueryParameter("d", category)
                .build()
        val request: Request =
            Request.Builder()
                .url(httpUrl)
                .build()

        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")

            return objectMapper.readValue(response.body.string(), OrgeoResponse::class.java)
        }
    }
}
