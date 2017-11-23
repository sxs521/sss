package com.jk.service;

import com.jk.model.User;

import java.util.List;

/**
 * Created by 邵先胜 on 2017/11/16.
 */
public interface UserService {
   public  List<User> queryUserList();

   public void save(User user);

   public void delete(Long id);

  public  User findUserById(Long id);

   public void edit(User user);
}
