// This is the best function ever, And its also better than the main function, Believe me.
fun <T> T.easyPrint(): T {
    println(this)
    return this
}

// This function will take the string and place it in characters list to deal with its index and replace the repetitive.
fun String.replaceRepetativeDoubleCharacters(): String {
    val newChar = '*'
    var stringToChar = this.toCharArray()
    stringToChar.forEachIndexed { i, currentChar ->
        if (i == stringToChar.lastIndex) {
            return stringToChar.toList().toString()
        } else if (currentChar == stringToChar[i + 1]) {
            stringToChar[i] = newChar
            stringToChar[i + 1] = newChar
        }
    }
    return stringToChar.toList().toString()
}

// This function will take any number and reverse it then print it.
fun <T> T.reverceNumbers(): String {
    return this.toString().reversed()
}

fun main() {
    "Messissipi is funns".replaceRepetativeDoubleCharacters().easyPrint()
    5648677.reverceNumbers().easyPrint()
}