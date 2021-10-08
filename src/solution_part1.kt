
fun List<Int>.revNum() : List<Int>{
    val n = this.reversed()
    return n

}

fun <T> T. easyPrint(): T {
    println(this)
    return this
}


fun String.ddd(): String =
    this.replace("AA","**")
        .replace("BB","**")
        .replace("CC","**")



fun main() {
    val l2= listOf(1,2,3,4,5,-1,-5)
    l2.revNum().easyPrint()
println("\n ___________________")

    val l1:String = ("AAAl of the CCCat has Tails")
    l1.ddd().easyPrint()
}