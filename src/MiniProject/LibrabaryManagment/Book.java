package MiniProject.LibrabaryManagment;

public class Book {

    String title;
    String author;
    String status;

    //constructor for Book class
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = "available";
    }

    // Getters and Setters
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    // Method to mark the book as borrowed or available
    public void markAsBorrowed() {
        status = "borrowed";
    }

    // Method to mark the book as available
    public void markAsAvailable() {
        status = "available";
    }
    // Getters for title, author, and status

    public String getStatus() {
        return status;
    }
    // Getters for author
    public String getTitle() {
        return title;
    }
}
