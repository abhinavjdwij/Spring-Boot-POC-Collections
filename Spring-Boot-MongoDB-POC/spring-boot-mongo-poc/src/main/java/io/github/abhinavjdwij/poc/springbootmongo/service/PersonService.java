package io.github.abhinavjdwij.poc.springbootmongo.service;

import io.github.abhinavjdwij.poc.springbootmongo.documents.Person;
import io.github.abhinavjdwij.poc.springbootmongo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person getById(String id) {
        return personRepository.findById(id).orElseGet(Person::new);
    }

    public Person deleteById(String id) {
        Person person = getById(id);
        if (personRepository.existsById(id)) {
            personRepository.deleteById(id);
        }
        return person;
    }

    public List<Person> addPerson(List<Person> persons) {
        return personRepository.saveAll(persons);
    }

    public List<Person> findByAgeRange(Integer minAge, Integer maxAge) {
        return personRepository.queryByAgeRange(minAge, maxAge);
    }
}
