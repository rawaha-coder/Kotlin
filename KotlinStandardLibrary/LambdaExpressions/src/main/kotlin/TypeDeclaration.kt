val that : (Int) -> Int = { num ->  num + 3 }

val more : (String, Int) -> String = { str, int -> str + int }

val noReturn : (Int) -> Unit = { num -> println(num) }

val another : String.(Int) -> String = { this + it }

fun extendString(arg: String, num: Int) : String {
    val another : String.(Int) -> String = { this + it }

    return arg.another(num)
}

val calculateGrade = { grade : Int ->
    when(grade) {
        in 0..40 -> "Fail"
        in 41..70 -> "Pass"
        in 71..100 -> "Distinction"
        else -> false
    }
}
