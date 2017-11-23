package com.jk.dao;

import com.jk.model.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 邵先胜 on 2017/11/16.
 */
@Mapper
public interface TreeMapper {
   @Select("select * from sxs_tree")
   public  List<Tree> queryTree();
}
