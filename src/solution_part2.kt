fun main() {
    val number1: List<Int> = listOf(1, 2, 4, 8)
    val number2: List<Int> = listOf(10, 4, 11, 12)
    number1.numberDivser5()
    number1.MaregList(number2)
    number1.MuteNum()

}

fun List<Int>.numberDivser5() {
    val list = this.filter { it % 5 == 0 }
    println(list)
}

fun List<Int>.MaregList(l: List<Int>) {

    var l = mutableListOf(this, l).flatten()

    println(l)
}

fun List<Int>.MuteNum() {

    var l = this.map { it * 2 }

    println(l)
}

