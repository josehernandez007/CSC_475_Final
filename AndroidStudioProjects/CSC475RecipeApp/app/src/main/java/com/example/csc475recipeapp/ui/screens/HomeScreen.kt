package com.example.csc475recipeapp.ui.screens

import androidx.compose.runtime.Composable
import com.example.csc475recipeapp.ui.components.ErrorComponent
import com.example.csc475recipeapp.ui.components.LoadingComponent
import com.example.csc475recipeapp.ui.components.SuccessComponent
import com.example.csc475recipeapp.ui.viewmodel.RecipeViewIntent
import com.example.csc475recipeapp.ui.viewmodel.RecipeViewModel
import com.example.csc475recipeapp.ui.viewmodel.RecipeViewState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue

@Composable
fun HomeScreen(recipeViewModel: RecipeViewModel) {
    val state by recipeViewModel.state

    when(state) {
        is RecipeViewState.Loading -> LoadingComponent()
        is RecipeViewState.Success -> {
            val recipes = (state as RecipeViewState.Success).recipes
            SuccessComponent (recipes = recipes, onSearchClicked = { query ->
                recipeViewModel.processIntent(RecipeViewIntent.SearchRecipes(query))
            })
        }
        is RecipeViewState.Error -> {
            val message = (state as RecipeViewState.Error).message
            ErrorComponent (message = message, onRefreshClicked = {
                recipeViewModel.processIntent(RecipeViewIntent.LoadRandomRecipe)
            })
        }
    }

    LaunchedEffect(Unit) {
        recipeViewModel.processIntent(RecipeViewIntent.LoadRandomRecipe)
    }
}