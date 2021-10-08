fun<T> T.easyPrint(): T {
    println(this)
        return this
}

fun String.replaceDoubleChar() : String {
    var string: String = this.lowercase()
    for (a in this) {
        string = string.replace(a+""+a, "**")
    }
    return string
}


fun  Number.reverseNumbers() = this.toString().reversed().toDouble()

fun main() {

    val str = "aas ssd dds"
    str.replaceDoubleChar().easyPrint()
    "////////////////".easyPrint()
    val num = 123456
    num.reverseNumbers().easyPrint()
    753.25.reverseNumbers().easyPrint()
}