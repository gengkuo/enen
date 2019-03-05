package com.example.librarymanager.repository;

import com.example.librarymanager.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> selectAllBooks();

    List<Book> selectBooksByName(@Param("bName") String name);

    int saveBook(Book book);
    
    int updateBook(Book book);

    Book findBookByName(String name);
}
