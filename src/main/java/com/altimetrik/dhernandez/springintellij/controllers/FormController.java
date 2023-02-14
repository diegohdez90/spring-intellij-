package com.altimetrik.dhernandez.springintellij.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class FormController {

    @RequestMapping("/survey")
    public String survey() {
        return "survey";
    }

    @RequestMapping("/submit")
    public String getSurveyData(HttpServletRequest request, Model model) {
        String fullName = request.getParameter("fullName");
        String welcomeMessage = "Welcome to your dashboard " + fullName;
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "welcome";
    }
}
