//Create an extension that replace repetitive double characters in string (ex.: aa) to (**).

fun String.replaceRepetChar() {
    var str: String = this.lowercase()
    for (c in this) {
        str = str.replace((c + "" + c), "**")
    }
    println(str)
}

//Create an extension that prints any number value in reverse order.
fun Number.reverseOrder() {
    println(this.toString().reversed())
}

fun main() {

    "Hiii my naaame isss".replaceRepetChar()
    4678.77.reverseOrder()
    353.reverseOrder()
}