package jeremy.kotlincourses.chapter3

fun main() {
    val bob: studentAccount = studentAccount()
    bob.name = "Bob"
    bob.email = "bob@gmail.com"
    bob.studentId = 1
    bob.showInfo()


    bob.showStudentInfo()
}


open class UniversityAccount {
    var name: String = "Undefined"
    var email: String = "Undefined"

    fun showInfo() {
        println("Username: $name, Email: $email")
    }
}

class studentAccount: UniversityAccount() {

    var studentId: Int = 0

    fun showStudentInfo() {
        println("Username: $name, Email: $email, Student ID: $studentId")
    }
}