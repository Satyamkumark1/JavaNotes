package MiniProject.LibrabaryManagment;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("The book has been added successfully.");
    }

    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

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
