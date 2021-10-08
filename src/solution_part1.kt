import java.awt.SystemColor.text

//--------------------------------------------Part1---------------------------------------//

//Used an extension to print anything
fun <T> T.quickPrint() :T {
    println(this)
    return this
}
//This function will reverse any data by just using "reversed" (I LOVE KOTLIN)
fun <T>T.reverseN() :String = this.toString().reversed()

//This function will take a phrase and turn it into an array of Chars, so we can change the indexes and print it as a list
fun String.censor():String{
    val character = '*'
    var word = this.toCharArray()
    word.forEachIndexed{index, thisChar ->
        if(index == word.lastIndex){
            return word.toList().toString()
        }else if (thisChar == word[index + 1]){
            word[index] = character
            word[index + 1] = character
        }
    }
        return word.toList().toString()


}

//We test them out here :)
fun main() {
    "This classroom is small".censor().quickPrint()
    "77777754".reverseN().quickPrint()
    555577743.reverseN().quickPrint()

}