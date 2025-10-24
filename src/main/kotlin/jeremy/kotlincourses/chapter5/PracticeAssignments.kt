package org.example.jeremy.kotlincourses.chapter5


// Chapter 5 — Practice Solutions
// All tasks from Units 1–12 in a single Kotlin file, organized and ready to run for demonstration and review.

// --------------------------------------------
// Main Function: Demo all solutions
// --------------------------------------------

fun main() {
    // Unit1
    // Task1: Student Grades
    println("\n--- Unit 1: List ---")
    val student = Student("jeremy", listOf(90,100,89))
    val ave = student.averageGrade()
    println("Student's average is: $ave")

    // Task2: MathUtils
    val mathUtils = MathUtils()
    val sum = mathUtils.sumOfEven(listOf(2,3,4,6,5))
    println("Sum of evens: $sum")

    // Unit2
    // Task1: Unique Names
    println("\n--- Unit 2: Set ---")
    val namesList = listOf("Jeremy","Cha","Cha","Abbs","Sam","Dan")
    val nameCollector = NameCollector()
    val uniqueNames = nameCollector.uniqueNames(namesList)
    println("Unique Names: $uniqueNames")

    // Task2: Duplicate Check
    val numberSet = setOf(4,5,6,2)
    val number = 2
    val duplicateChecker = DuplicateChecker()
    val checkDuplicate = duplicateChecker.checkDuplicate(numberSet,number)
    println("Is duplicate: $checkDuplicate")

}


// --------------------------------------------
// Unit 1: Classes
// --------------------------------------------

// Task1
class Student(val name: String, val grades: List<Int>) {
    fun averageGrade(): Double {
        return if (grades.isNotEmpty()) grades.average() else 0.0
    }
}

// Task2: Math Utils
class MathUtils {
    fun sumOfEven(number: List<Int>): Int {
        return number.filter { it % 2 == 0 }.sum()
    }
}

// --------------------------------------------
// Unit 2: Classes
// --------------------------------------------

// Task1
class NameCollector {
    fun uniqueNames(names: List<String>): Set<String> {
        return names.toSet()
    }
}

class DuplicateChecker {
    fun checkDuplicate(numberSet: Set<Int>,number: Int): Boolean {
        return number in numberSet
    }
}