package com.github.youssfbr.todos.repositories;

import com.github.youssfbr.todos.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoRepository extends JpaRepository<Todo, Long> {
}
