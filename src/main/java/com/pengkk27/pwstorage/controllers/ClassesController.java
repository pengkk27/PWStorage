package com.pengkk27.pwstorage.controllers;

import com.pengkk27.pwstorage.entity.Account;
import com.pengkk27.pwstorage.services.AccountService;
import com.pengkk27.pwstorage.services.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    private ClassesService classesService;

    @Autowired
    private AccountService accountService;

    @RequestMapping("/toAdd")
    public String toAddClasses() {
        return "/admin/addclass";
    }

    @RequestMapping("/add")
    public String addClasses(@RequestParam("className") String className) {
        classesService.addClass(className);
        return "redirect:/login/home";
    }

    @RequestMapping("/delete/{classId}")
    public String deleteClasses(@PathVariable("classId") int classId) {
        classesService.deleteClass(classId);
        return "redirect:/login/home";
    }

    @RequestMapping("/toAccounts/{classId}")
    public String toAccounts(@PathVariable("classId") String classId, Model model) {
        List<Account> accounts = accountService.getAllAccountByClassesId(classId);
        model.addAttribute("accounts", accounts);
        return "/admin/classes";
    }

}
