// Part II - Functional Programming Basics.
//Create 3 functional chains using map, flatMap, and filter.

fun main() {
    println()
    println("---> Map <---")
    val icecream = listOf("kimokono", "dolce", "vanacia", "Paris").easyPrint()
    icecream.map { icecream -> " kimokono $ icecream" }.easyPrint()
    println()

    println("---> flatten <---")

    val list1 = listOf(listOf("A","B","C",), listOf(0,1,2,)).easyPrint().flatten().easyPrint()
    println()
    println("---> filter <---")

    list1.filter { char-> char.toString().contains("A") }.easyPrint()

}