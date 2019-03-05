package com.example.librarymanager.service.impl;

import com.example.librarymanager.entity.Book;
import com.example.librarymanager.repository.BookMapper;
import com.example.librarymanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectAllBooks() {

        return bookMapper.selectAllBooks();
    }

    @Override
    public int save(Book book) {
        return bookMapper.saveBook(book);
    }

    @Override
    public List<Book> selectBookByName(String name) {
        return bookMapper.selectBooksByName(name);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book findBookByName(String name) {
        return bookMapper.findBookByName(name);
    }


}
