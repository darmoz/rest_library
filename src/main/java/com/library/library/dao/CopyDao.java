package com.library.library.dao;

import com.library.library.domain.BookCopies;
import org.springframework.data.repository.CrudRepository;

public interface CopyDao extends CrudRepository<BookCopies, Integer> {

    @Override
    BookCopies save(BookCopies bookCopies);

    @Override
    long count();
}
