package com.example.librarymanager.service;

import com.example.librarymanager.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    List<Book> selectAllBooks();

    int save(Book book);

    List<Book> selectBookByName(@Param("bName") String name);

    int updateBook(Book book);

    Book  findBookByName(String name);
}
