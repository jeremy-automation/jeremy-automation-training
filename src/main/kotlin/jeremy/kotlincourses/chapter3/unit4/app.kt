package jeremy.kotlincourses.chapter3.unit4


fun main(){
    val student1 = Student()

    //Task 1
    student1.age = 4
    println(student1.age)

    //Task 2
    student1.age = 19
    println(student1.isAdult)

    //Task 3
    student1.name = ""
    println(student1.name)

}