package com.jk.controller;


import com.alibaba.fastjson.JSON;
import com.jk.model.Tree;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by 邵先胜 on 2017/11/15.
 */
@RestController
public class UserController extends BaseController {
    @Autowired
    private UserService userService;
    @RequestMapping("queryUser")
    public void queryUser(HttpServletResponse response,String callback,User user, HttpServletRequest request){
        List<User> userlist = userService.queryUser(user);
        String json = JSON.toJSONStringWithDateFormat(userlist, "yyyy-MM-dd HH:mm:ss");
        //加上返回参数
        json=callback+"("+json+")";
        super.outString(json, response);
    }

}
