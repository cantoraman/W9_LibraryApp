import models.Book;
import models.GenreType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp(){
        book = new Book("Moby Dick", "Herman Melville", 585, GenreType.ADVENTURE);
    }


    @Test
    public void getTitle(){
        assertEquals("Moby Dick", book.getTitle());
    }

    @Test
    public void setTitle(){
        book.setTitle("New Title");
        assertEquals("New Title", book.getTitle());
    }
}
