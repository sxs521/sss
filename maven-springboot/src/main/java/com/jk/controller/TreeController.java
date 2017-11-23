package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.Tree;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by 邵先胜 on 2017/11/16.
 */
@RestController
public class TreeController extends BaseController {
    @Autowired
    private TreeService treeService;

    @RequestMapping("queryTree")
    public void queryTree(Tree tree, HttpServletResponse response, String callback, HttpServletRequest request){
        List<Tree> list = treeService.queryTree(tree);
        String json = JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd HH:mm:ss");
        json = callback+"("+json+")";
        super.outString(json,response);

    }
}
