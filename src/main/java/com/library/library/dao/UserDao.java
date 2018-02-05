package com.library.library.dao;

import com.library.library.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    @Override
    User save(User user);

    @Override
    void delete(User user);

    @Override
    Optional<User> findById(Long id);
}
