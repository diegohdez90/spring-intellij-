package com.altimetrik.dhernandez.springintellij.services.interfaces;

import com.altimetrik.dhernandez.springintellij.models.Pupil;

import java.util.List;

public interface PupilService {
    List<Pupil> searchByFirstName(String firstName);

}
