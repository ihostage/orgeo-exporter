package tourism.exporter.sportorg

import com.fasterxml.jackson.annotation.JsonProperty

data class SportOrg(
    var races: List<Races>
)

data class Races(
    var organizations: List<Organization>,
    val groups: List<Group>,
    var results: List<Result>,
    val persons: List<Person>
)

data class Group(
    val id: String,
    val name: String,
)

data class Person(
    val id: String,
    val name: String,
    val surname: String,
    @JsonProperty("group_id")
    val groupId: String,
    @JsonProperty("organization_id")
    val organizationId: String,
)

data class Result(
    @JsonProperty("person_id")
    val personId: String?,
    @JsonProperty("start_time")
    val startTime: Long,
    @JsonProperty("finish_time")
    val finishTime: Long,
    val status: Int,
    val place: Int? = null,
    val splits: List<Split>,
)

data class Split(
    val code: String,
    @JsonProperty("leg_time")
    val legTime: Int,
)

data class Organization(
    val id: String,
    val name: String,
)
