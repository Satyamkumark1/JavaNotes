package MiniProject.TodoApp;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Initialize the application
        App app = new App();
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Adding some initial tasks to the application
        while (true) {
            System.out.println("\nWelcome to Task Manager");
            System.out.println("1. Add a Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Mark Task As Completed");
            System.out.println("4. Delete a Task");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
             // Read user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear the newline
                // Handle user choice
            switch (choice) {
                // Case 1: Add a new task
                case 1 -> {
                    System.out.print("Enter the description of the task: ");
                    String description = scanner.nextLine();
                    app.addTask(description);
                }
                // Case 2: View all tasks
                case 2 -> {
                    app.viewAllTasks();
                }
                // Case 3: Mark a task as completed
                case 3 -> {
                    System.out.print("Enter the Task ID to mark as completed: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    app.markAsComplete(id);
                }
                // Case 4: Delete a task
                case 4 -> {
                    System.out.print("Enter the Task ID to delete: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    app.deleteTask(id);
                }
                // Case 5: Exit the application
                case 5 -> {
                    System.out.println("Exiting Task Manager. Goodbye!");
                    return;
                }
                // Default case for invalid input
                default -> {
                    System.out.println("Enter a valid option (1-5).");
                }
            }
        }
    }
}
