import kotlin.random.Random

fun main() {

    println("\n *** Ranges Codes ***\n")

    val rangeExpressions = RangeExpressions()

    rangeExpressions.printRanges()

    println("\n")
    val rangeAndFlowControl = RangeAndFlowControl()

    rangeAndFlowControl.printRanges()

    println("\n You grade is ${rangeAndFlowControl.computerGrade(70)}")


}