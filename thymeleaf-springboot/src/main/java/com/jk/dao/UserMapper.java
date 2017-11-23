package com.jk.dao;

import com.jk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 邵先胜 on 2017/11/16.
 */
public interface UserMapper extends JpaRepository<User,Long> {
   public  User findById(Long id);
}
