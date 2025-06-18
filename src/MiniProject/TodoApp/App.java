package MiniProject.TodoApp;

import java.util.ArrayList;
import java.util.List;

/**
 * App class manages the list of tasks and provides methods to add, complete, view, and delete tasks.
 */
public class App {
    // List to store all tasks
    private final List<Task> tasks = new ArrayList<>();
    // Counter to assign unique IDs to tasks
    private int nextId = 1;

    /**
     * Adds a new task with the given description.
     * Validates that the description is not empty.
     * @param description The description of the task to add.
     */
    public void addTask(String description) {
        if (description == null || description.trim().isEmpty()) {
            System.out.println("Task description cannot be empty.");
            return;
        }
        // Create a new Task object with a unique ID and status "pending"
        Task newTask = new Task(nextId, description.trim(), "pending");
        tasks.add(newTask); // Add the task to the list
        System.out.println("Task added: " + newTask);
        nextId++; // Increment ID for the next task
    }

    /**
     * Marks the task with the given ID as complete.
     * If the task is already complete, notifies the user.
     * If the ID is invalid, prints an error message.
     * @param id The ID of the task to mark as complete.
     */
    public void markAsComplete(int id) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.id == id) {
                if (!"complete".equals(task.status)) {
                    task.status = "complete";
                    System.out.println("Congratulations, you completed the task: " + task.description);
                } else {
                    System.out.println("Task is already marked as complete.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mention the right id.");
        }
    }

    /**
     * Displays all tasks in the list.
     * If no tasks exist, notifies the user.
     */
    public void viewAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    /**
     * Deletes the task with the given ID.
     * If the task is found and deleted, confirms deletion.
     * If not found, prints an error message.
     * @param id The ID of the task to delete.
     */
    public void deleteTask(int id) {
        boolean removed = tasks.removeIf(task -> task.id == id);
        if (removed) {
            System.out.println("Task with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Task ID " + id + " not found.");
        }
    }
}