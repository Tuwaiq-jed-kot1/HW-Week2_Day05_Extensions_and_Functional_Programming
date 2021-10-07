/*
Name : Husam Talal Metro
Assignment : Week 2 Day 5
 */
fun main() {
    // a company want to raise it employees Salary by 1000 SR , using .map we achieved that
    val employeeSalary = mapOf(18119 to 4000, 19190 to 7500, 19191 to 5000, 19987 to 9000) // key = ID , value = Salary
    println("Employees Salary Before yearly raised = ${employeeSalary.values}")
    val yearlyRaiseEmployeeSalary = employeeSalary.map {
        it.value + 1000
    }
    println("Employees Salary After yearly raised = $yearlyRaiseEmployeeSalary")
    // Two Companies wants to merge , we used .flatmap to merge the two companies databases lists into one list
    var mergingEmployee = listOf(
        listOf("Husam Metro", "Ahmed Algamdi", "Yasser Alherbi "),
        listOf("Mohammed Ahmedi", "Salim Bajaber", "Ismail Sulimani")
    ).flatMap {
        it
    }
    println("\nMerged Database Lists = $mergingEmployee")
    // A saudi Company Wanted to celebrate the national saudi day (91) with their employees , so anyone who has the number 91 in their ID will get a car from Mazda CX5
    val nationalSaudiDay = employeeSalary.filter {
        it.key.toString().contains("91")
    }
    println(
        "\n------------------------------------- Happy National Saudi Day -------------------------------------" +
                "\nThese are the ID's of the Lucky Employees that will get a brand new car Mazda(CX5) = ${nationalSaudiDay.keys} " +
                "\n------------------------------------------ Congratulation ------------------------------------------"
    )
/* I made 4 Functional Chains using one example : we used .map first to reach the lists inside then another .map to reach the Integer number
  inside each list and add 11 to them , then .flatmap to make them one list ,last we filtered the one's who has number 9 in them */
    val functionalChains = listOf(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), listOf(14, 15, 16, 17, 18, 19)).map {
        it.map {
            it + 11
        }
    }.flatMap {
        it
    }.filter {
        it.toString().contains("9")
    }
    println("\nResult of Functional Chains = $functionalChains")


}