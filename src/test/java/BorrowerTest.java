import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private HashMap book1;

    @Before
    public void before() {
        borrower = new Borrower("tom");
        book1 = new HashMap<String,String>();
        book1.put("title","How To Eat A Chocolate Elephant");
        book1.put("author","Mark Smith");
        book1.put("genre","Self-help");
    }

    @Test
    public void hasEmptyBooks() {
        assertEquals(0,borrower.getBooks());
    }
    
    @Test
    public void canAddBook() {
        borrower.addBook(book1);
        assertEquals(1,borrower.getBooks());
    }
}
