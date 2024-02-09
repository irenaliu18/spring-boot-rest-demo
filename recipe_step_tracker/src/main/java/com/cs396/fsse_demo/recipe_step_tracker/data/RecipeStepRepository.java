package com.cs396.fsse_demo.recipe_step_tracker.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeStepRepository extends CrudRepository<RecipeStep, Long> {
}
