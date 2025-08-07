package org.example

// Assignment 7: Template Strings
fun main(){
    var firstName: String = "Jeremy";
    var lastName: String = "Flores"

    var fullName = firstName + lastName;
    println("My full name is $fullName")


    // ANOTHER
    var fullNameAgain = "$firstName $lastName"
    println("My full name is $fullNameAgain")
}