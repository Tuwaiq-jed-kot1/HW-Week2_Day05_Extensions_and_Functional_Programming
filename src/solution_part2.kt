//Create 3 functional chains using map, flatMap, and filter.


fun main() {
    //uppercase and lowercase letters in each index
    val upperlowerL = ('a'..'z').toList().map { it.uppercaseChar() + "" + it }
    println(upperlowerL)

    val divBy3 = (50..1000 step 50).toList().filter { it % 3 == 0 }
    println(divBy3)

    //Flat list of letters, each letter repeated 3 times consecutively
    val rep3Times = ('a'..'c').toList().map { it + "" + it + it }.flatMap(String::toList)
    println(rep3Times)


}