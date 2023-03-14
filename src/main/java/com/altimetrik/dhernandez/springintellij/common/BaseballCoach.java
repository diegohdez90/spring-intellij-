package com.altimetrik.dhernandez.springintellij.common;

import com.altimetrik.dhernandez.springintellij.controllers.PupilController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class BaseballCoach implements Coach {
    private static final Logger log = LoggerFactory.getLogger(BaseballCoach.class);
    private String emailAddress;
    private String team;

    public BaseballCoach() {
        log.info(getClass().getName() + "::Constructor baseballCoach");
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
        return "Spend 30 minutes on batting practice";
    }
}
