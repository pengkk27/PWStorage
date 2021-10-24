package com.pengkk27.pwstorage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/startUse")
    public String startUse() {
        return "/user/login";
    }
}
