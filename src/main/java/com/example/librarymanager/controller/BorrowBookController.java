package com.example.librarymanager.controller;

import com.example.librarymanager.entity.Book;
import com.example.librarymanager.entity.BorrowBook;
import com.example.librarymanager.entity.Users;
import com.example.librarymanager.service.BookService;
import com.example.librarymanager.service.BorrowService;
import com.example.librarymanager.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
public class BorrowBookController {

    @Autowired
    private BookService bookService;



}
