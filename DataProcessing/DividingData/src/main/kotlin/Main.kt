import java.time.Instant

fun main() {
    println("\n *** Dividing data into subsets code *** \n")

    val messages = listOf(
        Message("Any plans for the evening?"),
        Message("Learning Kotlin, of course"),
        Message("I'm going to watch the new Star Wars movie"),
        Message("Would u like to join?"),
        Message("Meh, I don't know"),
        Message("See you later!"),
        Message("I like ketchup"),
        Message("Did you send CFP for Kotlin Conf?"),
        Message("Sure!")
    )

    val pagedMessages = messages.windowed(4, partialWindows = true,
        step = 4) {
        it.map { it.text }
    }

    pagedMessages.forEach { println(it) }

    println("************************************")
}

data class Message(val text: String, val time: Instant = Instant.now())