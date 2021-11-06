import java.time.LocalDate

fun main(args: Array<String>) {
    println("\n *** Progression Codes ***\n")
    
    val startDate = LocalDate.of(2020, 1, 1)
    val endDate = LocalDate.of(2020, 12, 31)
    for (date in startDate..endDate step 7) {
        println("${date.dayOfWeek} $date ")
    }
}

operator fun LocalDate.rangeTo(other: LocalDate) = DateProgression(this, other)