package com.library.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "COPIES")
public class BookCopies {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COPY_ID", unique = true)
    private int copyId;
    @Column(name = "BOOK_ID")
    private Long bookId;
    @Column(name = "STATUS")
    private String status;
}
