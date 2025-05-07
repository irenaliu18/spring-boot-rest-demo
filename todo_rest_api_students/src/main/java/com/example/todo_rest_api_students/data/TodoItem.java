package com.example.todo_rest_api_students.data;

import jakarta.persistence.*;

@Entity
@Table(name="TODO_ITEMS")
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TODO_ID")
    private long id;

    @Column(name="TODO_VALUE")
    private String value;

    @Column(name="COMPLETED")
    private boolean completed;

    @Override
    public String toString() {
        return "TodoItem [id=" + id + ", value=" + value + ", completed=" + completed + "]";
    }

    public TodoItem() {
    }

    public TodoItem(String value, boolean completed) {
        this.value = value;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}