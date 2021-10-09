# Kotlin Essentials (Extensions and Functional Programming Basics)
---
The Kotlin assignment has two components
- Practice with Extensions.
- Practice with Functional Programming Basics.

> Note: You must save your solution in `solution_part1.kt` for Part I, and `solution_part2.kt` for Part II.

## Part I - Extensions.
---
- Create an extension that replace repetative double characters in string (ex.: aa) to (**).
- Create an extension that prints any number value in reverse order.

fun main() {
"Always keep your eyes open. Keep watching. Because whatever you see can inspire you".rep().easyPrint()
123456789.revers()

}

fun <T>T.easyPrint() :T {
println(this)
return this
}

fun String.rep(): String {
var repStr = this
repStr.forEachIndexed() { index, b ->
if (b == this[index])
repStr = repStr.replace("$b$b", "**")
}
return repStr
}

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