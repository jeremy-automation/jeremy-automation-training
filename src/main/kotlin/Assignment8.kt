package org.example

// Assignment 8: val Reassignment Error

// Original code with error
/**fun main() {
    val balance = 100
    balance = 120 // Error here
    println(balance)
}

Answer: We cannot assign a new value to balance because it is define as an immutable object by using "val". To re-use this, we must use "var" **/

// Fixed code
fun main() {
    var balance = 100
    balance = 120 // Error here
    println(balance)
}