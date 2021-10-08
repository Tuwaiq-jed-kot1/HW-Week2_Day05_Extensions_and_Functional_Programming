fun main() {
    val audiCars = listOf<String>("Audi A4 2016", "Audi Q5 2020", "Audi RS6 2019")
    val toyotaCars = listOf<String>("Camry 2013", "Avalon 2021", "Corolla 2016")
    val fordCars = listOf<String>("Ranger 2017", "F150 2016", "mustang 2022")

    val allLists = listOf(
        listOf("Audi A4 2016", "Audi Q5 2020", "Audi RS6 2019"),
        listOf("Camry 2013", "Avalon 2021", "Corolla 2016"),
        listOf("Ranger 2017", "Mustang 2016", "F150 2022")
    )

    var mymap = allLists.flatMap { only2016 ->
        only2016.filter { year ->
            year.contains("2016")
        }
    }.easyPrint()
}