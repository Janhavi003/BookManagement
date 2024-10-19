// Abstract Class: Book
abstract class Book {
    // Private fields for encapsulation
    private String title;
    private String author;
    private int yearPublished;

    // Constructor for the abstract class
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();

    //using Getters and Setters for encapsulation
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

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}

// FictionBook subclass that extends Book
class FictionBook extends Book {
    private String genre;

    // Constructor
    public FictionBook(String title, String author, int yearPublished, String genre) {
        super(title, author, yearPublished);  // Call to parent class constructor
        this.genre = genre;
    }

    // Implementing the abstract method from Book class
    @Override
    public void displayDetails() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() +
                           " (" + getYearPublished() + ") Genre: " + genre);
    }

    // Getters and Setters for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

// NonFictionBook subclass that extends Book
class NonFictionBook extends Book {
    private String subject;

    // Constructor
    public NonFictionBook(String title, String author, int yearPublished, String subject) {
        super(title, author, yearPublished);  // Call to parent class constructor
        this.subject = subject;
    }

    // Implementing the abstract method from Book class
    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book: " + getTitle() + " by " + getAuthor() +
                           " (" + getYearPublished() + ") Subject: " + subject);
    }

    // using Getters and Setters for subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        //instances of FictionBook and NonFictionBook
        FictionBook fictionBook = new FictionBook("1984", "George Orwell", 1949, "Dystopian");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", 2011, "History");

        // Displaying details using the method from the abstract class
        fictionBook.displayDetails();
        nonFictionBook.displayDetails();

        // Using encapsulation: updating and accessing private data
        fictionBook.setTitle("Brave New World");
        System.out.println("Updated Fiction Book Title: " + fictionBook.getTitle());

        // Displaying details again after updating
        fictionBook.displayDetails();
    }
}
