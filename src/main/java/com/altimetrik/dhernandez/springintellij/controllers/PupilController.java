package com.altimetrik.dhernandez.springintellij.controllers;

import com.altimetrik.dhernandez.springintellij.models.Pupil;
import com.altimetrik.dhernandez.springintellij.repositories.PupilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/v1")
public class PupilController {

    @Autowired
    private PupilRepository repository;

    @GetMapping(path = "")
    public @ResponseBody String index() {
        return "Welcome to pupil application";
    }

//    @PostMapping(path = "/save")
//    public @ResponseBody String form(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {
//        Pupil pupil = new Pupil();
//        pupil.setFirstName(firstName);
//        pupil.setLastName(lastName);
//        pupil.setEmail(email);
//        repository.save(pupil);
//        return "Student saved";
//    }
//
    @GetMapping(path = "/list")
    public @ResponseBody Iterable<Pupil> getAll() {
        return repository.findAll();
    }
}
