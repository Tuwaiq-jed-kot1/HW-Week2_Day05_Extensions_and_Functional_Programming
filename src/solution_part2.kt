//Create 3 functional chains using map, flatMap, and filter.
fun main() {
    println("--------------map-----------------")
    val fName = listOf("Abdullah","Aymen","Khaled")
    println(fName)
    val student = fName
        .map { fName ->"A Student $fName" }
    println(student)
    println("--------------flatten-----------------")
    val fm = listOf(listOf("A","B","C","A"), listOf(1,2,3,2))
    println(fm)
    println(fm.flatten())
    println("--------------filter------------------")
    println(fName.filter {
            char -> char.contains("y")
    })
}