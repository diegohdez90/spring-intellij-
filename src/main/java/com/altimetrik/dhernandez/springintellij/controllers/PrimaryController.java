package com.altimetrik.dhernandez.springintellij.controllers;

import com.altimetrik.dhernandez.springintellij.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/primary")
public class PrimaryController {

    public Coach coach;

    @Autowired
    public PrimaryController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/")
    public @ResponseBody String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
