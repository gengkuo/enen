package com.example.librarymanager.repository;


import com.example.librarymanager.entity.Book;
import com.example.librarymanager.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    int saveUser(Users users);

    List<Users> selectAllUsers();

    Users  selectUserByName(@Param("userName") String name);
}
