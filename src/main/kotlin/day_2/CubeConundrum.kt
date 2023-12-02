package day_2

class CubeConundrum(
    private val list :List<String>,
    private val red :Int,
    private val green :Int,
    private val blue :Int
) {

    private fun String.getNumber():Triple<Int,Int,Int>{
        return this.split(",").fold(Triple(0,0,0)) { acc, s ->
            val value = s.toInt()
            when{
                s.contains("red") -> Triple(acc.first + value,acc.second,acc.third)
                s.contains("green") -> Triple(acc.first,acc.second + value,acc.third)
                s.contains("blue") -> Triple(acc.first,acc.second,acc.third + value)
                else -> throw Exception("No color found")
            }
        }
    }

    fun launch():Int{
        list.fold(0) { acc, s ->
            val spliter = s.split(":").first()

            acc + s.getNumber().apply {  }
        }
    }
}