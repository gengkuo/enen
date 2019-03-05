package com.example.librarymanager.service;


import com.example.librarymanager.entity.Book;
import com.example.librarymanager.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    int signIn(Users user);
    List<Users> getAllUser();

    Users selectUsersByName(String name);
}
