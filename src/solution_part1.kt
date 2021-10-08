//q1: Create an extension that replace repetative double characters in string (ex.: aa) to (**).
fun <T> T.printIt_(): T {
    println(this); return this
}

fun Number.reverse1() {
    var num =this.toInt()
    //to save result
    var reversed =0

    while (num!=0) {
        //last digit
        val digit =num % 10
        //take the last and save it as the first digit in new variable
        reversed =reversed * 10 + digit
        //throw last digit after the comma(as it,s int it will not show it or deal with it)
        num /=10
    }
    "Reversed Number:$reversed".printIt_()
}


//q2: Create an extension that prints any number value in reverse order.
fun String.checkerr(): String {

    val newChar = '*'
    val dublicate = this.toCharArray()

    dublicate.forEachIndexed { ind, certinChar ->

        if (ind == dublicate.lastIndex) {
            return dublicate.toList().toString()

        } else if (certinChar == dublicate[ind + 1]) {
            dublicate[ind] = newChar
            dublicate[ind + 1] = newChar
        }
    }

    return dublicate.toList().toString()
}



fun main() {
    56789.reverse1()



    println("-----------------------------------------------------------\n")

    "hello there bobby ".checkerr().printIt_()
}
