package org.example

// Assignment 9: Comparison Operators
fun main(){
    println("Enter your age:")
    var myAge = readln().toInt()
    var requiredAge = 18;

    var meet = myAge >= requiredAge
    println("Your age $myAge is enough to meet the required age: $meet")

    // OR ANOTHER SOLUTION

    if(myAge >= requiredAge){
        println("Your age: $myAge is enough to meet the required age")
    } else {
        println("Your age: $myAge is not enough to meet the required age")
    }

}