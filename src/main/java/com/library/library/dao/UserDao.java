package com.library.library.dao;

import com.library.library.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {

    @Override
    User save(User user);

    @Override
    void delete(User user);
}
