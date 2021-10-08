//part|
//Q1
fun  String.replaceRepetative():String {
    val newCharList= mutableListOf<Char>()
    val x = this.lowercase().length
    for (i in 0 until x-1 ) {
        if (this.lowercase()[i] == this.lowercase()[i+1]){
            newCharList.add('*')
        }else if(this.lowercase()[i-1]=='*'){
            newCharList.add('*')
        }else if (i == x){
            newCharList.add(this.lowercase()[i])
        }else{
            newCharList.add(this.lowercase()[i])
        }
    }
    return newCharList.toString()
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