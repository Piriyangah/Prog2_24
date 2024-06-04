package aufgabe5_Bibliotheksverwaltung;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(String isbn, String title, int copies) {
        if (this.books.containsKey(isbn)) {
            Book bookExisting = this.books.get(isbn);
            bookExisting.setCopies(bookExisting.getCopies() + copies);
        } else {
            Book book = new Book(title, copies);
            this.books.put(isbn, book);
        }
    }

    public void update(String isbn, int newCopies){
        this.books.get(isbn).setCopies(this.books.get(isbn).getCopies() + newCopies);
        System.out.println("Number of Copies of " + this.books.get(isbn).getTitle() + " are " + this.books.get(isbn).getCopies());
    }

    public void returnBook(String isbn){
        this.books.get(isbn).setCopies(this.books.get(isbn).getCopies() + 1);
        System.out.println("Book " + this.books.get(isbn).getTitle() + " returned. Now there are " + this.books.get(isbn).getCopies());
    }

    public void printBookDetails(String isbn){
        System.out.println(this.books.get(isbn).getTitle() + ": " + this.books.get(isbn).getCopies());
    }
    public void printAllBooks() {
        System.out.println("Books: " + books);
    }

    private Book findBook(String isbn) throws BookNotFoundException {
        if (this.books.containsKey(isbn)) {
            if (this.books.get(isbn).getCopies() > 0) {
                return this.books.get(isbn);
            } else {
                throw new BookNotFoundException("Book already borrowed!");
            }
        } else {
            throw new BookNotFoundException();
        }
    }

    public void borrowBook(String isbn) {
        try {
            Book book = findBook(isbn);
            book.setCopies(book.getCopies() - 1);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
