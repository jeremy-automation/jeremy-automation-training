package jeremy.kotlincourses.chapter3.unit3

import jeremy.kotlincourses.chapter3.unit3.mathops.add
import jeremy.kotlincourses.chapter3.unit3.stringops.concat

fun main (){
    val res = add(2,3)
    println(res)

    val stringRes = concat("Hej", "Jeremy")
    println(stringRes)
}