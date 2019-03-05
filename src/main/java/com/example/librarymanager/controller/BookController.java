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
import java.util.Map;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;
    @Autowired
    private BorrowService borrowService;
    @RequestMapping("/listBooks")
    @ResponseBody
    public String  listBooks(){
        return new Gson().toJson(bookService.selectAllBooks());
        //将对象转为json字符串返回 在前台打印
    }


    @RequestMapping("/books")
    @ResponseBody
    public String findBookByName(@RequestBody Book book){

        return new Gson().toJson(bookService.selectBookByName(book.getbName()));

    }

    @RequestMapping("/saveBook")
    @ResponseBody
    public String saveBook(@RequestBody Book book){
       int  i = bookService.save(book);
        if(i>0){
            return "保存书籍成功！";
        }else {
            return "保存书籍失败！";
        }
    }

    @RequestMapping("/updateBook")
    @ResponseBody
    public String updateBook(@RequestBody Map<String, Object> param){



        Book book = bookService.findBookByName(param.get("bName").toString());
        Users users =  userService.selectUsersByName(param.get("userName").toString());
        System.out.println();

        if(book.getbBorrow() < 5){
            return "借书失败";
        }else {


            bookService.updateBook(book);

            BorrowBook borrowBook = new BorrowBook();
            borrowBook.setbId(book.getbId());
            borrowBook.setUserId(users.getUserId());
            borrowBook.setBorrowDate(LocalDate.now());

            borrowService.saveBorrowBooks(borrowBook);
            return "借书成功！";
        }


    }
}
