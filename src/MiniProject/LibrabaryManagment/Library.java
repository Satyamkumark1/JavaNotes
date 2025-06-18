package MiniProject.LibrabaryManagment;

import java.util.ArrayList;
import java.util.List;

// Class representing a library that manages books
public class Library {

    private final List<Book> books = new ArrayList<>();

    /**
     * Adds a book to the library collection.
     * @param book The book to add.
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("The book has been added successfully.");
    }

    /**
     * Displays all books in the library.
     * If no books exist, notifies the user.
     */
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    /**
     * Allows a user to borrow a book by title.
     * If the book is available, marks it as borrowed.
     * If already borrowed or not found, notifies the user.
     * @param title The title of the book to borrow.
     */
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getStatus().equals("available")) {
                    book.markAsBorrowed();
                    System.out.println("You have borrowed the book - " + title);
                } else {
                    System.out.println("The Book is already borrowed: " + title);
                }
                return;
            }
        }
        System.out.println("The book mentioned does not exist: " + title);
    }


    /**
     * Allows a user to return a borrowed book by title.
     * If the book was borrowed, marks it as available.
     * If not borrowed or not found, notifies the user.
     * @param title The title of the book to return.
     */
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getStatus().equals("borrowed")) {
                    book.markAsAvailable();
                    System.out.println("The book has been returned successfully.");
                } else {
                    System.out.println("The book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("The title you mentioned was never borrowed: " + title);
    }
}
