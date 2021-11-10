import java.lang.Thread.sleep

fun main() {
    println("\n ***  ***\n")

    val duration = measureTime {
        factorial(13)
    }

    println("$duration ms")

    fun foo() = sleep(1000)
    val duration1 = measureTime(::foo)
    print("$duration1 ms")
}

fun measureTime(block: () -> Unit): Long {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    return end - start
}

fun factorial(n: Int): Long {
    sleep(10)
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}