package com.altimetrik.dhernandez.springintellij.controllers;

import com.altimetrik.dhernandez.springintellij.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {
    private Coach coach;

    @Autowired
    public DemoController(@Qualifier("soccerCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyWorkout")
    public @ResponseBody String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
