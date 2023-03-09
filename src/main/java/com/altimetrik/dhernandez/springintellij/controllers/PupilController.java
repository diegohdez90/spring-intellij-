package com.altimetrik.dhernandez.springintellij.controllers;

import com.altimetrik.dhernandez.springintellij.SpringIntellijApplication;
import com.altimetrik.dhernandez.springintellij.models.Pupil;
import com.altimetrik.dhernandez.springintellij.services.PupilService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/v1")
public class PupilController {

    private static final Logger log = LoggerFactory.getLogger(SpringIntellijApplication.class);

    @Autowired
    private PupilService service;

    @GetMapping(path = "")
    public @ResponseBody String index() {
        return "Welcome to pupil application. Now with POST method";
    }

    @PostMapping(path = "/save")
    public @ResponseBody String form(@RequestBody Pupil pupil) {
        log.debug("Retrieve pupil data from body");
        log.info(pupil.getFirstName());
        log.info(pupil.getLastName());
        log.info(pupil.getEmail());
        service.save(pupil);
        return pupil.toString();
    }

    @GetMapping(path = "/list")
    public @ResponseBody Iterable<Pupil> getAll() {
        return service.getAll();
    }
}
