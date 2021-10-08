/*

## Part I - Extensions.
---
- Create an extension that replace repetitive double characters in string (ex.: aa) to (**).
- Create an extension that prints any number value in reverse order.
*/

fun String.replaceRepetitive(){

    var text: String = this.lowercase()
    for (char in this) {
        text = text.replace((char + "" + char), "*")
    }
    text.easyPrint()
}


fun String.numReverseOrder() {
    println(this.toString().reversed())
}

    fun main(){
        println("Enter your Text if you want to try replacing repetitive double characters to * :")
        val text = readLine()
        text?.replaceRepetitive()

        println("Enter your Text if you want try printing any number value in reverse order")
        val num = readLine()
        num?.numReverseOrder()

    }

private fun <T> T.easyPrint():T {
    println(this)
    return this
}
