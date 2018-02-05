package com.library.library.dao;

import com.library.library.domain.Book;
import com.library.library.domain.BookCopies;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CopyDao extends CrudRepository<BookCopies, Long> {

    @Override
    BookCopies save(BookCopies bookCopies);

    Optional<BookCopies> getBookCopiesByCopyId(Long id);

    long countByBookId(Long id);

    @Override
    void delete(BookCopies bookCopies);
}