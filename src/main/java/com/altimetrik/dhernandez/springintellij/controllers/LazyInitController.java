package com.altimetrik.dhernandez.springintellij.controllers;

import com.altimetrik.dhernandez.springintellij.common.Coach;
import com.altimetrik.dhernandez.springintellij.common.FootballlCoach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lazy")
public class LazyInitController {

    private static final Logger log = LoggerFactory.getLogger(LazyInitController.class);
    private Coach coach;

    @Autowired
    public LazyInitController(@Qualifier("basketballCoach") Coach coach) {
        log.info(getClass().getName() + "::Constructor LazyInitController");
        this.coach = coach;
    }

    @GetMapping("/")
    public @ResponseBody String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
