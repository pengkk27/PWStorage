package com.pengkk27.pwstorage.controllers;

import com.pengkk27.pwstorage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toRegistered")
    public String toRegistered() {
        return "/user/registered";
    }

    @RequestMapping("/registered")
    public String registered(String username, String password, Model model) {

        List<String> user = userService.getUserIdAndUserNameByUserName(username);
        if (user.size() != 0) {
            model.addAttribute("msg", "您已注册，请直接登陆");
            return "user/registered";
        }
        userService.registered(username, password);
        return "user/registeredsuccess";
    }
}
