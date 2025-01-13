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
    private String id;
    private String header;
    private String description;
    private boolean completed;
    private String color;

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getColor() {
        return color;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
