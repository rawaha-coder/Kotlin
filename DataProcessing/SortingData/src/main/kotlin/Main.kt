import java.time.Instant

fun main() {
    println("\n*** Sorting data code ***\n")

    val sentMessages = listOf(
        Message(
            "I'm programming in Kotlin, of course",
            "Samuel",
            "Agat",
            Instant.parse("2018-12-18T10:13:35Z")
        ),
        Message(
            "Sure!",
            "Samuel",
            "Agat",
            Instant.parse("2018-12-18T10:15:35Z")
        )
    )

    val inboxMessages = mutableListOf(
        Message(
            "Hey Sam, any plans for the evening?",
            "Agat",
            "Samuel",
            Instant.parse("2018-12-18T10:12:35Z")
        ),
        Message(
            "That's cool, can I join you?",
            "Agat",
            "Samuel",
            Instant.parse("2018-12-18T10:14:35Z")
        )
    )
    val allMessages = sentMessages + inboxMessages

    println("\n*** before sort ***\n")

    allMessages.forEach {
        println("${it.time}: ${it.text}")
    }

    println("\n*** after sort ***\n")

    allMessages.sortedBy { it.time }
        .forEach {
            println("${it.time}: ${it.sender} -> ${it.text}")
        }

    println("\n*** after sort with ***\n")

    allMessages.sortedWith(compareBy({it.sender}, {it.time}))
        .forEach {
            println("${it.time}: ${it.sender} -> ${it.text}")
        }

}

