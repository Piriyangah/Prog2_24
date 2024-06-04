package aufgabe5_Bibliotheksverwaltung;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super("Book with this ISBN was not found!");
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}
