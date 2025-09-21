package org.example.com.jeremy.kotlinpractice.module3.unit5.task3

class Recipe (private val ingredients: List<String>, val name: String) {
    fun printIngredients() {
        println("Ingredients:")
        for (ingredient in ingredients) {
            println("- $ingredient")
        }
    }
}