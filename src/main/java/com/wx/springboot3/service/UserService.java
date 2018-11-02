package com.wx.springboot3.service;

import com.wx.springboot3.dao.UserMapper;
import com.wx.springboot3.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int add(String name, Integer age,String addr) {
        return userMapper.add(name, age,addr);
    }
    public int update(String name, Integer age,String addr, int id) {
        return userMapper.update(name, age,addr,id);
    }
    public int delete(int id) {
        return userMapper.delete(id);
    }
    public User findUser(int id) {
        return userMapper.findAccount(id);
    }
    public List<User> findAccountList() {
        return userMapper.findAccountList();
    }
}
