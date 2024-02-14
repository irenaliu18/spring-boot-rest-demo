package com.cs396.fsse_demo.recipe_step_tracker.uiservice;

import com.cs396.fsse_demo.recipe_step_tracker.data.RecipeStep;
import com.cs396.fsse_demo.recipe_step_tracker.services.RecipeStepService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UiServiceGraphQLController {
    private final RecipeStepService recipeStepService;

    public UiServiceGraphQLController(RecipeStepService recipeStepService) {
        this.recipeStepService = recipeStepService;
    }

    @QueryMapping
    public List<RecipeStep> recipeSteps() {
        return this.recipeStepService.getAllRecipeSteps();
    }

    @MutationMapping
    public RecipeStep addRecipeStep(@Argument String step, @Argument Boolean completed) {
        return this.recipeStepService.addRecipeStep(step, completed);
    }
}
