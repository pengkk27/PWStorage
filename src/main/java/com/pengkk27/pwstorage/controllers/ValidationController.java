package com.pengkk27.pwstorage.controllers;

import com.pengkk27.pwstorage.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/val")
public class ValidationController {

    @Autowired
    private ValidationService validationService;

    @RequestMapping("/toAdd")
    public String addVal() {
        return "/admin/validation";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        validationService.addValidation(question, answer);
        return "redirect:/login/home";
    }
}
