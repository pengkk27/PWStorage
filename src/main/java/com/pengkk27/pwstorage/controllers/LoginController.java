package com.pengkk27.pwstorage.controllers;

import com.pengkk27.pwstorage.entity.Classes;
import com.pengkk27.pwstorage.entity.UserInformation;
import com.pengkk27.pwstorage.services.ClassesService;
import com.pengkk27.pwstorage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private ClassesService classesService;

    @PostMapping("/log")
    public String login(@RequestParam("username") String name, @RequestParam("password") String password, HttpSession session) {
        UserInformation userIdPassword = userService.getUserIdPassword();
        if (name.equals(userIdPassword.getUserName()) && password.equals(userIdPassword.getUserPassword())) {
            return "redirect:/login/home";
        }
        return "/admin/login";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        List<Classes> classes = classesService.getClasses();
        model.addAttribute("class", classes);
        return "/admin/home";
    }

}
