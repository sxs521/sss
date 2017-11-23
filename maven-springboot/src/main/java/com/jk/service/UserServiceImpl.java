package com.jk.service;

import com.jk.dao.UserMapper;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 邵先胜 on 2017/11/15.
 */
@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUser(User user) {
        return userMapper.queryUser();
    }
}
