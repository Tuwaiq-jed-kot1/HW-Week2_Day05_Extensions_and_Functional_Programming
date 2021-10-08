//q1: Create 3 functional chains using map, flatMap, and filter.

fun main() {

    compineLists.map { add -> add.plus(1) }.printIt_()

}

val listOfNumbers = listOf(listOf(1,2,3),
    listOf(4,5,6),
    listOf(7,8,9),)
var compineLists = listOfNumbers.flatMap {
        coloredList -> coloredList.filter {
    it % 2 == 0
    }
}
