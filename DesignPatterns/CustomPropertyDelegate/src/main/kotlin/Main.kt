fun main() {
    println("\n*** Custom Property Delegate Code ***\n")

    val initialTemperature = 1
    val updatePrecondition: (Int, Int) -> Boolean =
        { oldValue, newValue -> Math.abs(oldValue - newValue) >= 10
        }
    val updateListener: (Int, Int) -> Unit = { _, newValue ->
        println(newValue) }

    var temperature: Int by ObservableVetoable(initialTemperature,
        updatePrecondition,
        updateListener)

    temperature = 11
    temperature = 12
    temperature = 13
    temperature = 14
    temperature = 30
    
}