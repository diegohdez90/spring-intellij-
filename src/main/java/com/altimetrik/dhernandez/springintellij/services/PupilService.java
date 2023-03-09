package com.altimetrik.dhernandez.springintellij.services;

import com.altimetrik.dhernandez.springintellij.SpringIntellijApplication;
import com.altimetrik.dhernandez.springintellij.models.Pupil;
import com.altimetrik.dhernandez.springintellij.repositories.PupilRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PupilService {

    private static final Logger log = LoggerFactory.getLogger(SpringIntellijApplication.class);

    @Autowired
    PupilRepository repository;


    public void save(Pupil pupil) {
        log.info("Saving pupul via service");
        repository.save(pupil);
    }


    public Iterable<Pupil> getAll() {
        return repository.findAll();
    }

}
