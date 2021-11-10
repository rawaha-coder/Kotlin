

fun main() {
    println("\n*** Lambda Expression code ***\n")

    val square = { number: Int -> number * number }
    val nine = square(3)

    println(nine)

    val magnitude100String = { input : Int ->
        val magnitude = input * 100
        magnitude.toString()
    }

    println(magnitude100String(50))

    val callback: () -> Unit = { println("The job is done!") }
    callback.invoke()
    callback()

    myHideText {txt -> hideText(txt) }.invoke("password")

}

fun hideText(text: String): Unit {
    val txt = text.plus(" : will be hide")
    println(txt)
}

fun myHideText(lmbd:(String)->Unit) = { txt: String ->
     lmbd(txt)
}

