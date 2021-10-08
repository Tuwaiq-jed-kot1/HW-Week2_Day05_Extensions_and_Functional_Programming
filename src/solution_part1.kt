fun main() {
////part I//////
    "NAAadia Ali:".repetativeStr()

////part II//////

    234567.numberRev()
}

////part I//////
fun String.repetativeStr() {
    var count = 0
    var str1: String = ""
    var str = this.toMutableList()
    while (count < str.size-1 ) {

        if (str[count] == str[count + 1]) {
            str[count] = '*'

        }
        str1 = str1 + str[count]
        count ++

    }

    println(str1)

}

////part II//////
fun Int.numberRev() {

    var num = this.toString().reversed()
    println(num)


}