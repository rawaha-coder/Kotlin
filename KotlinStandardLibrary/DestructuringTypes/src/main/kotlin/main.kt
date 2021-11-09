import java.time.LocalDate

fun main(args: Array<String>) {
    println("\n*** Destructuring types code ***\n")

    fun getUser() = User("Agata", "ag@t.pl", LocalDate.of(1990, 1, 18))
    val (name, mail, birthday) = getUser()
    println("$name was born on $birthday")

    println("\n** Destructuring for function return values **\n")

    val (login, domain) = "agata@magdalena.com".split("@")
    println("login: $login, domain: $domain")

    println("\n** Destructuring for a Java class **\n")

    val (id, turnedOn) = LightBulb(1)
    println("Light bulb number $id is turned ${if (turnedOn) "on" else "off"}")

    val bulb2 = LightBulb(2)
    bulb2.turnedOn = true
    val (_, turned) = bulb2
    bulb2.turnedOn = false
    println("Light bulb number 2 is turned ${if (turned) "on" else "off"}")

    println("\n** Destructuring declarations with lambda expressions **\n")

    listOf(LightBulb(0), LightBulb(1))
        .filter { (_, isOn) -> isOn }
        .map { (id, _) -> id }

    println("\n** Destructuring declarations with an iteration **\n")

    val lightBulbsWithNames = mapOf(LightBulb(0) to "Bedroom", LightBulb(1) to "Kitchen")
    for ((lightBulb, name) in lightBulbsWithNames) {
        lightBulb.turnedOn = true
    }

}

data class User(val login: String, val email: String, val birthday: LocalDate)
