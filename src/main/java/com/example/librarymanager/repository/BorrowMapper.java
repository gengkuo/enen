package com.example.librarymanager.repository;

import com.example.librarymanager.entity.Book;
import com.example.librarymanager.entity.BorrowBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BorrowMapper {



    List  listBorrowBooks();

    int saveBorrowBooks(BorrowBook borrowBook);
}
