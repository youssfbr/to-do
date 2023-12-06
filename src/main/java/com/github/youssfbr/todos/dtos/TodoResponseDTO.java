package com.github.youssfbr.todos.dtos;

import com.github.youssfbr.todos.entities.Todo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record TodoResponseDTO(
        Long id,
        String title,
        String description,
        LocalDateTime createdAt,
        LocalDate deadline,
        LocalDate fineshedAt
) {
    public TodoResponseDTO(Todo todo) {
        this(
                todo.getId(),
                todo.getTitle(),
                todo.getDescription(),
                todo.getCreatedAt(),
                todo.getDeadline(),
                todo.getFineshedAt()
        );
    }
}
