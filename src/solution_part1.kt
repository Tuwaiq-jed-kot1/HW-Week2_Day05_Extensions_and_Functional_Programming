//Create an extension that replace repetative double characters in string (ex.: aa) to (**).
//Create an extension that prints any number value in reverse order.
fun main(){
    val nuum=12.5
    nuum.printLnReseveOrder()

}

fun <T:Number> T.printLnReseveOrder(){
    val num=this.toString()
    println(num.reversed())
}
