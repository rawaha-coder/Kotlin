import org.intellij.lang.annotations.Language

fun main() {
    println("\n*** Delegate class properties code ***\n")

    val client1 = Client(SAMPLE_CLIENT_MAP)

    val client2 = Client.fromJson(SAMPLE_CLIENT_JSON)


    println("name: ${client1.name}, mail: ${client1.email}, cards: ${client1.creditCards}")
    println("name: ${client2.name}, email: ${client2.email}, cards:${client2.creditCards}")

    val jsonFile = client1.toJson()

    println(jsonFile)
}

val SAMPLE_CLIENT_MAP = mapOf(
    "name" to "Mark Zuck",
    "email" to "mark@fb.com",
    "creditCards" to listOf(
        CreditCard(
            "Mark Zuckerberg", "123345456789", "123",
            1527330705017
        ),
        CreditCard(
            "Mark Zuckerberg", "987654321", "321",
            1527330719816
        )
    )
)

@Language("JSON")
const val SAMPLE_CLIENT_JSON =
    "{\n \"name\": \"Mark Zuck\", " +
            "\n \"email\": \"mark@fb.com\"," +
            "\n \"creditCards\": [" +
            "\n {" +
            "\n \"holderName\": \"Mark Zuckerber\"," +
            "\n \"number\": \"123345456789\"," +
            "\n \"cvc\": \"123\"," +
            "\n \"expiration\": 1527330705017" +
            "\n }," +
            "\n {" +
            "\n \"holderName\": \"Mark Zuckerber\"," +
            "\n \"number\": \"987654321\"," +
            "\n \"cvc\": \"321\"," +
            "\n \"expiration\": 1527330719816" +
            "\n }" +
            "\n ]" +
            "\n}"




