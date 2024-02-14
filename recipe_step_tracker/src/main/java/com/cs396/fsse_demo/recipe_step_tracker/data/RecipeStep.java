package com.cs396.fsse_demo.recipe_step_tracker.data;

import jakarta.persistence.*;

@Entity
@Table(name="RECIPE_STEPS")
public class RecipeStep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="STEP_ID")
    private long id;
    @Column(name="STEP")
    private String step;
    @Column(name="COMPLETED")
    private boolean completed;

    public RecipeStep() {
    }

    public RecipeStep(String step, boolean completed) {
        this.step = step;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "RecipeStep{" +
                "id=" + id +
                ", step='" + step + '\'' +
                ", completed=" + completed +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
