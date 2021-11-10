import java.time.Instant

fun main() {
    println("\n*** Filtering Datasets Code ***\n")

    fun getMessages() = mutableListOf(
        Message("Je t'aime", "Agat", "Sam", Folder.INBOX),
        Message("Hey, Let's go climbing tomorrow", "Stefan", "Sam", Folder.INBOX),
        Message("<3", "Sam", "Agat", Folder.SENT),
        Message("Yeah!", "Sam", "Stefan", Folder.SENT)
    )

    getMessages().filter {
        it.folder == Folder.INBOX && it.sender == "Agat" }
        .forEach { (text) ->
            println(text)
        }
}

data class Message(val text: String,
                   val sender: String,
                   val receiver: String,
                   val folder: Folder = Folder.INBOX,
                   val timestamp: Instant = Instant.now())

enum class Folder { INBOX, SENT }