package com.altimetrik.dhernandez.springintellij.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/submit")
    public String getSurveyData(HttpServletRequest request, Model model) {
        String fullName = request.getParameter("fullName");
        String welcomeMessage = "Welcome to your API dashboard " + fullName;
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "welcome";
    }
}
