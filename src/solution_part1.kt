class MyExtension {
    //val str: String = "Testing string"
}

fun String.replaceRepetitive():String{
    //val str = this.toLowerCase()
    if(this.toLowerCase().contains("aa")){
       return this.replace("aa", "**")
    }
    else return "\n $this.This text doesn't contain any repetitive aa's"
}

fun Number.prtReversed(): String{
    return this.toString().reversed()
}

fun <T> T.easyPrint():T {
    println(this)
    return this
}

fun main() {
 "Bazaar".replaceRepetitive().easyPrint()
    5715.prtReversed().easyPrint()
}
