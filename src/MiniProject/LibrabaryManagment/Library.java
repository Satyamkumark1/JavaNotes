package MiniProject.LibrabaryManagment;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // This class represents a library that manages a collection of books.
    private final List<Book> books =  new ArrayList<>();
    // The books list holds all the books in the library.
    public void addBook(Book book){
        books.add(book);
        System.out.println("The book has been added successfully.");

    }
    // This method adds a new book to the library's collection.
    public void viewAllBooks() {
        for (Book book : books) {
            System.out.println(book.toString());

        }
    }
    // This method displays all the books in the library.
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title)){
                if (book.status.equals("available")){
                    book.status = "borrowed";
                    System.out.println("You have borrowed the book -" +title);
                } else {
                    System.out.println("The Book is already borrowed:"+title);
                } return;
            }
        }
        System.out.println("The book mentioned does not exist :");

    }
    // This method allows a user to borrow a book by its title.
    public  void  returnBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title)){
                if (book.status.equals("borrowed")){
                    book.status = "available";
                    System.out.println("The book has been returned successfully.");
                    return;
                } else {
                    System.out.println("The book was not borrowed.");
                    return;
                }
            }
        }
        System.out.println("The title you mentioned was never borrowed");
    }




}
