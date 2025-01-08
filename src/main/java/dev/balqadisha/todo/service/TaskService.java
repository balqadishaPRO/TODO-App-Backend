package dev.balqadisha.todo.service;

import dev.balqadisha.todo.model.Task;
import dev.balqadisha.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Handles the business logic of an app
@Service
public class TaskService {

    // You don't need to manually create objects
    // Normally, you would do this:
    // private TaskRepository taskRepository = new TaskRepository();
    // Since TaskRepository is an interface you cannot do this
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
        // Adds a new task or updates an existing task if the id already exists
    }

    public void deleteTask(String id) {
        taskRepository.deleteById(id);
        // if id is undefined, does nothing
    }
}
