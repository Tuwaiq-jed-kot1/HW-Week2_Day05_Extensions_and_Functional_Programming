// part 2
val fruit = listOf("Orange","Apple","Kiwi")
val fruit1 = listOf(listOf("Banana","Watermelon"), listOf("Orange","Apple","Kiwi"))


fun main() {
    println("----PART I - Q2----")
    println(1605299)
    println("--Reversed Number--")
    println(1605299.reversedNumber())
    println("----PART-II----")
    println("--MAP--")
    println(fruit)
    println(fruit.map { fruit ->" Fruit Type: $fruit" })
    println("--FLATTEN--")
    println(fruit1)
    println(fruit1.flatten())
    println("--FILTTER : The List that have Orange--")
    println(fruit1.filter {
        it.toString().contains("Orange")
    })
}