// map id & student
val _idStudent = listOf("1", "2", "3")
val _nameStudent = listOf("Basil alluqmani", "Ahmed1", "Basil TALEB", "Ahmed2", "Ahmed3")

val listOfIdStudent = listOf(_idStudent, _nameStudent)


fun main() {
    "----------Map----------".pln()
    _idStudent.zip(_nameStudent).toMap().pln()


    "----------Map----------".pln()
    var i = 1
    val numberStudent = _nameStudent.map { student -> "a student ${i++} $student" }
    numberStudent.pln()



    "\n----------flatten----------".pln()
    listOfIdStudent.flatten().pln()

    "\n----------Flat Map----------".pln()
    listOfIdStudent.flatMap { it }.pln()


    "\n----------Flitter----------".pln()

    "Enter name student :".pln()
    //Ahmed or basil
    var name: String? = readLine()
    if (name!!.isNotEmpty()) {


        var filter = listOfIdStudent.flatMap { search ->
            search.filter { item -> item.lowercase().contains(name.lowercase()) }
        }.pln()
    } else {
        "There is not name $name ,sorry ".pln()
    }


}













