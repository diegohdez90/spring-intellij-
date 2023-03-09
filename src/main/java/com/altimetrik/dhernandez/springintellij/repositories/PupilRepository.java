package com.altimetrik.dhernandez.springintellij.repositories;

import com.altimetrik.dhernandez.springintellij.models.Pupil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PupilRepository extends CrudRepository<Pupil, Integer>{
}
