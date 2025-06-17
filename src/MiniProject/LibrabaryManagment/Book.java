package MiniProject.LibrabaryManagment;

public class Book {

    private final String title;
    private final String author;
    private String status;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = "available";
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void markAsBorrowed() {
        status = "borrowed";
    }

    public void markAsAvailable() {
        status = "available";
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
