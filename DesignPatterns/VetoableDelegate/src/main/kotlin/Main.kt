import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main() {
    println("\n***  Vetoable Delegate Code ***\n")

    val initialTemperature = 1
    val updateCondition: (KProperty<*>, Int, Int) -> Boolean =
        { _, oldValue: Int, newValue: Int -> Math.abs(oldValue - newValue) >= 10 }
    var temperature: Int by Delegates.vetoable(initialTemperature, updateCondition)

    temperature = 10
    println("Current temperature: $temperature")
    temperature = 11
    println("Current temperature: $temperature")
    temperature = 12
    println("Current temperature: $temperature")
    temperature = 30
    println("Current temperature: $temperature")

}