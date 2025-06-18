package MiniProject.TodoApp;

/**
 * Task class representing a single task in the Todo application.
 */
public class Task {
    // Unique identifier for the task
    int id;
    // Description of the task
    String description;
    // Status of the task ("pending" or "complete")
    String status;

    /**
     * Constructor to initialize a Task object.
     * @param id Unique ID for the task.
     * @param description Description of the task.
     * @param status Status of the task.
     */
    public Task(int id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    /**
     * Returns a string representation of the task.
     * @return String with task details.
     */
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}