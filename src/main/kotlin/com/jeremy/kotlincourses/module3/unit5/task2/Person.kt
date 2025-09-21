package org.example.com.jeremy.kotlinpractice.module3.unit5.task2

class Person (private val lastName: String) {
    var firstName: String = ""

    fun showFullName(){
        println("$lastName $firstName")
    }
}