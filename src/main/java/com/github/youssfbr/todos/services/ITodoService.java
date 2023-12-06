package com.github.youssfbr.todos.services;

import com.github.youssfbr.todos.dtos.TodoResponseDTO;

import java.util.List;

public interface ITodoService {

    List<TodoResponseDTO> findAllTodos();
}
