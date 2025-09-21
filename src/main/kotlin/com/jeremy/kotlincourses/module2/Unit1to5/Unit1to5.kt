package org.example.com.jeremy.kotlincourses.module2.Unit1to5

fun  main() {
    // Unit 1. Functions and Their Parameters
    greet("Jeremiah")
    displayUser("Conrad", 27)
    showMessage("What should be the message?")

    // Unit 2. Vararg Parameters
    printNumbers(5,2,3,7)
    concatStrings("Belly", "Jere", "Conrad")
    addToGroup("Summer", "Steven","Taylor","Cam")

    // Unit 3. Returning Results
    multiply(3,4)
    println(isEven(3))
    printIfPositive(-1)

    // Unit 4. Single-Expression and Local Functions
    println(cube(4))
    checkAndPrint(-1)
    compare(11,11)

    // Unit 5. Function Overloading
    show("Hej")
    show(4)
    println(max(2,7))
    println(max(2.2, 4.4))
    println(sum(1,1))
    println(sum(1,1,1))

}

// Unit 1 functions
fun greet(name: String) {
    println("Hello $name")
}

fun displayUser(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

fun showMessage(message: String) {
    println(message)
}


// Unit 2 functions
fun printNumbers(vararg integers: Int) {
    for (int in integers) {
        println(int)
    }
}

fun concatStrings(vararg string: String) {
    for (str in string) {
        print("$str\t")
    }
}

fun addToGroup(groupName: String, vararg userNames: String) {
    println(groupName)
    for (user in userNames) {
        println(user)
    }
}

// Unit 3 functions
fun multiply(numberOne: Int, numberTwo: Int){
    var result = numberOne * numberTwo
    println(result)
}

fun isEven(number: Int) : Boolean{
    return number % 2 == 0
}

fun printIfPositive(number: Int) {
    if (number > 0 ){
        println(number)
        return
    }
}

// Unit 4 functions
fun cube(x: Int) = x * x * x

fun checkAndPrint(x: Int) {
    fun isValid(num: Int) : Boolean {
        return num > 0
    }

    if(isValid(x)) {
        println("Valid")
    } else {
        println("Invalid")
    }
}

fun compare(x: Int, y: Int) {
    fun lessThanTen(num: Int) : Boolean {
        return num < 10
    }

    if(lessThanTen(x) && lessThanTen(y)) {
        println("Both less than 10")
    } else {
        println("Not both less than 10")
    }

}

// Unit 5 Functions
fun show(str: String) {
    println(str)
}

fun show(num: Int) {
    println(num)
}


fun max(a: Int, b: Int) : Int {
    if(a > b){
        return a
    } else {
        return b
    }
}

fun max(a: Double, b: Double) : Double {
    if(a > b){
        return a
    } else {
        return b
    }
}

fun sum(a: Int, b: Int) = a + b

fun sum(a: Int, b: Int, c: Int) = a + b + c