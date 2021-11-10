fun main(){

    val result: Int = ::sum.curried()(1)(2)(3)

    println(result)

}

fun <P1, P2, P3, R> ((P1, P2, P3) -> R).curried(): (P1) -> (P2) ->
    (P3) -> R =
    { p1: P1 ->
        { p2: P2 ->
            { p3: P3 ->
                this(p1, p2, p3)
            }
        }
    }

fun sum(a: Int, b: Int, c: Int): Int = a + b + c