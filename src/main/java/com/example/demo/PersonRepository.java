package com.example.demo;
 
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

@Repository
public interface PersonRepository extends CosmosRepository<Person, String> {
	Optional<Person> findById(String id);
}
