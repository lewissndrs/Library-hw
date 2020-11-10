import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Borrower ted;

    @Before
    public void before() {
        library = new Library(2);
        ted = new Borrower("Ted");
    }

    @Test
    public void hasEmptyBooks() {
        assertEquals(0,library.getBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook("The Bus That Couldn't Slow Down","Keanu Reeves","Action");
        assertEquals(1,library.getBooks());
    }

    @Test
    public void cantAddBooksBeyondCapacity() {
        library.addBook("The Bus That Couldn't Slow Down","Keanu Reeves","Action");
        library.addBook("Lord of the Onion Rings","Chip Fry","Fantasy/Food");
        library.addBook("Salt Fat Acid Heat","Samin Nosrat","Cooking");
        assertEquals(2,library.getBooks());
    }

    @Test
    public void canLoanOutBook() {
        library.addBook("Salt Fat Acid Heat","Samin Nosrat","Cooking");
        library.LoanBook(ted);
        assertEquals(0,library.getBooks());
    }

    @Test
    public void canLoanOutBook2() {
        library.addBook("Salt Fat Acid Heat","Samin Nosrat","Cooking");
        library.LoanBook(ted);
        assertEquals(1,ted.getBooks());
    }
    
}
