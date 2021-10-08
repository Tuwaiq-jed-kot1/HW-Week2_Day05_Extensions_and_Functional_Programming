//## Part II - Functional Programming Basics.
//Create 3 functional chains using map, flatMap, and filter.

fun main(){
    var storeBranches = listOf(
        listOf("store no.1 Jeddah", "store no.2 Dammam", "store no.3 Taif"),
        listOf("store no.4 Riyadh", "store no.5 Jeddah", "store no.6 Jeddah"),
        listOf("store no.7 Makkah", "store no.8 Dhahran", "store no.9 Jeddah")
    )

    var closingBranches = storeBranches.flatMap {
        it -> it.filter {
            closing -> closing.contains("Jeddah")
        }
    }
    println(closingBranches)

}