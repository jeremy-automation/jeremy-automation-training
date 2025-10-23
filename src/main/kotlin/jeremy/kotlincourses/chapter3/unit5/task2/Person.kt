package jeremy.kotlincourses.chapter3.unit5.task2

class Person (private val lastName: String) {
    var firstName: String = ""

    fun showFullName(){
        println("$lastName $firstName")
    }
}