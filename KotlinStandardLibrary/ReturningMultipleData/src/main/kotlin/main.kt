fun main(args: Array<String>) {
    println("\n*** Returning multiple data code ***\n")

    val dividend = 10
    val divisor = 3
    val (quotient, remainder) = divide(dividend, divisor)
    println("$dividend / $divisor = $quotient r $remainder")

    println("\n*****************\n")

    fun getBestScore(): Pair<String, Int> = Pair("Max", 1000)
    val (name, score) = getBestScore()
    println("User $name has the best score of $score points")
}

data class DivisionResult(val quotient: Int, val remainder: Int)

fun divide(dividend: Int, divisor: Int): DivisionResult {
    val quotient = dividend.div(divisor)
    val remainder = dividend.rem(divisor)
    return DivisionResult(quotient, remainder)
}