fun main(args: Array<String>) {
    println("\n*** Extending functionalities of classes code ***\n")

    val array: Array<String> = arrayOf("a", "b", "c", "d")
    println("Array before swap: ${array.joinToString()}")
    array.swap("c", "b")
    println("Array after swap: ${array.joinToString()}")

    val listInt = listOf(1, 2, 6, 9)
    println("The list: ${listInt.joinToString()}")
    println("last index of the list: ${listInt.lastIndex}")
    println("last element of the list: ${listInt.lastElement}")

}

