package com.example.todo_rest_api.services;

import com.example.todo_rest_api.data.TodoItem;
import com.example.todo_rest_api.data.TodoItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoItemService {
    //    Recognize this? It's dependency injection again!
    private final TodoItemRepository repository;

    public TodoItemService(TodoItemRepository repository) {
        this.repository = repository;
    }

    public List<TodoItem> getAllTodoItems() {
        List<TodoItem> todoItems = new ArrayList<>();

        for (TodoItem todoItem : this.repository.findAll()) {
            todoItems.add(todoItem);
        }

        return todoItems;
    }

    public TodoItem addTodoItem(TodoItem todoItem) {
//        best practice: add some validation logic here...
        if (todoItem == null) {
            throw new IllegalArgumentException("TodoItem cannot be null");
        }

        return this.repository.save(todoItem);
    }
}
