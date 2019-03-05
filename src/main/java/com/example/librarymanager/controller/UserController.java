package com.example.librarymanager.controller;


import com.example.librarymanager.entity.Users;
import com.example.librarymanager.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private  UserService userService;



    @RequestMapping(value = "/addUser")
    @ResponseBody
    public String  addUser(@RequestBody Users users){
        int i = userService.signIn(users);
        if(i>0){
            return "注册成功";
        }else{
            return "注册失败";
        }
    }


    @RequestMapping(value = "/signIn")
    @ResponseBody
    public String  signIn(@RequestBody Users users){
      Users users1 = userService.selectUsersByName(users.getUserName());

       if(users.getUserName().equals(users1.getUserName()) &&
          users.getUserPwd().equals(users1.getUserPwd())){
            return "登录成功！" +  new Gson().toJson(users1.getUserName());  //如果密码和姓名和数据库相同   登录成功
       }else {
           return "登录失败！用户或密码不正确,请重新登录";
       }


    }











}
