fun <T>T.easyPrint(): T {
    println(this)
    return this}

fun main(){

    var list1= listOf(3,3,6,7)
    var list2=listOf(3,67,89,3)
    var list3=listOf(4,4,6,46,4)
    var list4=listOf(list1,list2,list3).flatten().filter({ it % 2 == 0 }).easyPrint()
}