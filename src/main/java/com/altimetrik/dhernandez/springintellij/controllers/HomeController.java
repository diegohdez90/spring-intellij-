package com.altimetrik.dhernandez.springintellij.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
public class HomeController {

    @RequestMapping("/home")
     public String home(Model model) {
         return "home";
     }

}
