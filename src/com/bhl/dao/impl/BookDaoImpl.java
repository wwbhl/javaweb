package com.bhl.dao.impl;

import com.bhl.models.Book;
import com.bhl.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl {
    public List<Book> findAllBooks() throws SQLException{
        //1.创建 queryrunner
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        return  qr.query("select * from books",new BeanListHandler<Book>(Book.class));
    }
}
