package com.jk.controller;

import com.jk.dao.UserMapper;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 邵先胜 on 2017/11/16.
 */
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Resource
    UserService userService;
    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }
    @RequestMapping("/list")
    public String list(Model model) {
        List<User> users=userService.queryUserList();
        model.addAttribute("users", users);
        return "user/list";
    }
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "user/userAdd";
    }
    @RequestMapping("/add")
    public String add(User user) {
        userService.save(user);
        return "redirect:/list";
    }
    @RequestMapping("/delete")
    public String delete(Long id) {
        userService.delete(id);
        return "redirect:/list";
    }
    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        User user=userService.findUserById(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }
    @RequestMapping("/edit")
    public String edit(User user) {
        userService.edit(user);
        return "redirect:/list";
    }

}
