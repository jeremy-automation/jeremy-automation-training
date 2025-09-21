package org.example.com.jeremy.kotlincourses.module3.library

fun main(){
    val book1: Book = Book("Hello Book","Jeremy")
    val book2: Book = Book("Brod", "Joe")
//    println(book1.description)
//    println(book2.description)
    book1.title = ""
    println(book1.description)
}