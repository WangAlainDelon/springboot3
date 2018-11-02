package com.wx.springboot3.controller;

import com.wx.springboot3.pojo.User;
import com.wx.springboot3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    /*
      springboot 整合mybatis
     */
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/adduser")
    public int addUser(@RequestParam String name,@RequestParam Integer age,@RequestParam String addr)
    {
        int add = userService.add(name, age, addr);
        return add;
    }
    @RequestMapping(value = "/finduser")
    public User fingUser(@RequestParam Integer id)
    {
        return userService.findUser(id);
    }
    @RequestMapping(value = "findAll")
    public List<User> findAll()
    {
        return userService.findAccountList();
    }


}
