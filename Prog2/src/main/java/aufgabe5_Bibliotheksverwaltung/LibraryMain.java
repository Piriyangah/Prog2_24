package aufgabe5_Bibliotheksverwaltung;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("1234", "Java Programming", 3);
        library.addBook("5678", "Data Structures", 2);
        library.addBook("1213", "Datenbanken", 5);
        System.out.println("-----Inhalt anzeigen-----");
        library.printAllBooks();
        System.out.println();

        System.out.println("-----Borrowing book with ISBN 1234-----");
        library.borrowBook("1234");
        library.printAllBooks();
        System.out.println();

        System.out.println("-----Details of Book with ISBN 1234-----");
        library.printBookDetails("1234");
        System.out.println();

        System.out.println("-----Update of Book with ISBN 1234-----");
        library.update("1234", 5);
        library.printAllBooks();
        System.out.println();

        System.out.println("-----Returning book with ISBN 1234-----");
        library.returnBook("1234");
        library.printAllBooks();
        System.out.println();

        System.out.println("-----Borrowing book with ISBN 5678 3 times, more then available-----");
        library.borrowBook("5678");
        library.borrowBook("5678");
        library.borrowBook("5678");     // es gibt nur 2 -> also kommt Exception
        library.printAllBooks();
        System.out.println();

        System.out.println("-----Trying to borrow book with non existing ISBN 9999-----"); // ISBN gibt nicht
        library.borrowBook("9999");     // es existiert kein Objekt mit IBSN 9999 -> also kommt Exception
        library.printAllBooks();
        System.out.println();

        System.out.println("-----Returning book with ISBN 5678-----");
        library.returnBook("5678");
        library.printAllBooks();
    }
}
