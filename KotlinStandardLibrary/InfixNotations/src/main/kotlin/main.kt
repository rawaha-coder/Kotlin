fun main(args: Array<String>) {
    println("\n*** Infix notations for functions code ***\n")

    infix fun String.concat(next: String): String = this + next

    print("This " concat "is " concat "weird ")

}