import java.util.ArrayList;
import java.util.HashMap;

public class Borrower {

    private String name;
    private ArrayList<HashMap> books;

    public Borrower(String name) {
        this.name = name;
        this.books = new ArrayList<HashMap>();
    }

    public int getBooks() {
        return this.books.size();
    }
    
    public void addBook(HashMap book) {
        this.books.add(book);
    }
}
