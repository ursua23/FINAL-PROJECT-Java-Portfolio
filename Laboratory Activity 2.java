public class MyBookList {
    public static void main(String[] args) {

        // 1.) Create books
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Java Programming", "John Doe", 2020);
        Book favoriteBook = new Book("The Alchemist", "Paulo Coelho", 1988);

        // 2.) Display details of each book
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        favoriteBook.displayDetails();

        System.out.println();

        // 3.) Change pages and display again
        book1.changePage(50);
        book3.changePage(100);

        book1.displayDetails();
        book3.displayDetails();

        System.out.println();

        // 4.) Change page of favorite book
        favoriteBook.changePage(75);
        favoriteBook.displayDetails();

        System.out.println();

        // 5.) Change author of Java Programming
        book4.setAuthor("Jane Smith");
        book4.displayDetails();

        System.out.println();

        // 6.) Store books in an array and display titles published after 2010
        Book[] books = { book1, book2, book3, book4, favoriteBook };

        System.out.println("Books published after 2010:");
        for (Book book : books) {
            if (book.getYearPublished() > 2010) {
                System.out.println(book.getTitle());
            }
        }
    }
}

// Book class (non-public)
class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int currentPage;

    // Constructor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = 0;
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title +
                ", Author: " + author +
                ", Year: " + yearPublished +
                ", Current Page: " + currentPage);
    }

    // Change current page
    public void changePage(int page) {
        this.currentPage = page;
    }

    // Change author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getters
    public int getYearPublished() {
        return yearPublished;
    }

    public String getTitle() {
        return title;
    }
}
