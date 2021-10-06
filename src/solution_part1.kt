//** Part I - Extensions.
// Create an extension that replace repetative double characters in string (ex.: aa) to (**).
fun String.replaceRepetative() {
    var str: String = this.lowercase()
    for (r in this) {
        str = str.replace((r + "" + r), "**")
    }
    println(str)
}
//Create an extension that prints any number value in reverse order.
fun Number.reverseOrder() {
    println(this.toString().reversed())
}

fun main() {
    "myyy nammmme is ranna ".replaceRepetative()
    3687.99.reverseOrder()
    225.reverseOrder() }

