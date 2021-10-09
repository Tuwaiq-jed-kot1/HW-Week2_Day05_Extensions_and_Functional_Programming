
// Part I - Extensions.

// Create an extension that replace repetative double characters in string (ex.: aa) to (**).
//Create an extension that prints any number value in reverse order.
fun main() {
    "Always keep your eyes open. Keep watching. Because whatever you see can inspire you".rep().easyPrint()
    123456789.revers()

}

fun <T>T.easyPrint() :T {
    println(this)
    return this
}

fun String.rep(): String {
    var repStr = this
    repStr.forEachIndexed() { index, b ->
        if (b == this[index])
            repStr = repStr.replace("$b$b", "**")
    }
    return repStr
}

fun Number.revers() {
    this.toString().reversed().easyPrint()
}