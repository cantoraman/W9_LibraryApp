package db;

import models.Book;
import models.Borrower;
import org.hibernate.Session;

public class DBBook {

    private static Session session;

    public static void addBookToBorrower(Book book, Borrower borrower){
        borrower.addBook(book);
        DBHelper.update(borrower);
    }

}
