import java.io.File
import java.io.File.separator as SEPARATOR

fun main(args: Array<String>) {

    println("\n*** Writing to a file code ***\n")

//Writing to a file using writeText()
    println("\n\n*** Writing to a file using writeText() ***")
    val text = "\"No one in the brief history of computing " +
            "has ever written a piece of perfect software. " +
            "It's unlikely that you'll be the first.\" - Andy Hunt"
    val fileName = "src${SEPARATOR}main${SEPARATOR}resources${SEPARATOR}temp_file"
    val file = File(fileName)
    file.apply {
        writeText(text)
    }
    file.readText().apply { println(this) }

//Writing to a file using bufferedWriter()
    println("\n\n*** Writing to a file using bufferedWriter() ***")

    val largeText = text + "\n" + text + "\n" + text + "\n" + text + "\n" + text
    val largeFileName = "src${SEPARATOR}main${SEPARATOR}resources${SEPARATOR}large_File"
    val largeFile = File(largeFileName)
    largeFile.bufferedWriter().use { out ->
        out.write(largeText )
    }
    largeFile.readText().apply { println(this) }

//Writing to a file using appendText()
    println("\n\n*** Writing to a file using appendText() ***")
    val filePathName = "src${SEPARATOR}main${SEPARATOR}resources${SEPARATOR}file"
    val newFile = File(filePathName)
    if (newFile.exists()) newFile.delete()
    newFile.apply {
                appendText("\"A language that doesn't affect the way you think ")
                appendText("about programming ")
                appendText("is worth knowing.\"")
                appendText("\n")
                appendBytes("Alan Perlis".toByteArray())
    }
    newFile.readText().let { println(it) }

//Easy file copying
    println("\n\n*** Easy file copying ***")
    val sourceFileName = "src${SEPARATOR}main${SEPARATOR}resources${SEPARATOR}source_file.txt"
    val sourceFile = File(sourceFileName)
    val targetFileName = "src${SEPARATOR}main${SEPARATOR}resources${SEPARATOR}file_copy.txt"
    val targetFile = File(targetFileName)
    if (targetFile.exists()) targetFile.delete()
    sourceFile.copyTo(targetFile)

    File(sourceFileName).readText().apply { println(this) }
    File(targetFileName).readText().apply { println(this) }
}