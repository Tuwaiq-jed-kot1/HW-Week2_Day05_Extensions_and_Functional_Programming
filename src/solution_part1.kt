import java.util.*

//## Part I - Extensions.
//---
//- Create an extension that replace repetitive double characters in string (ex.: aa) to (**).
//- Create an extension that prints any number value in reverse order.

fun String.replaceRepetitive(): String {
    val list = listOf( "AA", "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ", "KK", "LL", "MM", "NN", "OO", "PP", "QQ", "RR", "SS", "TT", "UU", "VV", "WW", "XX", "YY", "ZZ")
    var newStr: String = this
    list.forEach {

        if (this.contains(it, true)) {
            newStr = newStr.replace(it, "**", true)
        }
    }
    return newStr
}

fun <T : Number> T.reversNum() = println(this.toString().reversed())

fun main() {
    54.reversNum()
    54.2.reversNum()
    54.2f.reversNum()
    "AAshahaadbb".replaceRepetitive().printIt()
}

fun <T> T.printIt() {
    println(this)
}