package com.library.library.Dao;

import com.library.library.dao.CopyDao;
import com.library.library.domain.BookCopies;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookCopiesDaoTestSuite {
    @Autowired
    private CopyDao copyDao;

    @Test
    public void testSaveBookCopiesDao() {
        //given
        BookCopies copies = new BookCopies("rented");
        //when
        copyDao.save(copies);
        //then
        long id = copies.getCopyId();
        Optional<BookCopies> retrievedCopy = copyDao.getBookCopiesByCopyId(id);
        Assert.assertEquals(copies.getStatus(), retrievedCopy.get().getStatus());
        //clean up
        copyDao.delete(copies);
    }


    @Test
    public void testCountBookCopiesDao() {
        //given
        long bookId = 2L;
        BookCopies copy1 = new BookCopies("rented");
        copy1.setBookId(bookId);
        BookCopies copy2 = new BookCopies("available");
        copy2.setBookId(bookId);
        //when
        copyDao.save(copy1);
        copyDao.save(copy2);
        //then

        long copiesCount = copyDao.countByBookId(bookId);
        Assert.assertEquals(2L, copiesCount);
        //clean up
        copyDao.delete(copy1);
        copyDao.delete(copy2);
    }
}
