package com.example.librarymanager.service;

import com.example.librarymanager.entity.Book;
import com.example.librarymanager.entity.BorrowBook;

import java.util.List;

public interface BorrowService {



    List BorrowBooks();

    int saveBorrowBooks(BorrowBook borrowBook);


}
