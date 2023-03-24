package org.tvt.postServices.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tvt.postServices.dto.Todo;
import org.tvt.postServices.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todos")
@AllArgsConstructor
public class TodosController {

    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createTodo(Todo todo) {
        todoService.create(todo);
        return "Todo created";

    }


}
