//## Part I - Extensions.
//Create an extension that replace repetitive double characters in string (ex.: aa) to (**).
//Create an extension that prints any number value in reverse order.

fun String.censorRepetitions(): String{
    var result = this
    result.forEachIndexed(){i, ch ->
        if (i + 1 < result.length && ch == result[i + 1]){
            result = result.replace("$ch$ch", "**")
        }
    }
    return result
}

fun Number.reverseNumber(){
    println(this.toString().reversed())
}

fun main(){
    45.2.reverseNumber()

    println("HHello wworrlldd ".censorRepetitions())
}