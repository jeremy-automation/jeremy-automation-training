package jeremy.kotlincourses.chapter3.unit2

fun main(){
    val book1: Book = Book("Hello Book", "Jeremy")
    val book2: Book = Book("Brod", "Joe")
    book1.title = ""
    println(book1.description)
}