package day_1

class Trebuchet(private val list :Array<String>) {

    private fun String.getNumber(dictionary:Map<String,Int>):Int{
        return (this.findAnyOf(dictionary.keys)?.let { dictionary[it.second] } ?: throw Exception("No number found")) * 10 +
                (this.findLastAnyOf(dictionary.keys)?.let { dictionary[it.second] } ?: throw Exception("No number found"))
    }

    fun launch(extendedVersion:Boolean):Int {
        return if(extendedVersion){
            this.list.fold(0) { acc, s -> acc + s.getNumber(convertSearchExtendedValues) }
        } else{
            this.list.fold(0) { acc, s -> acc + s.getNumber(convertSearchValues) }
        }
    }

    companion object{
        val convertSearchValues = mapOf(
            "one" to 1,"two" to 2,"three" to 3,"four" to 4,"five" to 5,"six" to 6,"seven" to 7,"eight" to 8,"nine" to 9,"zero" to 0
        )

        val convertSearchExtendedValues = mapOf(
            "1" to 1,"2" to 2,"3" to 3,"4" to 4,"5" to 5,"6" to 6,"7" to 7,"8" to 8,"9" to 9,"0" to 0,
            "one" to 1,"two" to 2,"three" to 3,"four" to 4,"five" to 5,"six" to 6,"seven" to 7,"eight" to 8,"nine" to 9,"zero" to 0
        )
    }
}