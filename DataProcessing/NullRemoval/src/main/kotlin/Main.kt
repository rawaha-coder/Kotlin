fun main(args: Array<String>) {
    println("\n*** Automatic null removal code ***\n")

    getNews().filterNotNull()
        .forEachIndexed {index, news ->
        println("$index. $news")
    }

    println("\n******************************\n")

    getNews().forEachIndexed { index, news ->
        println("$index. ${news.toString()}")
    }
}

data class News(val title: String, val url: String)


fun getNews() = listOf(
    News("Kotlin 1.2.40 is out!", "https://blog.jetbrains.com/kotlin/"),
    News("Google launches Android KTX Kotlin extensions for developers",
        "https://android-developers.googleblog.com/"),
    null,
    null,
    News("How to Pick a Career", "waitbutwhy.com")
)