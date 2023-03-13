package com.altimetrik.dhernandez.springintellij.repositories;

import com.altimetrik.dhernandez.springintellij.models.Pupil;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PupilRepository extends CrudRepository<Pupil, Integer>{

    @Query(value = "SELECT * FROM student s WHERE s.first_name=:firstName", nativeQuery = true)
    List<Pupil> findByFirstName(@Param("firstName") String firstName);
}
