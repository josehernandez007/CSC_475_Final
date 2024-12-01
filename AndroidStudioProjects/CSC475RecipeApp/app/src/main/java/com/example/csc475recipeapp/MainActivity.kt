package com.example.csc475recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.csc475recipeapp.ui.screens.HomeScreen
import com.example.csc475recipeapp.ui.theme.CSC475RecipeAppTheme
import com.example.csc475recipeapp.ui.viewmodel.RecipeViewModel
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface





class MainActivity : ComponentActivity() {
    private val recipeViewModel: RecipeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CSC475RecipeAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(recipeViewModel = recipeViewModel)
                }
            }
        }
    }
}
