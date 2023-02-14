package com.altimetrik.dhernandez.springintellij.controllers;

import com.altimetrik.dhernandez.springintellij.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/form")
    public String form(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @RequestMapping("/submit")
    public String submit(@ModelAttribute("student") Student student) {
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return "student-confirmation";
    }
}
