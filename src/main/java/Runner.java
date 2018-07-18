import db.DBBook;
import db.DBHelper;
import models.Book;
import models.Borrower;
import models.GenreType;

public class Runner {

    public static void main(String[] args) {




        // BOOKS
        Book book1 = new Book("Moby Dick", "Herman Melville", 585, GenreType.ADVENTURE);
        DBHelper.save(book1);
        Book book2 = new Book("LOTR", "JRR Tolkien", 1005, GenreType.FANTASY);
        DBHelper.save(book2);
        Book book3 = new Book("Harry Potter", "JK Rowling", 1402, GenreType.SCIFI);
        DBHelper.save(book3);


        // BORROWERS
        Borrower borrower1 = new Borrower("Benjamin");
        DBHelper.save(borrower1);
        Borrower borrower2 = new Borrower("Cango");
        DBHelper.save(borrower2);


        DBBook.addBookToBorrower(book1, borrower1);

        System.exit(0);
    }
}
