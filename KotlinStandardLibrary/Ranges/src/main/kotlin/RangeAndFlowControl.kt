import java.lang.IllegalStateException
import kotlin.random.Random

class RangeAndFlowControl {
    fun printRanges(){

        println("\n *** Ranges and flow control Examples ***\n")

        val randomInt1 = Random.nextInt()

        if (randomInt1 in 0..10) {
            print("$randomInt1 belongs to <0, 10> range")
        } else {
            print("$randomInt1 doesn't belong to <0, 10> range")
        }
        println()
    }

    enum class Grade { A, B, C, D }

    fun computerGrade(score: Int): Grade =
        when(score){
        in 90..100 -> Grade.A
            in 75 until 90 -> Grade.B
            in 60 until 75 -> Grade.C
            in 0 until 60 -> Grade.D
            else -> throw IllegalStateException("Wrong score value!")
    }
}
