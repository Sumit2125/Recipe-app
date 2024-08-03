package com.example.zayka

sealed class Screen(val route: String) {
    object RecipeScreen:Screen("recipescreen")
    object DetailScreen:Screen("detailscreen")

}