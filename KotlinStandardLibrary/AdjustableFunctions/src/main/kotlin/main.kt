fun main(args: Array<String>) {
    println("\n*** Adjustable Functions Code ***\n")

    val displacement1 = calculateDisplacement(acceleration = 9.81f, duration = 1000)
    println("displacement of the object: $displacement1")

    val displacement2 = calculateDisplacement(100f, 9.81f, 1000)
    println("displacement of the object: $displacement2")
}

fun calculateDisplacement(initialSpeed: Float = 0f,
                          acceleration: Float,
                          duration: Long): Double =
    initialSpeed * duration + 0.5 * acceleration * duration * duration