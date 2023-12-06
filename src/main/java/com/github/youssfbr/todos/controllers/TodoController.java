package com.github.youssfbr.todos.controllers;

import com.github.youssfbr.todos.entities.Todo;
import com.github.youssfbr.todos.services.ITodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final ITodoService todoService;

    @GetMapping("/")
    public ModelAndView list() {
        return new ModelAndView(
                "todo/list",
                Map.of("todos", todoService.findAllTodos()));
    }

    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("todo/form", Map.of("todo", new Todo()));
    }
    @PostMapping("/create")
    public String create(Todo todo) {
        todoService.createTodo(todo);
        return "redirect:/";
    }
}