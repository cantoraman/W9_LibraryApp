package models;


import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    int id;
    String title;
    String author;
    int pages;
    GenreType genre;
    Borrower borrower;

    public Book(String title, String author, int pages, GenreType genre){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public Book(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "title")
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "author")
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "pages")
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Enumerated(value = EnumType.STRING)
    public GenreType getGenre() {
        return genre;
    }
    public void setGenre(GenreType genre) {
        this.genre = genre;
    }

    @ManyToOne
    @JoinColumn(name = "borrower_id", nullable = true)
    public Borrower getBorrower() {
        return borrower;
    }
    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }


}
