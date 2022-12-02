package com.example.demo;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class PersonController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);


    @Autowired
    private PersonRepository repository;

    @GetMapping("/persons/{id}")
    Optional<Person> findPersonbyName(@PathVariable String id) {
    	
 	
    	LOGGER.info("requesting for: "+id);
    	final Optional<Person> result = repository.findById(id); 	
    	return result;
    	
    }
}
