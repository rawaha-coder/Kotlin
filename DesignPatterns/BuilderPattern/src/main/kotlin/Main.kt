import java.io.File

fun main(args: Array<String>) {
    println("\n*** Builder Pattern Code ***\n")

    val dialog =
        dialog {
            title {
                "Warning!"
            }
            message {
                text = "You have 99999 viruses on your computer!"
                color = "#FF0000"
            }
            image {
                File.createTempFile("red_alert", "png")
            }
        }

    dialog.show()

}

fun dialog(block: DialogBuilder.() -> Unit): Dialog =
    DialogBuilder(block).build()