package com.example.librarymanager;

import com.example.librarymanager.entity.Book;
import com.example.librarymanager.entity.Gender;
import com.example.librarymanager.entity.Users;
import com.example.librarymanager.repository.UserMapper;
import com.example.librarymanager.service.BookService;
import com.example.librarymanager.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibrarymanagerApplicationTests {

    @Autowired

    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BookService bookService;

    Users users = new Users("xujie",18,
            Gender.FEMALE,"45","902514","140225");

    Book book =
            new Book("java", "gengkuo","jishu", 5,1,LocalDate.now(),"NB");
    @Test
    public void contextLoads() {
     //  userService.signIn(users);
    //  userService.getAllUser();
       // bookService.save(book);
      // System.out.println();bookService.selectBookByName("j");
     System.out.println(userMapper.selectUserByName("hh").toString());

    }
}
