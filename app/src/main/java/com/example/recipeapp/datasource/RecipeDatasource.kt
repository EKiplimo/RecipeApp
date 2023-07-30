package com.example.recipeapp.datasource

import androidx.compose.ui.res.stringResource
import com.example.recipeapp.R
import com.example.recipeapp.model.Recipe

object RecipeDatasource {

    val recipes = listOf(
        Recipe(
            id = 0,
            name = "Pancakes",
            type = "Breakfast",
            serves = 2,
            difficulty = "Beginner",
            ingredients = listOf(
                "1 cup all-purpose flour",
                "2 tablespoons sugar",
                "1 teaspoon baking powder",
                "1/2 teaspoon salt",
                "3/4 cup milk",
                "1 large egg",
                "1 large egg",
                "2 tablespoons unsalted butter, melted"
            ),
            preparationSteps = listOf(
                "In a mixing bowl, whisk together flour, sugar, baking powder, and salt.",
                "In a separate bowl, whisk together milk, egg, and melted butter.",
                "Pour the wet ingredients into the dry ingredients and stir until just combined.",
                "Heat a non-stick pan over medium heat and pour 1/4 cup of batter for each pancake.",
                "Cook until bubbles form on the surface, then flip and cook until golden brown on the other side.",
                "Serve with maple syrup and fresh fruits."
            ),
            image = R.drawable.pancakes
        ),

        Recipe(
            id = 1,
            name = "Chicken Caesar Salad",
            type = "Lunch",
            serves = 4,
            difficulty = "Intermediate",
            ingredients = listOf(
                "2 boneless, skinless chicken breasts",
                "Salt and pepper to taste",
                "1 tablespoon olive oil",
                "1 head romaine lettuce, chopped",
                "1/2 cup croutons",
                "1/4 cup grated Parmesan cheese",
                "Caesar dressing"
            ),
            preparationSteps = listOf(
                "Season chicken breasts with salt and pepper. Heat olive oil in a pan over medium-high heat.",
                "Cook chicken until no longer pink in the center, about 6-7 minutes per side. Let it rest, then slice.",
                "In a large bowl, combine chopped lettuce, croutons, and Parmesan cheese.",
                "Add the sliced chicken on top and drizzle with Caesar dressing.",
                "Toss the salad until everything is well coated with the dressing.",
                "Serve immediately and enjoy!"
            ),
            image = R.drawable.chicken_caesar_salad

        ),

        Recipe(
            id = 2,
            name = "Spaghetti Carbonara",
            type = "Supper",
            serves = 3,
            difficulty = "Advanced",
            ingredients = listOf(
                "8 ounces spaghetti",
                "2 large eggs",
                "1 cup grated Pecorino Romano cheese",
                "4 ounces pancetta or guanciale, diced",
                "2 cloves garlic, minced",
                "Freshly ground black pepper"
            ),
            preparationSteps = listOf(
                "Cook spaghetti in boiling salted water until al dente. Reserve 1/2 cup of pasta water, then drain.",
                "In a bowl, whisk together eggs, grated cheese, and black pepper.",
                "In a pan, cook pancetta or guanciale until crispy. Add minced garlic and cook for a minute.",
                "Reduce heat to low and add cooked spaghetti to the pan. Toss to coat the pasta with the pancetta and garlic.",
                "Remove from heat, and quickly pour in the egg mixture, stirring vigorously to create a creamy sauce.",
                "If needed, add some of the reserved pasta water to achieve the desired consistency.",
                "Serve immediately with additional cheese and pepper on top."
            ),
            image = R.drawable.spaghetti_carbonara
        ),

        Recipe(
            id = 3,
            name = "Avocado Toast",
            type = "Breakfast",
            serves = 1,
            difficulty = "Beginner",
            ingredients = listOf(
                "1 ripe avocado",
                "2 slices whole-grain bread, toasted",
                "1 tablespoon lemon juice",
                "Salt and pepper to taste",
                "Red pepper flakes (optional)"
            ),
            preparationSteps = listOf(
                "Cut the avocado in half, remove the pit, and scoop the flesh into a bowl.",
                "Mash the avocado with a fork and mix in lemon juice, salt, and pepper.",
                "Spread the avocado mixture on the toasted bread slices.",
                "Sprinkle with red pepper flakes for some heat, if desired.",
                "Serve immediately as a quick and nutritious breakfast."
            ),
            image = R.drawable.avocado_toast
        ),

        Recipe(
            id = 4,
            name = "Chicken Noodle Soup",
            type = "Lunch",
            serves = 6,
            difficulty = "Intermediate",
            ingredients = listOf(
                "1 tablespoon olive oil",
                "1 onion, diced",
                "2 carrots, sliced",
                "2 celery stalks, sliced",
                "2 garlic cloves, minced",
                "6 cups chicken broth",
                "2 boneless, skinless chicken breasts, cooked and shredded",
                "2 cups egg noodles",
                "1 teaspoon dried thyme",
                "Salt and pepper to taste"
            ),
            preparationSteps = listOf(
                "In a large pot, heat olive oil over medium heat. Add diced onions, sliced carrots, and celery.",
                "Cook until vegetables are tender, then add minced garlic and cook for another minute.",
                "Pour in chicken broth and bring to a boil. Add shredded chicken and dried thyme.",
                "Reduce heat and let it simmer for about 10 minutes.",
                "Add egg noodles and cook according to package instructions.",
                "Season with salt and pepper to taste.",
                "Serve hot and enjoy a comforting bowl of chicken noodle soup."
            ),
            image = R.drawable.chicken_noodle_soup
        ),

        Recipe(
            id = 5,
            name = "Beef Stir-Fry",
            type = "Supper",
            serves = 4,
            difficulty = "Intermediate",
            ingredients = listOf(
                "1 pound beef sirloin, thinly sliced",
                "2 tablespoons soy sauce",
                "2 tablespoons oyster sauce",
                "1 tablespoon cornstarch",
                "1 tablespoon vegetable oil",
                "2 garlic cloves, minced",
                "1-inch piece of ginger, grated",
                "1 red bell pepper, sliced",
                "1 yellow bell pepper, sliced",
                "1 cup broccoli florets",
                "2 green onions, sliced"
            ),
            preparationSteps = listOf(
                "In a bowl, marinate thinly sliced beef with soy sauce, oyster sauce, and cornstarch for 15-20 minutes.",
                "Heat vegetable oil in a wok or large pan over high heat.",
                "Stir-fry minced garlic and grated ginger for a minute until fragrant.",
                "Add marinated beef and cook until browned and almost cooked through. Remove from the wok and set aside.",
                "In the same wok, stir-fry sliced bell peppers and broccoli until tender-crisp.",
                "Return the beef to the wok, add sliced green onions, and stir everything together.",
                "Serve hot over steamed rice or noodles."
            ),
            image = R.drawable.beef_stir_fry
        )
    )

}