import java.time.Instant

fun main() {
    println("\n *** Delegation pattern code ***\n")

    val book = Book(
        Instant.now(), "Sam",
        BasePublication("Kotlin Standard Library Cookbook", Integer.MAX_VALUE))

    println("${book.title} written by ${book.author} has ${book.pageCount} pages.")

}

class BasePublication(override val title: String,
                      override val pageCount: Int): Publication