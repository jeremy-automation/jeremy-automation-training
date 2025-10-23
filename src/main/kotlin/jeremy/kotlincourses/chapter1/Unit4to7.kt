package jeremy.kotlincourses.chapter1

fun main() {
    activity1()
    activity2()
    activity3()
    activity4()
    activity5()
}

fun activity1() {
    // 1. Conditional Statements (if/else)

    // Task 1
    val number = 3
    if (number > 0) {
        println("$number is positive")
    } else if (number < 0) {
        println("$number is negative")
    } else {
        println("$number is zero")
    }

    // Task 2
    val numberTwo = 6
    if (numberTwo % 2 == 0){
        println("$numberTwo is even")
    } else {
        println("$numberTwo is odd")
    }
}

fun activity2() {
    // 2. when Expression

    // Task 1
    var grade: Int = readln().toInt()
    when(grade) {
        5 -> println("Excellent")
        4 -> println("Good")
        3 -> println("Okay")
        2 -> println("Bad")
        1 -> println("Terrible")
    }

    // Task 2
    val month = 7
    when(month){
        in 1 .. 3 -> println("Winter")
        in 4 .. 6 -> println("Spring")
        in 7 .. 8 -> println("Summer")
        in 8 .. 12 -> println("Autumn")
    }

}


fun activity3() {
    // 3. Loops and for Loops

    // Task 1
    for(i in 1 .. 10) {
        println("$i \t")
    }

    // Task 2
    for(j in 1 .. 10) {
        println("5 x $j = " +(j * 5))
    }
}

fun activity4() {
    // 4. Ranges

    // Task 1
    val ranges = 1 .. 20
    for (range in ranges) {
        print("$range \t")
    }

    // Task 2
    var numbers = 10 downTo 1

    println()
    for (number in numbers) {
        print("$number \t")
    }
}

fun activity5() {
    // 5. Arrays

    // Task 1
    var names = arrayOf("Tom", "Sam", "Bob")
    for(name in names) {
        println("$name \t")
    }

    // Task 2
    var numbers: Array<Int> = arrayOf(10,1,1,1,1)
    var sum: Int = 0
    for (number in numbers) {
        sum = sum + number
    }
    println("Sum is $sum")
}