package com.altimetrik.dhernandez.springintellij.controllers;

import com.altimetrik.dhernandez.springintellij.SpringIntellijApplication;
import com.altimetrik.dhernandez.springintellij.models.Pupil;
import com.altimetrik.dhernandez.springintellij.services.PupilService;
import org.hibernate.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/v1")
public class PupilController {

    private static final Logger log = LoggerFactory.getLogger(PupilController.class);

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

    @GetMapping("/list-formatted")
    public String format(Model model) {
        Iterable<Pupil> students = service.getAll();
        log.info("You have retrieved");
        model.addAttribute("students", students);
        return "student-list";
    }

    @GetMapping("/form")
    public String form(Model model) {
        Pupil pupil = new Pupil();
        model.addAttribute("student", pupil);
        return "pupil-form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute("pupil") Pupil pupil) {
        service.save(pupil);
        return "redirect:/v1/list-formatted";
    }

    @GetMapping("/updateForm/{id}")
    public String updateForm(Model model, @PathVariable Integer id) {
        log.info("You are updating " + id);
        Pupil pupil = service.getById(id).get();
        model.addAttribute("student", pupil);
        return "update-student-form";
    }

    @PostMapping("/update/{id}")
    public String submit(@ModelAttribute("pupil") Pupil pupil, @PathVariable Integer id) {
        Pupil student = service.getById(id).get();
        student.setFirstName(pupil.getFirstName());
        student.setLastName(pupil.getLastName());
        student.setEmail(pupil.getEmail());
        service.save(student);
        return "redirect:/v1/list-formatted";
    }
}
