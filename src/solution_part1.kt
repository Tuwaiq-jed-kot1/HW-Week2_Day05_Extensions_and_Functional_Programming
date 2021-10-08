/*
## Part I - Extensions.
---
*/

/*
- Create an extension that replace repetitive double characters in string (ex.: aa) to (**).
*/
fun <T>T.easyPrint():T {
    println(this)
    return this
}

/*val String.charRepToAsterisks
    get() = this.lowercase()
        .count{"aeiou".contains(it)}*/
val String.charRepToAsterisks
    get() = this.lowercase()
        .count{"aeiou".contains(it)}

/*fun CharSequence.count(predicate: (Char) -> Boolean): Int {
    var count = 0
    for (element in this) if (predicate(element)) ++count
    return count}*/

fun Number.replaceRepetitiveDoubleToAsterisks() {
    var strList =this.toString().toMutableList().easyPrint()
    /*strList.forEach {
        if (it == it+1)
            it="*"
    }*/
    //strList.forEachIndexed()

}

/*
- Create an extension that prints any number value in reverse order.
*/
fun Number.reverseNumberValue() {
    this.toString().reversed().easyPrint()
}

fun main() {
    001122.00.replaceRepetitiveDoubleToAsterisks().easyPrint()

    //second question implementation
    123456.reverseNumberValue()
}