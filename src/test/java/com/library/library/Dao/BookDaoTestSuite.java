package com.library.library.Dao;

import com.library.library.dao.BookDao;
import com.library.library.domain.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookDaoTestSuite {
    @Autowired
    private BookDao bookDao;

    @Test
    public void testBookDao() {
        //given
        Book book = new Book("title", "myself", 1990);
        //when
        bookDao.save(book);
        //then
        long id = book.getBookId();
        Optional<Book> retrievedBook = bookDao.findById(id);
        Assert.assertEquals(retrievedBook.get().getBookId().longValue(), id);
        //clean up
        bookDao.delete(book);
    }
}
