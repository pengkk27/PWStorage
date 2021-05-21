package com.pengkk27.pwstorage.controllers;

import com.pengkk27.pwstorage.entity.Validation;
import com.pengkk27.pwstorage.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/toValidate/{accountId}/{classId}")
    public String toValidation(@PathVariable("accountId") String accountId, @PathVariable("classId") String classId, Model model) {
        Validation validation = validationService.getValidationId();
        model.addAttribute("validation", validation);
        model.addAttribute("accountId", accountId);
        model.addAttribute("classId", classId);
        return "/admin/validate";
    }

    @RequestMapping("/validate/{accountId}/{classId}")
    public String validate(@PathVariable("accountId") String accountId, @PathVariable("classId") String classId, Validation answer) {
        Validation validationById = validationService.getValidationById(answer.getValidationId());
        System.out.println(validationById.getValidationAnswer() + " " + answer.getValidationAnswer());
        if (validationById.getValidationAnswer().equals(answer.getValidationAnswer())) {
            return "redirect:/account/getAccount/" + accountId;
        }
        return "redirect:/classes/toAccounts/" + classId;
    }
}
