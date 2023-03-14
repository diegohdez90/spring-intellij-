package com.altimetrik.dhernandez.springintellij.services;

import com.altimetrik.dhernandez.springintellij.annotations.MyAnnotation;
import com.altimetrik.dhernandez.springintellij.models.Pupil;
import com.altimetrik.dhernandez.springintellij.repositories.PupilRepository;
import com.altimetrik.dhernandez.springintellij.services.interfaces.PupilService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PupilServiceImpl implements PupilService {

    private static final Logger log = LoggerFactory.getLogger(PupilServiceImpl.class);

    @Autowired
    PupilRepository repository;

    public void save(Pupil pupil) {
        repository.save(pupil);
    }

    public Iterable<Pupil> getAll() {
        return repository.findAll();
    }

    @MyAnnotation
    public Optional<Pupil> getById(Integer id) {
       return repository.findById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }


    @Override
    public List<Pupil> searchByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }
}
