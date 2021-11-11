import java.io.File
import java.io.File.separator as SEPARATOR


fun main() {

    println("\n*** Traversing files in a directory ***\n")

    val directoryPath = "src${SEPARATOR}main${SEPARATOR}resources"

    val fileTreeWalk: FileTreeWalk = File(directoryPath).walk()
    fileTreeWalk
        .filter { it.isFile }
        .filter { it.extension == "txt" }
        .filter { it.readBytes().isNotEmpty() }
        .forEach {
            it.apply {
                println(path)
                println(readText())
                println()
            }
        }
}