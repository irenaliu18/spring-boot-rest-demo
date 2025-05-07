package com.example.todo_rest_api_students.services;

import com.example.todo_rest_api_students.data.TodoItem;
import com.example.todo_rest_api_students.data.TodoItemRepository;
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

//        retrieve all items from the repository and store in list

        return todoItems;
    }

    public TodoItem addTodoItem(TodoItem todoItem) {
//        save the todoItem
    }
}
