fun main() {

    println("\n*** Overloading operators ***\n")

    val position1 = Position(132.5f, 4f, 3.43f)
    val position2 = position1 - Position(1.5f, 400f, 11.56f)
    println(position2)

    var position = Position(132.5f, 4f, 3.5f)
    position += Position(1f, 1f, 1f)
    println(position)

    val list = mutableListOf("A", "B", "C")
    list += "D"
    println(list)

}

data class Position(val x: Float, val y: Float, val z: Float){
    operator fun plus(other: Position) = Position(x + other.x, y + other.y, z +other.z)
    operator fun minus(other: Position) = Position(x - other.x, y - other.y, z - other.z)
}
