import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis



fun main() {
    println("\n*** Coroutines, concurrent execution of tasks ***\n")

    printCurrentThreadName()
    val time = measureTimeMillis{
        runBlocking {
            launch(newSingleThreadContext("SushiThread")) {
                printCurrentThreadName()
                val riceCookingJob = launch {
                    cookRice()
                }
                println("Current thread is not blocked while rice is being cooked")
                prepareFish()
                cutVegetable()
                riceCookingJob.join()
                rollTheSushi()
            }
        }
    }
    println("Total time: $time ms")

}

private fun cookRice() {
    println("Starting to cook rice on ${getCurrentThreadName()}")
    Thread.sleep(10000)
    println("Rice cooked")
}
private fun prepareFish() {
    println("Starting to prepare fish on ${getCurrentThreadName()}")
    Thread.sleep(2000)
    println("Fish prepared")
}
private fun cutVegetable() {
    println("Starting to cut vegetables on ${getCurrentThreadName()}")
    Thread.sleep(2000)
    println("Vegetables ready")
}
private fun rollTheSushi() {
    println("Starting to roll the sushi on ${getCurrentThreadName()}")
    Thread.sleep(2000)
    println("Sushi rolled")
}

private fun printCurrentThreadName() {
    println("Running on ${getCurrentThreadName()}")
    println()
}

private fun getCurrentThreadName(): String = Thread.currentThread().name