package org.example

// Assignment 12: Expression in a Template String

fun main(){
    println("Enter temperature:")
    var temp = readln().toInt();

    val message = if (temp > 20) "It is warm" else "It is cold"
    println(message)

}