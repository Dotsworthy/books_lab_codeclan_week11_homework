import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> book;

    public Borrower(String name) {
        this.name = name;
        this.book = new ArrayList<Book>();
    }

    public int getBookCount() {
        return this.book.size();
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.book.add(book);
    }
}
