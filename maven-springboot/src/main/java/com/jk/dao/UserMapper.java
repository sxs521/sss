package com.jk.dao;

import com.jk.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 邵先胜 on 2017/11/15.
 */
@Mapper
public interface UserMapper {
    @Select("select * from sxs_user")
   public  List<User> queryUser();
}
