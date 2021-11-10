import java.util.concurrent.ConcurrentHashMap
import kotlin.system.measureNanoTime

fun main() {

    fun factorial(n: Int): Long = if (n == 1) n.toLong() else n * factorial(n - 1)

    val cachedFactorial = ::factorial.memoized()

    println(" Execution time: " + measureNanoTime { cachedFactorial(12) } + " ns")

    println(" Execution time: " + measureNanoTime { cachedFactorial(13) } + " ns")

}

class Memoizer<P, R> private constructor() {
    private val map = ConcurrentHashMap<P, R>()
    private fun doMemoize(function: (P) -> R):
                (P) -> R = { param: P ->
        map.computeIfAbsent(param) { param: P ->
            function(param)
        }
    }

    companion object {
        fun <T, U> memoize(function: (T) -> U): (T) -> U =
            Memoizer<T, U>().doMemoize(function)
    }
}

fun <P, R> ((P) -> R).memoized(): (P) -> R = Memoizer.memoize<P, R>(this)