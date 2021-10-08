
    fun String.doubleicat(){
    var str1:String=""
    var r= str1.forEach ({ it.equals(it)  })
    println("**")}

fun getReverse(number: Int): Int {
    var number = number
    var sum = 0

    while (number > 0) {
        val r = number % 10
        sum = sum * 10 + r
        number /= 10
    }
    return sum
}

fun main(){
    var ghw:String= "Ahhmed"

    ghw.doubleicat()
    getReverse(32424)
}

