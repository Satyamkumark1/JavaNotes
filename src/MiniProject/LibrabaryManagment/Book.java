package MiniProject.LibrabaryManagment;

/**
 * Book class represents a single book in the library.
 * It contains information about the book's title, author, and status.
 */
public class Book {

    private final String title;
    private final String author;
    private String status;

    /**
     * Constructor to initialize a book with title and author.
     * By default, the book is available.
     * @param title The title of the book.
     * @param author The author of the book.
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = "available";
    }

    /**
     * Returns a string representation of the book.
     * @return String with book details.
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /**
     * Marks the book as borrowed.
     */
    public void markAsBorrowed() {
        status = "borrowed";
    }

    /**
     * Marks the book as available.
     */
    public void markAsAvailable() {
        status = "available";
    }

    /**
     * Gets the status of the book.
     * @return The status ("available" or "borrowed").
     */
    public String getStatus() {
        return status;
    }

    /**
     * Gets the title of the book.
     * @return The title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * @return The author.
     */
    public String getAuthor() {
        return author;
    }
}
