package org.tvt.postServices.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tvt.postServices.client.UserClient;
import org.tvt.postServices.dto.Todo;
import org.tvt.postServices.service.TodoService;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private UserClient userClient;

    @Override
    public List<Todo> getAllTodos() {
        return userClient.getTodos();
    }

    @Override
    public Todo create(Todo todo) {
        return userClient.createTodo(todo);
    }
}
