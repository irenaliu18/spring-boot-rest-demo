package com.cs396.fsse_demo.recipe_step_tracker.uiservice;

import com.cs396.fsse_demo.recipe_step_tracker.data.RecipeStep;
import com.cs396.fsse_demo.recipe_step_tracker.services.RecipeStepService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UiServiceController {
    private final RecipeStepService recipeStepService;

    public UiServiceController(RecipeStepService recipeStepService) {
        this.recipeStepService = recipeStepService;
    }

    @GetMapping("/recipe-steps")
    public List<RecipeStep> getRecipeSteps()  {
        return this.recipeStepService.getAllRecipeSteps();
    }

    @PostMapping("/recipe-steps")
    @ResponseStatus(HttpStatus.CREATED)
    public RecipeStep addRecipeStep(@RequestBody RecipeStep recipeStep) {
        return this.recipeStepService.addRecipeStep(recipeStep);
    }
}
