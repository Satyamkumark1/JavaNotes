package MiniProject.TodoApp;

import java.util.ArrayList;
import java.util.List;

public class App {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String description) {
        if (description == null || description.trim().isEmpty()) {
            System.out.println("Task description cannot be empty.");
            return;
        }
        Task newTask = new Task(nextId, description.trim(), "pending");
        tasks.add(newTask);
        System.out.println("Task added: " + newTask);
        nextId++;
    }

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

    public void viewAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void deleteTask(int id) {
        boolean removed = tasks.removeIf(task -> task.id == id);
        if (removed) {
            System.out.println("Task with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Task ID " + id + " not found.");
        }
    }
}
