import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main() {
    println("\n*** Observer pattern code ***\n")

    val initialValue = 1
    val changesListener: (KProperty<*>, Int, Int) -> Unit =
        { _, _: Int, newValue: Int -> println("Current temperature:$newValue") }

    var temperature: Int by Delegates.observable(initialValue, changesListener)

    temperature = 10
    temperature = 11
    temperature = 12
    temperature = 30
}

