package com.cs396.fsse_demo.recipe_step_tracker.services;

import com.cs396.fsse_demo.recipe_step_tracker.data.RecipeStep;
import com.cs396.fsse_demo.recipe_step_tracker.data.RecipeStepRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeStepService {
    private final RecipeStepRepository recipeStepRepository;

    public RecipeStepService(RecipeStepRepository recipeStepRepository) {
        this.recipeStepRepository = recipeStepRepository;
    }

    public List<RecipeStep> getAllRecipeSteps() {
        Iterable<RecipeStep> stepIterator = this.recipeStepRepository.findAll();
        List<RecipeStep> recipeSteps = new ArrayList<>();

        for (RecipeStep r : stepIterator) {
            recipeSteps.add(r);
        }

        return recipeSteps;
    }

    public RecipeStep addRecipeStep(RecipeStep recipeStep) {
        if (recipeStep == null) {
            throw new RuntimeException("Recipe step can't be null");
        }

        return this.recipeStepRepository.save(recipeStep);
    }

    public RecipeStep addRecipeStep(String step, Boolean completed) {
        RecipeStep recipeStep = new RecipeStep(step, completed);
        return this.recipeStepRepository.save(recipeStep);
    }
}
