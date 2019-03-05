package com.example.librarymanager.service.impl;


import com.example.librarymanager.entity.Book;
import com.example.librarymanager.entity.BorrowBook;
import com.example.librarymanager.repository.BorrowMapper;
import com.example.librarymanager.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private BorrowMapper borrowMapper;



    @Override
    public List BorrowBooks() {
        return borrowMapper.listBorrowBooks();
    }

    @Override
    public int saveBorrowBooks(BorrowBook borrowBook) {
        return borrowMapper.saveBorrowBooks(borrowBook);
    }
}
