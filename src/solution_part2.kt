/*

## Part II - Functional Programming Basics.
---
- Create 3 functional chains using map, flatMap, and filter.
*/
fun main() {
println()
    val tools = listOf("Phone", "Tv", "LapTop")
    ("My list is $tools").easyPrint()

    val things = tools
        .map { tools -> "I bought a $tools" }
        .map { things -> "$things last month" }
    ("\nMy list after using map Functional \n"+things).easyPrint()
    println("------------------------------------------")

    val myList = listOf(listOf("B","A","S","H","A","Y","E","R"), listOf(23,4,1998))
    ("\nMy secound List "+myList).easyPrint()
    println("\n------------------------------------------")
            "\nMy list after using  flatMap, and filter \n".easyPrint()
    myList.flatMap {
        it
    }.filter {
        it.toString().contains("")
    }.easyPrint()

println("------------------------------------------")
}

private fun <T> T.easyPrint():T {
    println(this)
    return this
}
