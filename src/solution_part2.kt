//Create 3 functional chains using map, flatMap, and filter.

fun main() {
    //1map
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })


    //2 flatmap

    val nameStudent = listOf(
        listOf("Roula", "anas", "Ahmed"), listOf("Mohammed", "Yasmin")
    )
    var nameItem = nameStudent.flatMap { nameList ->
        nameList
    }
    println(nameItem)


//3 filter
    val item = listOf("Drink water", "Drink coffee", "eat banana")
    var fItem = item.filter { list ->
        list.contains("Drink")
    }
    println(fItem)

}