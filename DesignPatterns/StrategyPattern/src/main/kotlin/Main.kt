import java.util.*

fun main() {
    println("\n*** Strategy pattern code ***\n")

    val lowerCasePrinter = Printer(lowerCaseFormattingStrategy)
    val upperCasePrinter = Printer(upperCaseFormattingStrategy)

    val text = "This functional-style Strategy pattern looks tasty!"
    
    lowerCasePrinter.printText(text)
    upperCasePrinter.printText(text)

}

class Printer(val textFormattingStrategy: (String) -> String) {
    fun printText(text: String) {
        val processedText = textFormattingStrategy(text)
        println(processedText)
    }
}

val lowerCaseFormattingStrategy: (String) -> String = {
    it.lowercase(Locale.getDefault())
}
val upperCaseFormattingStrategy: (String) -> String = {
    it.uppercase(Locale.getDefault())
}