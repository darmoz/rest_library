package com.library.library.Dao;

import com.library.library.dao.RentedDao;
import com.library.library.domain.Rented;
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
public class RentedDaoTestSuite {
    @Autowired
    private RentedDao rentedDao;

    @Test
    public void testSaveRentedDaoTestSuite() {
        //given
        Rented rent = new Rented(new Date());
        //when
        rentedDao.save(rent);
        //then
        long id = rent.getRentId();
        Optional<Rented> retrievedRent = rentedDao.findById(id);
        Assert.assertEquals(rent.getRENT_DATE().getYear(),retrievedRent.get().getRENT_DATE().getYear());
        //clean up
        rentedDao.delete(rent);
    }
}
