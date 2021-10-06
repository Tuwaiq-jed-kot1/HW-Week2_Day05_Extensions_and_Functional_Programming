
fun main() {
    val italianFood = listOf<String>("num1 Pizza", "num2 Spaghetti", "num3 Ravioli")
    val chineseFood = listOf<String>("num5 SpringRolls ", "num6 Dumplings", "num1 Noodles")
    val americanFood = listOf<String>("num7 Burger", "num1 HotDog", "num4 ChickenWings")

    val theLists = listOf(
        listOf("num1 Pizza", "num2 Spaghetti", "num3 Ravioli"),
        listOf("num5 SpringRolls", "num6 Dumplings", "num1 Noodles"),
        listOf("num7 Burger", "num1 HotDog", "num4 ChickenWings")
    )

    var FavMap = theLists.flatMap { onlynum1 ->
        onlynum1.filter { number ->
            number.contains("num1")
        }
    }
}
