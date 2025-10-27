package org.example.jeremy.kotlincourses.chapter5

import jeremy.kotlincourses.chapter2.add
import java.util.Locale
import java.util.Locale.getDefault


// Chapter 5 — Practice Solutions
// All tasks from Units 1–12 in a single Kotlin file, organized and ready to run for demonstration and review.

// --------------------------------------------
// Main Function: Demo all solutions
// --------------------------------------------

fun main() {
    // Unit1
    println("\n--- Unit 1: List ---")
    // Task1: Student Grades
    val student = Student("jeremy", listOf(90,100,89))
    val ave = student.averageGrade()
    println("Student's average is: $ave")

    // Task2: MathUtils
    val mathUtils = MathUtils()
    val sum = mathUtils.sumOfEven(listOf(2,3,4,6,5))
    println("Sum of evens: $sum")

    // Unit2
    println("\n--- Unit 2: Set ---")
    // Task1: Unique Names
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
    println("\n--- Unit 3: Map ---")
    // Task1: Phone Book
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

    // Unit 4
    println("\n--- Unit 4: Sequence ---")
    // Task1: Even Numbers Sequence
    fun generateSequence(increment: Int, limit: Int): IntArray {
        val array = IntArray(limit + 1) { i -> (i * increment) }
        return array
    }

    val sequenceArray = generateSequence(2, 10).asSequence()
    val sequenceArrayAsString = sequenceArray.joinToString { it.toString() }
    println("Sequence: $sequenceArrayAsString")

    val firstFiveElements = sequenceArray.take(5)
    val firstFiveElementsAsString = firstFiveElements.toList().joinToString { it.toString() }
    println("First five elements: $firstFiveElementsAsString")

    // Task2: Filter Sequence
    fun filterList(list: List<Int>): List<Int> {
        return list.asSequence()
            .filter { it < 10 }
            .toList()
    }
    val filteredList = filterList(listOf(7, 9, 10, 11))
    println("Filtered List: $filteredList")

    // Unit5
    println("\n--- Unit 5: Array ---")
    // Task1: Swap Elements
    val arrayString = arrayOf("Chainsmoker","Lany","Lauv","Zara")

    fun swapElements(array: Array<String>): Array<String> {
        val temp = array[0]
        array[0] = array[array.lastIndex]
        array[array.lastIndex] = temp
        return array
    }
    val swap = swapElements(arrayString)
    println("Swapped elements: ${swap.joinToString()}")

    // Task2: Sum Array
    val arrayInt = arrayOf(1,2,3)
    fun sumOfIntegers(numbers: Array<Int>): Int {
        val sum = numbers.sum()
        return sum

    }
    val sumOfAll = sumOfIntegers(arrayInt)
    println("Sum: $sumOfAll")

    // Unit6
    println("\n--- Unit 6: Filtering Collections ---")
    // Task1: Filter Names By Length
    fun filterFourLetters(names: List<String>): List<String> {
        return names.filter { it.length > 4 }
    }
    val filteredNames = filterFourLetters(listOf("Jere","Cha","Flores"))
    println("Names with more than 4 letters: $filteredNames")

    // Task2: Filter Not Nulls
    fun filterNotNull(numbers: List<Int?>): List<Int> {
        return numbers.filterNotNull()
    }
    val filterIntegers = filterNotNull(listOf(1,null,2,3))
    println("Numbers not null: $filterIntegers")

    // Unit7
    println("\n--- Unit 7: Checking Elements ---")
    // Task1: Contains check
    fun isPresent(list: List<String>, item: String): Boolean {
        return list.contains(item)
    }

    val exampleList = listOf("Kotlin", "Java", "C++", "C#")
    val message = isPresent(exampleList, "Aish")
    println("Is Present? $message")

    // Task2: All Positive
    fun areAllPositive(list: List<Int>): Boolean {
        return list.all { it > 0 }
    }

    val allPositiveFalseCheck = areAllPositive(listOf(-3, -2, 0, 1, 2, 3, 4, 5, -7))
    println("All positive? $allPositiveFalseCheck")

    val allPositiveTrueCheck = areAllPositive(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    println("All positive? $allPositiveTrueCheck")

    // Unit8
    println("\n--- Unit 8: Transformations ---")
    // Task1: Uppercase All
    fun convertToUppercase(strings: List<String>): List<String> {
        return strings.map{ it.uppercase(getDefault()) }
    }
    val uppercase = convertToUppercase(listOf("apple","banana","carrot"))
    println("Uppercase: $uppercase")

    // Task2: Double Numbers
    fun returnDouble(numbers: List<Int>): List<Double> {
        return numbers.map { it.toDouble() }
    }
    val double = returnDouble(listOf(1,2,3))
    println("Double: $double")

    // Unit 9
    println("\n--- Unit 9: Grouping ---")
    // Task1: Group by First Letter
    fun groupByFirstLetter(words: List<String>): Map<Char, List<String>> {
        return words.groupBy { it.first() }
    }
    val groupByFirstLetter = groupByFirstLetter(listOf("apple","ax","banana","boat"))
    println("Grouped by first letter: $groupByFirstLetter")

    // Task2: Group by Length
    fun groupByLength(list: List<String>): Map<Int, List<String>> {
        return list.groupBy{ it.length }
    }
    val groupByLength = groupByLength(listOf("four","five","cat","cup"))
    println("Grouped by length $groupByLength")

    // Unit 10
    println("\n--- Unit 10: Sorting ---")
    // Task1: Sort by Length
    fun sortByLength(strings: List<String>): List<String> {
        return strings.sortedBy { it.length }
    }
    val sortByLength = sortByLength(listOf("blessing","perfect","shower"))
    println("Sorted by Length: $sortByLength")

    // Task2: Sort Descending
    fun sortByDescending(list: List<Int>): List<Int> {
        return list.sortedDescending()
    }
    val sortByDesc = sortByDescending(listOf(4,2,5,1))
    println("Sorted by descending $sortByDesc")

    //Unit 11
    println("\n--- Unit 11: Aggregate Operations ---")
    // Task1: Find Max
    fun findMax(list: List<Int>): Int? {
        return list.maxOrNull()
    }
    val findMax = findMax(listOf(1,2,3,5))
    println("Max: $findMax")

    //Task2: Average Score
    fun computeAverage(list: List<Int>): Double {
        return list.average()
    }
    val computeAverage = computeAverage(listOf(10,20,30))
    println("Average: $computeAverage")

    //Unit 12
    println("\n--- Unit 12: Add, Subtract, Union ---")
    // Task1: Add Elements
    fun combineList(list: List<String>, listTwo: List<String>): List<String> {
        return list + listTwo
    }
    val firstList = listOf("tulips","dahlia")
    val secondList = listOf("roses","sunflower")
    val combined = combineList(firstList , secondList)
    println("Combined List: $combined")

    // Task2: Subtract Elements
    fun removeElements(list: List<String>, listTwo: List<String>): List<String> {
        return list - listTwo
    }
    val first = listOf("egg","bacon","bread")
    val second = listOf("ham","egg","bacon")
    val removeElement = removeElements(first,second)
    println("Removed element $removeElement")

    // Unit 13
    println("\n--- Unit 13: Get Part ---")
    // Task1: Take First N
    fun firstN(list: List<Int>,n: Int): List<Int> {
        return list.subList(0, n)
    }
    val firstN = firstN(listOf(1,2,3,5,6,7),4)
    println("First N: $firstN")

    // Task2: Chunk List
    fun chunkList(list: List<Int>, size: Int): List<List<Int>> {
        return list.chunked(size)
    }
    val chunk = chunkList(listOf(1,2,3,4,5,6,7,8,9),3)
    println("Chunked list: $chunk")

    // Unit 14
    println("\n--- Unit 14: Get Individual Elements ---")
    fun returnValueOrNull(list: List<String>,index: Int): String {
        return if (index in list.indices) list[index] else "not found"
    }
    val returnIndexVal = returnValueOrNull(listOf("apple","banana","carrot"),2)
    println("Index Value: $returnIndexVal")

    val returnNotFound = returnValueOrNull(listOf("apple","banana","carrot"),4)
    println("Out of bound: $returnNotFound")
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