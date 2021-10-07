/*
Name : Husam Talal Metro
Assignment : Week 2 Day 5
 */
fun String.repetitiveReplace(): String {
    var result = this.lowercase()
    result.forEachIndexed { index, c ->
        if (index != this.lastIndex)
            if (c == this[index + 1] && c != ' ')
                result = result.replace("$c$c", "**")
    }
    return result
}

fun Number.printNumberInReverse() = println(this.toString().reversed())

fun main() {
    println("You are not allowed to repeat any two letters or the system will handle it ,,,, examples (aa),(bbb),(zzzz)".repetitiveReplace())
    654321.7319.printNumberInReverse()
    123456.printNumberInReverse()
}