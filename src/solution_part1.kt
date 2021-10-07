//Create an extension that replace repetative
// double characters in string (ex.: aa) to (**).
fun String.GetEx():String {
    return this
}
fun <T> T.GetAny():T{
    return this
}
//Create an extension that prints any number value in reverse order.
fun Number.GetNumber():Number{
    return this
}
fun main() {
    println("--------Extension--------")
    val a = "hello word"
    val prin = a.GetEx()
    println(prin)
    println("-----------Any---------------")
    val b = "welcome back"
    println(b.GetAny())
    val c = 100
    println(c.GetAny())
    val h = 50.0
    println(h.GetAny())
    println("--------Number-----------")
    val s = 4.0
    println(s.GetNumber())
    val d = 5
    println(d.GetNumber())
}