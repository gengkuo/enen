package com.example.librarymanager.service.impl;

import com.example.librarymanager.entity.Book;
import com.example.librarymanager.entity.Users;
import com.example.librarymanager.repository.UserMapper;
import com.example.librarymanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public int signIn(Users user) {
        return userMapper.saveUser(user);
    }

    @Override
    public List<Users> getAllUser() {
        return userMapper.selectAllUsers();
    }

    @Override
    public Users selectUsersByName(String name) {
        return userMapper.selectUserByName(name);
    }


}
