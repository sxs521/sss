package com.jk.service;

import com.jk.dao.TreeMapper;
import com.jk.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 邵先胜 on 2017/11/16.
 */
@Service
public class TreeServiceImpl implements TreeService {
    @Autowired
    private TreeMapper treeMapper;
    @Override
    public List<Tree> queryTree(Tree tree) {
        return treeMapper.queryTree();
    }
}
