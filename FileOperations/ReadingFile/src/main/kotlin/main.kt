package chapter6

import java.io.File
import java.io.File.separator as SEPARATOR


fun main() {

    println("\n*** Reading the contents of a file code ***\n")

    val filePathName = "src${SEPARATOR}main${SEPARATOR}resources${SEPARATOR}file.txt"
    val largeFilePathName = "src${SEPARATOR}main${SEPARATOR}resources${SEPARATOR}largeFile.txt"

    println("\n\n*** Reading small file***")
    val file = File(filePathName)
    val fileText: String = file.readText()
    println(fileText)


    println("\n\n*** Reading file with inputStream ***")
    val stream = File(filePathName).inputStream()
    stream.use {
        it.readBytes().also { println(String(it)) }
    }

    println("\n\n*** Reading file line by line ***")
    val fileLines = file.readLines()
    fileLines.forEach { println(it) }


    println("\n\n*** Reading large file ***\n")

    val largeFile = File(largeFilePathName)
    val bufferedReader = largeFile.bufferedReader()
    val text:List<String> = bufferedReader.readLines()
    for(line in text){
        println(line)
    }

}