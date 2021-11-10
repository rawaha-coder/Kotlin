import java.io.File

class DialogBuilder() {
    private var titleHolder = "-"
    private var messageHolder = StyleableText("-", "#000")
    private var imageHolder: File = File.createTempFile("empty", "")

    constructor(initBlock: DialogBuilder.() -> Unit): this() {
        initBlock()
    }

    fun title(block: () -> String) {
        titleHolder = block()
    }

    fun message(block: StyleableText.() -> Unit) {
        messageHolder.apply { block() }
    }

    fun image(block: File.() -> Unit) {
        imageHolder.apply { block() }
    }

    fun build(): Dialog = Dialog().apply {
        title = titleHolder
        message = messageHolder.text
        messageColor = messageHolder.color
        imageHolder.apply {
            image = readBytes()
        }
    }
    class StyleableText(
        var text: String = "",
        var color: String = "#000"
    )
}