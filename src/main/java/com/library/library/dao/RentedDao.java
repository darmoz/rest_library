package com.library.library.dao;

import com.library.library.domain.Book;
import com.library.library.domain.Rented;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RentedDao extends CrudRepository<Rented, Long> {
    @Override
    Rented save(Rented rented);

    @Override
    Optional<Rented> findById(Long id);

    @Override
    void delete(Rented rented);
}
