package com.example.csc475recipeapp.ui.viewmodel

sealed class RecipeViewIntent {
    object LoadRandomRecipe : RecipeViewIntent()
    data class SearchRecipes(val query: String) : RecipeViewIntent()
}