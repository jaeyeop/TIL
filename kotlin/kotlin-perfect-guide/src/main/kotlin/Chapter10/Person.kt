package Chapter10

data class Person (
    @JsonName("alias") val firstName: String,
    @JsonExclude val age: Int? = null
)

