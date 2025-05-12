1. Add the maven dependencies for h2 database and spring data
2. Run maven
2. Modify application.properties
3. Add schema.sql to create Recipe Steps table
4. Create data package
    5. Create RecipeStep model
    6. Create RecipeStepRepository
7. Create services package
    8. Create RecipeStepService
        9. Start with get
9. Create uiservice package
    10. Create UiServiceController
        11. Start with get
12. Modify service and controller to include post

============================================================

query AllRecipeSteps {
recipeSteps {
step,
completed
}
}

mutation AddRecipeStep($step: String, $completed: Boolean) {
addRecipeStep(step: $step, completed: $completed) {
id
step
}
}

======================================================
query AllFilms($first: Int, $last: Int) {
firstFilms: allFilms(first: $first) {
...filmFields
}

lastFilms: allFilms(last: $last) {
...filmFields  
}
}

fragment filmFields on FilmsConnection {
films {
title,
episodeID,
director,
planetConnection {
planets {
name
}
}
}
}