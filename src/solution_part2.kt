import kotlin.test.assertContains

fun main() {


    val colors = listOf("lily", "tulip", "Jasmine", "Rose")
    val c1 = colors.map { cz -> "flower $cz" }.map { m -> "$m beautiful" }
    c1.easyPrint()

    println("\n __________________")

    val li = listOf(
        listOf("chocolate" , "ice cream"),
        listOf("juice","popcorn")
    )
    var item = li.flatMap { sweetList -> sweetList.filter { s -> s.contains("chocolate") }
    }.easyPrint()

    println("\n __________________")

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10 }
    filteredMap.easyPrint()


}
