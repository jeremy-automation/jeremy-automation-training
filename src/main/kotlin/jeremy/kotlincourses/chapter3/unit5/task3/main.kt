package jeremy.kotlincourses.chapter3.unit5.task3

fun main() {
    val recipe = Recipe(listOf("Eggs", "Milk", "Sugar"), "Burnt cheesecake")
    println("Recipe name: ${recipe.name}")
    recipe.printIngredients()
//     println(recipe.ingredients) //Cannot access 'val ingredients: List<String>': it is private in

}