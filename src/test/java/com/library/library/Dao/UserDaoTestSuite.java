package com.library.library.Dao;

import com.library.library.dao.UserDao;
import com.library.library.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTestSuite {
    @Autowired
    private UserDao userDao;

    @Test
    public void testUserDaoSave() {
        //given
        User user = new User("Dariusz", "Mozgowoj", new Date());
        //when
        userDao.save(user);
        //then
        long id = user.getId();
        Optional<User> getUser = userDao.findById(id);
        Assert.assertNotNull(getUser);
        Assert.assertEquals(user.getFirstName(),getUser.get().getFirstName());
        //clean up
        userDao.delete(user);
    }
}
