package jeremy.kotlincourses.chapter3.unit4

class Student {
    var age: Int = 0
        set(value) {
            if (value in 5..100) field = value
        }

    val isAdult: Boolean
        get() = age > 18

    private var _name = ""
    var name: String
        get() = _name
        set(value) {
            if (value.isNotEmpty()) _name = value
        }

}