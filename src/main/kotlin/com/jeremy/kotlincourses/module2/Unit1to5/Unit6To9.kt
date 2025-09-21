package org.example.com.jeremy.kotlincourses.module2.Unit1to5

fun main() {
    // Unit 6: Function Type
    println("Unit 6: Function Type")
    greet()
    println(multiplyUnitSix(4,5))

    var operation: (Int, Int) -> Int = ::multiplyUnitSix
    val result1 = operation(4,3)
    println(result1)

    operation = ::subtract
    val result2 = operation(4,3)
    println(result2)

    // Unit 7: High Order Functions
    println("Unit 7: High Order Functions")
    action(4,2,::add)
    action(5,3, ::subtract)
    action(11,9, ::multiplyUnitSix)

    val task2 = chooseGreeting(false)
    task2()

    repeatAction(::printSomething)

    // Unit 8: Anonymous Function
    println("Unit 8: Anonymous Function")
    val sum = fun(x: Int, y: Int): Int = x + y
    val result = sum(7,3)
    println(result)

    doMath(9,5,fun(x: Int, y: Int): Int = x * y)

    val sub = getAnonymous()
    println(sub(10,2))

    // Unit 9: Lambda Expressions
    println("Unit 9: Lambda Expressions")
    val hello = {println("Hello from Lambda")}
    hello()

    val kotlin = { message: String -> println(message.uppercase())}
    kotlin("uppercase")

    val addition = applyOperation(2,1,{x: Int, y: Int -> x + y})
    println(addition)

    val subtraction = applyOperation(2,1,{x: Int, y: Int -> x - y})
    println(subtraction)

    val multiplication = applyOperation(2,1,{x: Int, y: Int -> x * y})
    println(multiplication)


}

// Unit 6 Functions
fun greet(): Unit {
    println("Hello")
}

fun multiplyUnitSix(x: Int, y: Int) : Int {
    return x * y
}

fun subtract(a: Int, b: Int) : Int {
    return a - b
}

// Unit 7 Functions
fun chooseGreeting(key: Boolean): () -> Unit  {
    when(key){
        true -> return ::morning
        false -> return ::night
    }
}

fun morning() {
    println("Good morning")
}

fun night() {
    println("Good night")
}

fun action(n1: Int, n2: Int, op: (Int, Int) -> Int ) {
    val result = op(n1, n2)
    println(result)
}

fun add(a: Int, b: Int) : Int {
    return a + b
}

fun repeatAction(repeat: () -> Unit) {
    repeat()
}

fun printSomething() {
    for (r in 1 .. 3) {
        println("repeat")
    }
}

// Unit 8 Functions
fun doMath(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x,y))
}

fun getAnonymous(): (Int, Int) -> Int {
    return fun(x: Int, y: Int): Int = x - y
}


// Unit 9 Functions
fun applyOperation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x,y)
}

