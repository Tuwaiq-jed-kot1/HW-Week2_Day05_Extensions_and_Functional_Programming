//part||
//Q1
fun main() {
    val phoneNumber = mutableListOf(
        listOf("+965 50 111 1133","+996 50 115 1254"),
        listOf("+971 50 112 1162","+965 50 113 1254"),
        listOf("+996 50 113 1191","+971 50 117 1535"),
        listOf("+996 50 114 1791","+971 50 112 1235"),
    )
        .flatMap { saudiNumbers -> saudiNumbers
            .filter { key -> key.contains("+996") } }
        .map { phoneNumber -> "PhoneNumber:$phoneNumber" }


    phoneNumber.easyPrint()

}