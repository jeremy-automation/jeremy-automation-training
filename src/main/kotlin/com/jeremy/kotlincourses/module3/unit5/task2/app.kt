package org.example.com.jeremy.kotlinpractice.module3.unit5.task2

fun main () {
    val person = Person("Flores")
    person.firstName = "Jeremy"
//    val lastName = person.lastName -> Cannot access 'var lastName: String': it is private in

    val fullName = person.showFullName()
    println(fullName)
}