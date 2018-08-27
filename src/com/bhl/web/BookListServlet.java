package com.bhl.web;

import com.bhl.models.Book;
import com.bhl.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookListServlet",urlPatterns = "/BookListServlet")

public class BookListServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookServiceImpl bookService = new BookServiceImpl();
        List<Book> books = bookService.findAllBooks();
        request.setAttribute("books",books);
        request.getRequestDispatcher("/admin/products/list.jsp").forward(request,response);
    }
}
