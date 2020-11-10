import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    
    private ArrayList<HashMap> books;
    private int capacity;
    
    public Library(int capacity) {
        this.books = new ArrayList<HashMap>();
        this.capacity = capacity;
    }

    public void addBookToLibrary(HashMap newBook) {
        this.books.add(newBook);
    }

    public HashMap createBook(String title,String author,String genre) {
        HashMap newBook = new HashMap<String,String>();
        newBook.put("title",title);
        newBook.put("author",author);
        newBook.put("genre",genre);
        return newBook;
    }

    public void addBook(String title,String author,String genre) {
        HashMap newBook = this.createBook(title,author,genre);
        if(this.capacity > this.getBooks()) {
            this.addBookToLibrary(newBook);
        }
    }

    public int getBooks() {
        return this.books.size();
    }

    public void LoanBook(Borrower borrower) {
        HashMap book = this.removeBook();
        borrower.addBook(book);
    }

    public HashMap removeBook() {
        return this.books.remove(0);
    }
    
}
