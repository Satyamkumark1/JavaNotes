package MiniProject.TodoApp;

public class Task {
    // Task class representing a single task in the Todo application
    int id;
    String description; // Fixed typo
    String status;

    // Constructor to initialize a Task object
    public Task(int id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }
    // Getter for task ID
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}