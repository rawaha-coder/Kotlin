import java.util.*

fun main() {
    println("\n *** Extension functions – let, also, apply *** \n")

    fun getPlayers(): List<Player>? = listOf(
        Player("Stefan Madej", 109),
        Player("Adam Ondra", 323),
        Player("Chris Charma", 239))

    getPlayers()?.let {
        it.also {
            println("${it.size} players records fetched")
            println(it)
        }.let {
            it.sortedByDescending { it.bestScore }
        }.let {
            it.first()
        }.apply {
            val name = this.name
            println("Best Player: $name")
        }
    }

    println("\n *** Extension function – run *** \n")

    val calendar = Calendar.Builder().run {
        setCalendarType("iso8601")
        setDate(2018, 1, 18)
        setTimeZone(TimeZone.getTimeZone("GMT-8:00"))
        build()
    }

    print(calendar.time)

}
data class Player(val name: String, val bestScore: Int)




