package models;

import java.util.ArrayList;

public class Borrower {

    int id;
    String name;
    ArrayList<Book> books;

    public Borrower(String name){
        this.name = name;
    }


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
