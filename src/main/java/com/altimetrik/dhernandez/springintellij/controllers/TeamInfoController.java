package com.altimetrik.dhernandez.springintellij.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamInfoController {


    /**
     * Inject custom properties
     */
    @Value("${team.name}")
    private String teamName;

    @Value("${team.coach}")
    private String coachName;

    @GetMapping("/teamInfo")
    public String teamInfo() {
        return "Coach: " +  coachName + "\nTeam: " + teamName;
    }
}
