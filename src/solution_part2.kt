//--------------------------------------------Part1---------------------------------------//

//We just create a nested list of three other lists
fun main() {
    val sword = listOf<String>("Flame sword", "Iron sword", "Flame sword")
    val bows = listOf<String>("Amos bow", "Elvin bow", "Amos bow")
    val magic = listOf<String>("Fire spell", "Protection spell", "Cure spell")
    val abilities = listOf(
        listOf("Long sword", "Iron sword", "Flame sword"),
        listOf("Amos bow", "Elvin bow", "Amos bow"),
        listOf("Fire spell", "Protection spell", "Cure spell")
    )
//We create an object variable to perform Kotlin's functions like flatMap and filter
    var abilityMap = abilities.flatten().filter{ spells -> spells.contains("spell") }.quickPrint()
}