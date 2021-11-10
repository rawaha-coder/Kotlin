fun main() {
    println("\n *** Building strings code ***\n")

    val listAddress = listOf(
        Address("rachil@gmail.com", "Rachil Hofman"),
        Address("mickel@gmail.com", "Mickel Rossing"),
        Address("Zakaria@gmail.com", "Zakaria kadiri")
    )

    println(listAddress.map {
        it.emailAddress
    })
    println("\n *************************\n")

    println(generateRecipientsString(listAddress))

    println("\n *************************\n")

    println(generateRecipientsString2(listAddress))
}

data class Address(val emailAddress: String, val displayName: String)

fun generateRecipientsString(recipients: List<Address?>): String =
    recipients.filterNotNull()
        .map { it.emailAddress }
        .joinToString(", ", "To: ", "<br/>")

fun generateRecipientsString2(recipients: List<Address?>): String =
    recipients.filterNotNull()
        .joinToString(", ", "To: ", "<br/>") { it.emailAddress }