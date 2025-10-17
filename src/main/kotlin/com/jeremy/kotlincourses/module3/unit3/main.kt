package org.example.com.jeremy.kotlinpractice.module3.unit3

import org.example.com.jeremy.kotlinpractice.module3.unit3.mathops.add
import org.example.com.jeremy.kotlinpractice.module3.unit3.stringOps.concat

fun main (){
    val res = add(2,3)
    println(res)

    val stringRes = concat("Hej", "Jeremy")
    println(stringRes)
}