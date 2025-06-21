package MiniProject.LibrabaryManagment;

import java.util.Scanner;

/**
 * Main application class for the Library Management System.
 * Handles user interaction and delegates actions to the Library class.
 */
public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Use try-with-resources to ensure scanner is closed
        try (Scanner scanner = new Scanner(System.in)) {

            // Adding initial books to the library
            library.addBook(new Book("C++", "Satyam"));
            library.addBook(new Book("Java", "Shalini"));

            // Main loop for user interaction
            while (true) {
                System.out.println("1. Add Book");
                System.out.println("2. View All Books");
                System.out.println("3. Borrow Book");
                System.out.println("4. Return Book");
                System.out.println("5. Exit");
                System.out.println();
                System.out.print("Select a number: ");
                String input = scanner.nextLine();
                int choice;
                try {
                    choice = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Enter a valid number.");
                    continue;
                }

                switch (choice) {
                    // Handling user input for adding a book
                    case 1 -> {
                        System.out.println("Enter the Author name:");
                        String author = scanner.nextLine();
                        System.out.println("Enter the book title:");
                        String title = scanner.nextLine();
                        library.addBook(new Book(title, author));
                    }
                    // Handling user input for viewing all books
                    case 2 -> library.viewAllBooks();
                    // Handling user input for borrowing a book
                    case 3 -> {
                        System.out.println("Enter the book title you want to borrow:");
                        String title = scanner.nextLine();
                        library.borrowBook(title);
                    }
                    // Handling user input for returning a book
                    case 4 -> {
                        System.out.println("Enter the book title you want to return:");
                        String title = scanner.nextLine();
                        library.returnBook(title);
                    }
                    // Handling user input for exiting the application
                    case 5 -> {
                        System.out.println("Exiting the application.");
                        return;
                    }
                    default -> System.out.println("Enter a valid statement.");
                }
            }
        }
    }
}
