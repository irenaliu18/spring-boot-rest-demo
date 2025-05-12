package com.example.todo_rest_api.uiservice;

import com.example.todo_rest_api.data.TodoItem;
import com.example.todo_rest_api.services.TodoItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UiServiceController {
    private final TodoItemService todoItemService;

    public UiServiceController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @GetMapping("/todo-items")
    public List<TodoItem> getTodoItems() {
        return this.todoItemService.getAllTodoItems();
    }

    @PostMapping("/todo-items")
    @ResponseStatus(HttpStatus.CREATED)
    public TodoItem addTodoItem(@RequestBody TodoItem todoItem) {
        return this.todoItemService.addTodoItem(todoItem);
    }
}
