package com.example.todo_rest_api_students.uiservice;

import com.example.todo_rest_api_students.data.TodoItem;
import com.example.todo_rest_api_students.services.TodoItemService;
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
//        Get all todoitems from the service
    }

    @PostMapping("/todo-items")
    @ResponseStatus(HttpStatus.CREATED)
    public TodoItem addTodoItem(@RequestBody TodoItem todoItem) {
//        add TodoItem using service
    }
}
