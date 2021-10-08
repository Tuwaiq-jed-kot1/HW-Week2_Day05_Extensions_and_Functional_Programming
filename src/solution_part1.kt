/*
Name : Faisal Alharthi
*/
                           //////////////<><> Part1 <><>//////////////

fun main() {
    "Always keep your eyes open. Keep watching.Because whatever you see can inspire you".rep().easyPrint()
    123456789.revers()

}

fun <T>T.easyPrint() :T {
    println(this)
    return this
}

fun String.rep(): String {
    var repStr = this
    repStr.forEachIndexed() { index, a ->
        if (a == this[index])
            repStr = repStr.replace("$a$a", "**")
    }
    return repStr
}


fun Number.revers() {
    this.toString().reversed().easyPrint()
}


