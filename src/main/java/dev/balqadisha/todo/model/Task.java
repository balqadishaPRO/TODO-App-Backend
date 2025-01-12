package dev.balqadisha.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Tells that it a MongoDB document and uses "tasks" collection
@Document(collection = "tasks")

// Lombok annotation auto-generates getters and setters
// toString() and hashCode() and equals() methods are generated
@Data

// Generates constructors with all fields
@AllArgsConstructor

// Generates constructors with no fields
@NoArgsConstructor
public class Task {

    // Uses MongoDB to generate random id's
    @Id
    private String header;
    private String id;
    private String description;
    private boolean completed;

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getHeader() {
        return header;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
