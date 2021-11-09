fun <T> Array<T>.swap(a: T, b: T){

    val positionA = indexOf(a)
    val positionB = indexOf(b)

    if (positionA < 0 || positionB < 0) {
        throw IllegalArgumentException("Given param doesn't belong to the array")
    }

    val tmp = this[positionA]
    this[positionA] = this[positionB]
    this[positionB] = tmp
}

val <T> List<T>.lastElement: T get() {
    return this[size-1]
}

val <T> List<T>.lastIndex: Int get() = size - 1