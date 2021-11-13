//part|
//Q1
fun  String.replaceRepetative():String {
 var count:Char? = null
    var newString = this.lowercase()
    for (i in 0 until this.lastIndex) {
            if (count == this.lowercase()[i]){
                newString = newString.replaceRange(i, i+1 , "*")
            }else if (this.lowercase()[i] == this.lowercase()[i+1]){
                newString = newString.replaceRange(i, i+1 , "*")
            }
            count = this[i]
        }
    if( this.last() == count){
        if (count == newString.last()) {
            newString = newString.dropLast(1)+"*"
        }
    }
    return newString
}

//Q2
fun Int.reverseOrder():Int{
    return this.toString().reversed().toInt()
}

fun <T> T.easyPrint(): T {
    println(this); return this
}


fun main(){
    "Question 1:".easyPrint()
    "mmterruii".replaceRepetative().easyPrint()

    "Question 2:".easyPrint()
    1234.reverseOrder().easyPrint()

}
