fun main() {
    val cars = listOf("Camry","Avalon","Corolla")
    cars.easyPrint()
    val company = cars
        .map { comp -> "A Toyota $comp" }
    company.easyPrint()
    "//////////////////".easyPrint()
    val numberList= listOf(listOf(1,2,3), listOf(4,5,6)).flatMap { it }.easyPrint()
    "//////////////////".easyPrint()
    val listOfPlayers = mutableListOf(
        listOf("Messi PSG","Muller FCB","Ronaldo MUFC"),
        listOf("Neuer FCB", "Neymar PSG","Lingard MUFC")
        ).flatMap {
            clubList -> clubList.filter {
                club -> club.contains("FCB")
    }
    }.easyPrint()
}