package dev.balqadisha.todo.repository;

import dev.balqadisha.todo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
