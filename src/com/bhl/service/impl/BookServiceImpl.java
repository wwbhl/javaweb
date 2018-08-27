package com.bhl.service.impl;

import com.bhl.dao.impl.BookDaoImpl;
import com.bhl.models.Book;

import java.sql.SQLException;
import java.util.List;

public class BookServiceImpl {
    public List<Book> findAllBooks(){
        BookDaoImpl bookDao = new BookDaoImpl();

        try {
            return bookDao.findAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
