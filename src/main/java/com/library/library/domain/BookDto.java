package com.library.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookDto {
        private Long bookId;
        private String title;
        private String author;
        private int publicationYear;

}
