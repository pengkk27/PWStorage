package com.pengkk27.pwstorage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("toAdd")
    public String toAdd() {
        return "/admin/addAccount";
    }

    @RequestMapping("/add")
    public String add() {


        return "redirect:/classes/toAccounts/{" + "" + "}";
    }

}
