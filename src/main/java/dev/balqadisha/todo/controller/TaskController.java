package dev.balqadisha.todo.controller;

import dev.balqadisha.todo.model.Task;
import dev.balqadisha.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// The controller is part of the presentation layer in the Spring Boot MVC
// MVC - Model-View-Control
// The main job is to handle incoming HTTP requests, work on them, and return appropriate HTTP response


// Tells Spring Boot that the class handles HTTPS requests and return JSON in the response body
@RestController

// Maps "/api/tasks" to the controller
// Any request done to "/api/tasks" is redirected to this controller
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    // Specifically handles HTTP GET requests
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Specifically handles HTTP POST requests
    @PostMapping

    // @RequestBody here converts JSON to Task object
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        Task createdTask = taskService.addTask(task);

        // ResponseEntity represents the entire HTTP response including:
        // Body - task object or error message
        // HTTPS Status - 200, 201, 204, 404
        // Headers - optional metadata
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    // Specifically handles HTTP DELETE requests
    @DeleteMapping("/{id}")

    // @PathVariable extracts values from URI:
    // If the request is DELETE /api/task/123 it extracts 123 from the URI and assigns to id String
    public ResponseEntity<Void> deleteTask(@PathVariable String id) {
        taskService.deleteTask(id);

        // noContent() - means no body in the response
        // build() - constructs the ResponseEntity (in this case with status 204 NO CONTENT)
        return ResponseEntity.noContent().build();
    }
}
