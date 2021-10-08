fun <T> T.pln(): T {
    println(this);return this
}

//----------Part1.1----------

fun String.repl() {
    var string = this.lowercase()
    if (string.length != -1) {
        //i =char1 and j== char2
        for (i in this) {
            for (j in this) {
                if (i == j) {
                    string = string.replace((i + "" + j), "**")
                }
            }
        }
        string.pln()
    }

}


//----------Part1.2----------
fun Number.reveNum() {

    this.toString().reversed().pln()
}

fun main() {


    50.80.reveNum()
    1000.reveNum()

    "basilll ALluqmni".repl()//basi**l a**uqmni

    "baLlpll".repl()//ba**p**


}