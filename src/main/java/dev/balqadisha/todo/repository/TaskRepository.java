package dev.balqadisha.todo.repository;

import dev.balqadisha.todo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

// Use interface because we don't need to manually implement methods
public interface TaskRepository extends MongoRepository<Task, String> {
    // Here it extends to MongoDB repository and tells to work with "Task" objects
    // "String" here tells that the id is of type String
}
