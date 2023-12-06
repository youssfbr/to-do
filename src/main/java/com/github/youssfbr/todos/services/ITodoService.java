package com.github.youssfbr.todos.services;

import com.github.youssfbr.todos.dtos.TodoResponseDTO;
import com.github.youssfbr.todos.entities.Todo;

import java.util.List;

public interface ITodoService {

    List<TodoResponseDTO> findAllTodos();
    void createTodo(Todo todo);
}
