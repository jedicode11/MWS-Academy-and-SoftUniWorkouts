package course.academy.model;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
    public static final int MAX_BOOKS = 10;
    private static int nextId = 0;

    private int id = ++nextId;
    private String title;
    private String author;
    private LocalDate publishingDate;
    private String publisher;
    private double price;
    private String description;

    // Overloaded constructors
    // No args constructor
    public Book() {
    }

    public Book(int id) {
        this.id = id;
    }

    public Book(String title, String author, LocalDate publishingDate, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.publishingDate = publishingDate;
        this.publisher = publisher;
        this.price = price;
    }

    public Book(String title, String author, LocalDate publishingDate, String publisher, double price, String description) {
        this(title, author, publishingDate, publisher, price);
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(LocalDate publishingDate) {
        this.publishingDate = publishingDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        if (description == null) {
            description = "id=" + id +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", publishingDate=" + publishingDate +
                    ", publisher='" + publisher + '\'' +
                    ", price=" + price;
        }
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingDate=" + publishingDate +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", description='" + getDescription() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return getId() == book.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(getId(), other.getId());
    }
}
