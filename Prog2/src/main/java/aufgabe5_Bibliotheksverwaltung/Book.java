package aufgabe5_Bibliotheksverwaltung;

public class Book {

    private String title;
    private int copies;

    public Book(String title, int copies) {
        this.title = title;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() { //ausgeben
        return copies;
    }

    public void setCopies(int copies) { //ändern von value
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", copies=" + copies +
                '}';
    }

}
