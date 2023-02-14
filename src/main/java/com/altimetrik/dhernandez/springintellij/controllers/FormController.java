package com.altimetrik.dhernandez.springintellij.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class FormController {

    @RequestMapping("/survey")
    public String survey() {
        return "survey";
    }

    @RequestMapping("/submit")
    public String getSurveyData(@RequestParam(defaultValue="John Doe") String fullName, Model model) {
        model.addAttribute("fullName", fullName);
        return "welcome";
    }
}
