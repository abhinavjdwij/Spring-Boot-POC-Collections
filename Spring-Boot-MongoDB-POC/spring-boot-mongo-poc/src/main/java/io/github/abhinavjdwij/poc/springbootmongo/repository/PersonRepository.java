package io.github.abhinavjdwij.poc.springbootmongo.repository;

import io.github.abhinavjdwij.poc.springbootmongo.documents.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String>, CustomPersonRepository {
}
