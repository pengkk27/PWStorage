package com.pengkk27.pwstorage.controllers;

import com.pengkk27.pwstorage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/login")
@SessionAttributes({"userId","userName"})
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public String userLogin(String username, String password, Model model) {
        if (userService.loginValidate(username, password)) {
            List<String> userinfo = userService.getUserIdAndUserNameByUserName(username);
            model.addAttribute("userId", userinfo.get(0));
            model.addAttribute("userName", userinfo.get(1));
            return "/user/home";
        }
        model.addAttribute("msg", "用户名或密码错误！");
        return "/user/login";
    }
}
