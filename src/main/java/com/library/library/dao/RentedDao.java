package com.library.library.dao;

import com.library.library.domain.Rented;
import org.springframework.data.repository.CrudRepository;

public interface RentedDao extends CrudRepository<Rented, Integer> {
    @Override
    Rented save(Rented rented);
}
