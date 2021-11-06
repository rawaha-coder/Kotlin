fun main(args: Array<String>) {
    println("\n *** Sequence Code ***\n")

    println("\n *** data-processing operation through Collection ***\n")
    val collection = listOf("a", "b", "c", "d", "e", "f", "g", "h")
    val transformedCollection = collection.map {
        println("Applying map function for $it")
        it
    }
    println(transformedCollection.take(2))

    println("\n *** Data-processing operation through Sequence ***\n")
    val sequence = sequenceOf("a", "b", "c", "d", "e", "f", "g", "h")
    val transformedSequence = sequence.map {
        println("Applying map function for $it")
        it
    }
    println(transformedSequence.take(2).toList())

    println("\n *** Transforming Collection to Sequence ***\n")
    val collectionToSequence = listOf("a", "b", "c", "d", "e", "f", "g", "h").asSequence()
    val transformed1 = collectionToSequence.map {
        println("Applying map function for $it")
        it
    }
    println(transformed1.take(2).toList())

    println("\n *** Transforming Sequence to Collection ***\n")
    val sequenceToCollection = sequenceOf("a", "b", "c", "d", "e", "f", "g", "h").toList()
    val transformed2 = sequenceToCollection.map {
        println("Applying map function for $it")
        it
    }
    println(transformed2.take(2))

    println("\n *** Applying sequences to solve algorithmic problems ***\n")
    var counter = 10
    val gs: Sequence<Int> = generateSequence {
        counter--.takeIf { value: Int -> value >= 0 }
    }
    print(gs.toList())

    println("\n *** fibonacci ***\n")
    
    fun fibonacci(): Sequence<Int> {
        return generateSequence(Pair(0, 1)) { Pair(it.second, it.first
                + it.second) }
            .map { it.first }
    }

    println(fibonacci().take(20).toList())

}

