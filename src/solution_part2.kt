/*
Name : Faisal Alharthi
*/
                           //////////////<><> Part2 <><>//////////////

fun main() {
    println()
    println("---> Map <---")
    val cars = listOf("Camry", "Avalon", "Corolla", "Yaris").easyPrint()
    cars.map {cars-> " Toyota $cars" }.easyPrint()

    println()
    println("---> flatten <---")

    val list1 = listOf(listOf("X","Y","Z",), listOf(0,1,2,)).easyPrint().flatten().easyPrint()


    println()
    println("---> filter <---")

    list1.filter { char-> char.toString().contains("X") }.easyPrint()

}