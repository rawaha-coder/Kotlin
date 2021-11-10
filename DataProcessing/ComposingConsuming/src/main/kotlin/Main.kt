import java.time.Instant

fun main() {
    println("****************************************")
    val sentMessages = listOf (
        Message("Hi Agat, any plans for the evening?", "Samuel"),
        Message("Great, I'll take some wine too", "Samuel")
    )
    val inboxMessages = mutableListOf(
        Message("Let's go out of town and watch the stars tonight!", "Agat"),
        Message("Excelent!", "Agat")
    )

    val allMessages: List<Message> = sentMessages + inboxMessages

    allMessages.forEach { (text, _) ->
        println(text)
    }

    println("****************************************")
    val receivedMessages = allMessages - sentMessages

    receivedMessages.forEach {(text, sender) ->
        println("$sender: $text")
    }

    println("****************************************")
    for (msg in allMessages) {
        println(msg.text)
    }
}

data class Message(val text: String, val sender: String, val timestamp: Instant = Instant.now())