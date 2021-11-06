class RangeExpressions {
    fun printRanges(){

        println("\n *** Range Expressions Examples ***\n")

        val range1: IntRange = 0.rangeTo(100)
        val range2 : IntRange = 0..50
        println(range1.first)
        println(range2.last)
        println(range1.isEmpty())
        println(range2.contains(50))

        val rangeLong : LongRange = 0L.rangeTo(10L)
        for (num in rangeLong) print(num)

        println()
        for (letter in 'z' downTo 'a') print(letter)

        println()
        val range4 = CharRange('A', 'Z')
        for (letter in range4) print(letter)

        println()
        val container = 0.rangeTo(10)
        (0 until container.last).forEach {
            print(it)
        }

        println()
        val daysOfYear: IntRange = 1..365
        for(day in daysOfYear.reversed() step 100) {
            println("Remaining days: $day")
        }

        val progression: IntProgression = 0..1000 step 250

        for(i in progression) println(i)

        println("*************************")

        var i = 0
        while (i <= 1000) {
            println(i)
            i += 250
        }

        println("*************************")

        ('z' downTo 'a' step 2).forEach { character -> print(character) }
    }
}