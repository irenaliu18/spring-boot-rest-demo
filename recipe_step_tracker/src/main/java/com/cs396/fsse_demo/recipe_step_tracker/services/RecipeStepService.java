package com.cs396.fsse_demo.recipe_step_tracker.services;

import com.cs396.fsse_demo.recipe_step_tracker.data.RecipeStep;
import com.cs396.fsse_demo.recipe_step_tracker.data.RecipeStepRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
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
}
