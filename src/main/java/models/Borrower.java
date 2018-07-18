package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "borrowers")
public class Borrower {

    int id;
    String name;
    List<Book> books;

    public Borrower(String name){
        this.name = name;
        books = new ArrayList<Book>();
    }

    public Borrower(){}



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "name")
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @OneToMany(mappedBy = "borrower", fetch = FetchType.LAZY)
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
