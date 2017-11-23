package com.jk.service;

import com.jk.dao.UserMapper;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 邵先胜 on 2017/11/16.
 */
@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.findAll();
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void edit(User user) {
        userMapper.save(user);
    }
}
