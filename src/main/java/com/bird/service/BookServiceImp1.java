package com.bird.service;

import com.bird.dao.BookDao;
import com.bird.dao.BookDaoImp1;

/**
 * @title:BookServiceImp1
 * @Author GKY
 * @Date:2023/4/2717:52
 */
public class BookServiceImp1 implements BookService {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
