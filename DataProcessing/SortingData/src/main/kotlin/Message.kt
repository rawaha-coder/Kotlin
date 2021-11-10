import java.time.Instant

data class Message(
    val text: String,
    val sender: String,
    val receiver: String,
    val time: Instant = Instant.now()
)