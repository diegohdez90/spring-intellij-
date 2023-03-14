package com.altimetrik.dhernandez.springintellij.common;

import org.springframework.stereotype.Component;

@Component
public class FootballlCoach implements Coach{
    private String emailAddress;
    private String team;

    public FootballlCoach() {}

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on throwing the ball";
    }
}