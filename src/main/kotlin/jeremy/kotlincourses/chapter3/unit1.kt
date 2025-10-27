package jeremy.kotlincourses.chapter3

class Dog {
    var name: String = ""
    var age: Int = 0

    fun bark() { //Task2
        println("Woof! My name is $name")
    }

    fun print() { //Task3
        println("Dog: $name, Age: $age")

    }
}

fun main() {
    val dogClass = Dog() //Task 3
    dogClass.name = "Yhoona"
    dogClass.age = 7
    println("Dog's name ${dogClass.name}, age: ${dogClass.age}")

    dogClass.bark() //Task 2

    val dog1 = Dog()
    dog1.name = "Albus"
    dog1.age = 4

    val dog2 = Dog()
    dog2.name = "Anya"
    dog2.age = 3

    val dog3 = Dog()
    dog3.name = "Luna"
    dog3.age = 2

    dog1.print()
    dog2.print()
    dog3.print()

}