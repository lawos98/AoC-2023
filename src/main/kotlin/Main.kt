import Utils.readDataFromFile
import day_1.Trebuchet

fun main(args: Array<String>) {
    val lines = readDataFromFile("day_1/input_2.txt") { it }
    val result = Trebuchet(lines).launch(true)
    println("Result: $result")
}