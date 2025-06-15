package MiniProject.LibrabaryManagment;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();  // Create an instance of Library
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Adding some initial books to the library
        library.addBook(new Book("c++", "Satyam"));
        library.addBook(new Book("Java", "Shalini"));

        // Main loop for the library application

        while (true) {
            // Displaying the menu options
            System.out.println("1.Add Book");
            System.out.println("2.View All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4.Return Book");
            System.out.println("5. Exit");
            System.out.println();

            System.out.println("Select a number :");
            // Reading user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Handling user choice
            switch (choice) {
                // Case 1: Add a new book
                case 1: {
                    System.out.println("Enter the Author name:");
                    String author = scanner.nextLine();
                    System.out.println("Enter the book title:");
                    String title = scanner.nextLine();
                    // Adding the book to the library
                    library.addBook(new Book(title, author));
                    break;
                }
                // Case 2: View all books
                case 2: {
                    library.viewAllBooks();
                    break;
                }
                // Case 3: Borrow a book
                case 3: {
                    System.out.println("Enter the book title you want to borrow:");
                    String title = scanner.nextLine();
                    library.borrowBook(title);
                    break;
                }
                // Case 4: Return a book
                case 4: {
                    System.out.println("Enter the book title you want to return:");
                    String title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                }
                // Case 5: Exit the application
                case 5: {
                    System.out.println("Exiting the application.");
                    return;
                }
                // Default case for invalid input
                default: {
                    System.out.println("Enter a valid statement.");
                    break;
                }
            }
        }
    }
}
