
fun main(){
    val test ="tthis senttence forr testiing the function"
   "Q 1 : replace duplicative char with ** : \n$test ".easyPrint()
    test.detectDoubleChar().easyPrint()
    "\n Q 2 : reverse number ".easyPrint()
    "3454.18 reversed to be : ".easyPrint()
    3454.18.reverseNo()

}

//Q1
fun String.detectDoubleChar():String{
    var i =0
    var str =this
    while (i < this.length-1) {
        if (this[i] == this[i + 1])
            str = str.replaceRange(i, i + 2, "**")
        i+=1
    }
return str
}

//Q2
fun Number.reverseNo()=println(this.toString().reversed())

fun <T> T.easyPrint():T{ println(this)
    return this}