import java.io.File
import java.nio.file.Files

object Utils {
    inline fun <reified T> readDataFromFile(fileName:String,converter: (String) -> T): Array<T> {
        val lines = File("src/main/resources/$fileName").readLines()
        return lines.map { line ->
            converter(line)
        }.toTypedArray()
    }
}