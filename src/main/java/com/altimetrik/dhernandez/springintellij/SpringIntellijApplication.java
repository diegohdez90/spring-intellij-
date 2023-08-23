package com.altimetrik.dhernandez.springintellij;

import com.altimetrik.dhernandez.springintellij.models.Pupil;
import com.altimetrik.dhernandez.springintellij.repositories.PupilRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;


@SpringBootApplication
public class SpringIntellijApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringIntellijApplication.class);

    public static void main(String[] args) {
         SpringApplication.run(SpringIntellijApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(PupilRepository repository) {
//        return (args) -> {
//            // save a couple of persons
//            repository.save(new Pupil("Jack", "Smith", "jsmith@mail.com"));
//            repository.save(new Pupil("Joe", "Black", "jblack@mail.com"));
//            repository.save(new Pupil("Martin", "Bauer", "mbauer@mail.com"));
//
//
//            // fetch all persons
//            log.info("Persons found with findAll():");
//            log.info("-------------------------------");
//            for (Pupil pupil : repository.findAll()) {
//                log.info(pupil.toString());
//            }
//            log.info("");
//
//            // fetch an individual person by ID
//
//            // fetch persons by last name
//            log.info("Person found by id");
//            log.info("--------------------------------------------");
//            Optional<Pupil> pupil = repository.findById(1);
//
//            log.info(pupil.toString());
//
//            log.info("");
//        };
//    }
}
