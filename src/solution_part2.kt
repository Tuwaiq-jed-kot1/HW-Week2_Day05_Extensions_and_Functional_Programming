fun main() {
    val animals = listOf("lion", "leopard", "polar bear", "brown bear")
    val wild = animals
        .map { animals -> "wild $animals" }
    println(wild)
    val filtered = animals.filter { it.contains("bear") }
    println(filtered)
val StudentName = mutableListOf(
    listOf("ahmad","Ali","faisal"),
    listOf("Rana","Ruba","Asma"))
        .flatMap { it }
    println(StudentName)
}
