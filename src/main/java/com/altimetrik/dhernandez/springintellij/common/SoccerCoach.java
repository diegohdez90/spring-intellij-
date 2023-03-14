package com.altimetrik.dhernandez.springintellij.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
    private static final Logger log = LoggerFactory.getLogger(SoccerCoach.class);
    private String emailAddress;
    private String team;

    public SoccerCoach() {
        log.info(getClass().getName() + "::Constructor soccerCoach");
    }

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
        return "Spend 30 minutes on shooting the ball outside the area";
    }
}
