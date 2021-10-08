
//Create an extension that replace repetative double characters in string (ex.: aa) to (**).

fun String.replace(
    oldChar: Char,
    newChar: Char,
    ignoreCase: Boolean = false){

}

//Create an extension that prints any number value in reverse order.
fun MutableList<Int>.numRevers(){
}
fun main(args: Array<String>) {
    val list = mutableListOf(1, 2, 3)
    println(list)
    list.numRevers()
    println("List number reverse: ${list.reversed()}")

    var str = "Rooula"
    println(str)
    var rep=str.replace("oo", "**")
    println("String replace is $rep")
}



