package org.example.com.jeremy.kotlincourses

fun main () {
    assignment1()
    assignment2()
    assignment3()
    assignment4()
    assignment5()
    assignment6()
    assignment7()
    assignment8()
    assignment9()
    assignment10()
    assignment11()
    assignment12()
    assignment13()
    assignment14()
    assignment15()
}


fun assignment1(){
    // Assignment 1: Immutable Variable (val)
    val daysInWeek = 7;
    println("Immutable variable: $daysInWeek")
}

fun assignment2(){
    //Assignment 2: Mutable Variable (var)
    var userScore: Int = 0;
    var output = userScore + 10;
    println("Mutable variable: $output")
}

fun assignment3(){
    //Assignment 3: Arithmetic Operators"
    val width = 5
    val height = 10
    val area = width * height
    println("Arithmetic Operators: $area")
}

fun assignment4(){
    // Assignment 4: Explicit Type Declaration
    var pi: Double = 3.14159;
    println("The value of pi is $pi")
}

fun assignment5(){
    //Assignment 5: Single-Line Comment
    var userName: String = "Jeremy" //This is the variable that stores username
}

fun assignment6(){
    //Assignment 6: Remainder Operator (%)
    var num = 25
    var isEven = num % 2 == 0;
    println("is $num even?: $isEven")
}

fun assignment7(){
    // Assignment 7: Template Strings
    var firstName: String = "Jeremy";
    var lastName: String = "Flores"
    var fullName = firstName + lastName;

    println("My full name is $fullName")


    // ANOTHER
    var fullNameAgain = "$firstName $lastName"
    println("My full name is $fullNameAgain")
}

fun assignment8(){
    // Assignment 8: val Reassignment Error

    // Original code with error
        /**fun main() {
        val balance = 100
        balance = 120 // Error here
        println(balance)
        }

        Answer: We cannot assign a new value to balance because it is define as an immutable object by using "val". To re-use this, we must use "var" **/

    // Fixed code
        var balance = 100
        balance = 120 // Error here
        println(balance)
}

fun assignment9(){
    // Assignment 9: Comparison Operators
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

fun assignment10(){
    // Assignment 10: Multi-line Comment
    /**var price: Double = 100.00
    var discount: Double = 25.00
    var discountedPrice = price * (1- (discount/100))

    println(discountedPrice)**/
}

fun assignment11(){
    // Assignment 11: Choosing the Right Data Type
    var status: Boolean = true
    var userStatus = status == true
    println("Is user active?: $userStatus")
}

fun assignment12(){
    // Assignment 12: Expression in a Template String
    println("Enter temperature:")
    var temp = readln().toInt();
    val message = if (temp > 20) "It is warm" else "It is cold"
    println(message)
}

fun assignment13(){
    // Assignment 13: Combination of Operators
    val apples: Int = 10
    val extraApples: Int = 7
    val count = apples + extraApples
    println("There are $count apples in the basket")
}

fun assignment14(){
    // Assignment 14: Logical && (AND) Operator
    var key: Boolean = true
    var password: Boolean = false

    if(key && password == true){
        println("Door is open!")
    }
}

fun assignment15(){
    // Assignment 15: Increment Operator
    var messageCount: Int = 1
    messageCount++
    println(messageCount)
}
