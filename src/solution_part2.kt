import kotlin.math.pow

/*
Create 3 functional chains using map, flatMap, and filter.
*/
fun main(){

    val powerOf2 = listOf(listOf(2,4,6,8,10,12), listOf(1,3,5,7,9,11))
        .flatten().map { num -> 2.0.pow(num.toDouble()).toInt() }
        .filter { it > 150 || it <10  }.easyPrint()

}