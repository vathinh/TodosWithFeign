package org.tvt.postServices.service;

import org.tvt.postServices.dto.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo create(Todo todo);

}
