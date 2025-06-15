package MiniProject.TodoApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    // Task Manager Application
    List<Task> tasks = new ArrayList<>();
    // Variable to keep track of the next task ID
    int nextId = 1; // Start from 1

    // Method to add a new task
    public void addTask(String description) {
        Task newTask = new Task(nextId, description, "pending");
        tasks.add(newTask);
        nextId++; // Increment the ID for the next task
    }

    // Method to mark a task as complete
    public void markAsComplete(int id) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.id == id) {
                task.status = "complete";
                System.out.println("Congratulations you completed the task");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mention right id");
        }
    }
    // Method to view all tasks

    public void viewAllTasks() {
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
    }

    // Method to delete a task by ID
    public void deleteTask(int id) {
        boolean removed = tasks.removeIf(task -> task.id == id);

        if (removed) {
            System.out.println("Task with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Task ID " + id + " not found.");
        }
    }

}