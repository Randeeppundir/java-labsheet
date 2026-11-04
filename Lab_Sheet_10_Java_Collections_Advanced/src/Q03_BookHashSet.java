import java.util.HashSet;
import java.util.Objects;

class Book {
    private final int id;
    private final String title;
    private final String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }

    // Books with the same ID are considered duplicates.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class Q03_BookHashSet {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book(1, "Java Basics", "James"));
        books.add(new Book(2, "Learning Python", "Guido"));
        boolean added = books.add(new Book(1, "Java Basics - Second Copy", "James"));

        System.out.println("Was duplicate ID added? " + added);
        System.out.println("Books in HashSet:");
        for (Book book : books) {
            book.display();
        }
    }
}
