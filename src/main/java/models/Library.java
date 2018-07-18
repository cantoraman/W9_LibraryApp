package models;

import java.util.ArrayList;

public class Library {

    String name;
    ArrayList<Book> books;
    ArrayList<Borrower> borrowers;

    public Library(String name){
        this.name = name;
    }
}
