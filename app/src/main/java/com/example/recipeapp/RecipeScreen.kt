package com.example.recipeapp

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.recipeapp.model.Recipe


@Composable
fun RecipeScreen(
    modifier: Modifier = Modifier,
    recipe: Recipe,
) {


    Column(modifier = modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {

        Image(
            painter = painterResource(id = recipe.image) ,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))

        Column(modifier = modifier.padding(16.dp)) {

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "${recipe.name}(${recipe.serves})", style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.width(200.dp))
                Text(text = recipe.type, style = MaterialTheme.typography.displaySmall )
                Text(text = recipe.difficulty, style = MaterialTheme.typography.displaySmall)
            }

            Spacer(modifier.height(20.dp))

            Text(text = "Ingredients", style = MaterialTheme.typography.displayMedium)
            Spacer(modifier.height(5.dp))

            var count = 1
            recipe.ingredients.forEach {
                Text(text = "$count. $it", style = MaterialTheme.typography.displaySmall)
                count ++
            }

            Spacer(modifier.height(20.dp))

            Text(text = "Preparation", style = MaterialTheme.typography.displayMedium)
            Spacer(modifier.height(5.dp))

            count = 1
            recipe.preparationSteps.forEach {
                Text(text = "$count. $it", style = MaterialTheme.typography.displaySmall)
                count ++
            }
        }
        



    }

}