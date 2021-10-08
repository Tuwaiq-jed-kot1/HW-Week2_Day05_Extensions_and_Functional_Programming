fun main() {
    val fruits = listOf("Apple","Orange","Banana")
    fruits.easyPrint()
    val basket = fruits
        .map { fruits1 ->"This basket contains $fruits1" }
    basket.easyPrint()

    fruits.filter { letter -> letter.contains("a") }.easyPrint()

    val flattenList = listOf(listOf("A", "B", "C"), listOf(1, 2, 3), listOf("a", "b", "c"))
    println("The list before flatten: $flattenList")
    println("The list after flatten: ${flattenList.flatten()}")


}