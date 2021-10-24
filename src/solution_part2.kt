fun main() {
    //map
    val listName = listOf("sara", "ahmed", "ali", "shahad")
    val map = listName.map { "Hi $it" }
    map.printIt()

    //flatMap
    val nestedLists = listOf(
        listOf("bead", "lunchroom", "dime", "little magic", "turn"),
        listOf("smell", "can", "little man", "pull", "egg"),
        listOf("clover", "little insect")
    )
    val notNested = nestedLists.flatMap { it.sorted() }
    notNested.printIt()

    //filter
    notNested.filter { it.contains("little") }.printIt()
}