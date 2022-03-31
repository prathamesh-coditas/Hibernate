package com.bean;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "Libraty")
public class Library {
    @Id
    @Column(name="Book_Id")
    private int id;
    @Column(name="Book_Name")
    private String  name;
    private Set<Book> books;

    public Library(int id, String name, Set<Book> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public Library() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
