package com.library.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity(name = "COPIES")
public class BookCopies {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COPY_ID", unique = true)
    private long copyId;
    @Column(name = "BOOK_ID")
    private long bookId;
    @Column(name = "STATUS")
    private String status;

    public BookCopies() {
    }

    public BookCopies(String status) {
        this.status=status;
    }
}
