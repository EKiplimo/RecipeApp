package com.example.recipeapp

import androidx.lifecycle.ViewModel
import com.example.recipeapp.datasource.RecipeDatasource
import com.example.recipeapp.model.Recipe
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RecipeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(Recipe())

    var uiState: StateFlow<Recipe> = _uiState.asStateFlow()
        private set


    fun updateRecipe(id:Int) {
        val recipe = RecipeDatasource.recipes[id]

        _uiState.update { currentState ->
            currentState.copy(
                id = recipe.id,
                name = recipe.name,
                type = recipe.type,
                serves = recipe.serves,
                difficulty = recipe.difficulty,
                ingredients = recipe.ingredients,
                image = recipe.image,
                preparationSteps = recipe.preparationSteps
            )


        }
    }



}