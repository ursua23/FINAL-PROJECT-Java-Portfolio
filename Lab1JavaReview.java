import java.util.ArrayList;
import java.util.Scanner;

// Book class to represent each book
class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // default status: available
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public String getStatus() {
        return isAvailable ? "Available" : "Borrowed";
    }

    @Override
    public String toString() {
        return id + " | " + title + " by " + author + " | Status: " + getStatus();
    }
}

// Library class to manage books
class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private int nextId = 1;

    public void addBook(String title, String author) {
        Book book = new Book(nextId++, title, author);
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void updateStatus(int id, boolean available) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setAvailable(available);
                System.out.println("Book status updated!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n--- Library Books ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void generateReport() {
        int availableCount = 0, borrowedCount = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                availableCount++;
            } else {
                borrowedCount++;
            }
        }
        System.out.println("\n--- Library Report ---");
        System.out.println("Total Books: " + books.size());
        System.out.println("Available: " + availableCount);
        System.out.println("Borrowed: " + borrowedCount);
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n--- Library Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book Status");
            System.out.println("3. Show All Books");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    System.out.print("Enter book ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter status (1 = Available, 0 = Borrowed): ");
                    int status = sc.nextInt();
                    library.updateStatus(id, status == 1);
                    break;
                case 3:
                    library.showBooks();
                    break;
                case 4:
                    library.generateReport();
                    break;
                case 5:
                    System.out.println("Exiting system... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
