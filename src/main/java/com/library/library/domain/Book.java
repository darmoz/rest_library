package com.library.library.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity(name = "BOOK")
public class Book {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "BOOKID", unique = true)
    private Long bookId;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "PUBLICATION_YEAR")
    private int publicationYear;

    public Book() {
    }

    public Book(String title, String author, int publicationYear) {
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }
}
