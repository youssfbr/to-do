package com.github.youssfbr.todos.services.impl;

import com.github.youssfbr.todos.dtos.TodoResponseDTO;
import com.github.youssfbr.todos.repositories.ITodoRepository;
import com.github.youssfbr.todos.services.ITodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService implements ITodoService {

    private final ITodoRepository todoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TodoResponseDTO> findAllTodos() {
        return todoRepository.findAll()
                .stream()
                .map(TodoResponseDTO::new)
                .toList();
    }
}
