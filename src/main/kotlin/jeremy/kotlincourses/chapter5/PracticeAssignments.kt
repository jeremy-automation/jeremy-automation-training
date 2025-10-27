package org.example.jeremy.kotlincourses.chapter5

import jeremy.kotlincourses.chapter2.add


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

    // Unit3
    // Task1: Phone Book
    println("\n--- Unit 3: Map ---")
    val name = "Cha"
    val phone = 91667800
    val phoneBook = PhoneBook()
    val addNewContact = phoneBook.addContact(name,phone)
    println("Phone book updated: $addNewContact")
    val findPhone = phoneBook.findPhone(name)
    println("$name's phone number is $findPhone")

    // Task2:Frequency Counter
    val stringList = listOf("Cha","Dan","Lomi","Cha")
    val frequencyCounter = FrequencyCounter()
    val count = frequencyCounter.countWords(stringList)
    println(count)

    // Unit5
    // Task1: Swap Elements
    println("\n--- Unit 5: Array ---")
    val arrayString = arrayOf("Chainsmoker","Lany","Lauv","Zara")

    fun swapElements(array: Array<String>): String {
        val first = array.first()
        println("FIRST :$first")
        val last = array.last()
        println("LAST :$last")
        val lastIndex = array.lastIndex

        val temp = array[0]
        array[0] = last
        array[lastIndex] = temp

        println(array.joinToString())
        return array.joinToString()

    }
    val swap = swapElements(arrayString).toString()
    println("Array: $swap")

    // Task2: Sum Array
    val arrayInt = arrayOf(1,2,3)
    fun sumOfIntegers(numbers: Array<Int>): Int {
        val sum = numbers.sum()
        return sum

    }
    val sumOfAll = sumOfIntegers(arrayInt)
    println("Sum: $sumOfAll")

    // Unit7
    // Task1
    println("\n--- Unit 7: Checking Elements ---")
    fun isPresent(list: List<String>, item: String): Boolean {
        return list.contains(item)
    }

    val exampleList = listOf("Kotlin", "Java", "C++", "C#")

    val message = isPresent(exampleList, "Aish")
    println("Is Present? $message")

    // Task2
    fun areAllPositive(list: List<Int>): Boolean {
        return list.all { it > 0 }
    }

    val allPositiveFalseCheck = areAllPositive(listOf(-3, -2, 0, 1, 2, 3, 4, 5, -7))
    println("All positive? $allPositiveFalseCheck")

    val allPositiveTrueCheck = areAllPositive(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    println("All positive? $allPositiveTrueCheck")


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

// --------------------------------------------
// Unit 3: Classes
// --------------------------------------------

// Task1
class PhoneBook {
    val phoneBook = mutableMapOf<String, Int>()
    fun addContact(name: String, phone: Int):  Map<String, Int>{
        phoneBook[name] = phone
        return phoneBook
    }

    fun findPhone(name: String): Int? {
        return phoneBook[name]
    }
}

// Task2
class FrequencyCounter {
    fun countWords(words: List<String>): Map<String, Int>{
        val wordCounts = words.groupingBy { it }.eachCount()
        return wordCounts
    }
}


// --------------------------------------------
// Unit 5: Functions
// --------------------------------------------

// Task2
