package models;

public class Book {


    String title;
    String author;
    int pages;
    GenreType genre;

    public Book(String title, String author, int pages, GenreType genre){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
