package io.github.abhinavjdwij.poc.springbootmongo.controller;

import io.github.abhinavjdwij.poc.springbootmongo.documents.Person;
import io.github.abhinavjdwij.poc.springbootmongo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/poc/mongo/")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getAll();
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable("id") final String id) {
        return personService.getById(id);
    }

    @PostMapping("/persons")
    public List<Person> addPersons(@RequestBody List<Person> persons) {
        return personService.addPerson(persons);
    }

    @DeleteMapping("/persons/{id}")
    public Person deletePersonById(@PathVariable("id") String id) {
        return personService.deleteById(id);
    }

    @GetMapping("persons/findByAgeRange")
    public List<Person> findPersonByAgeRange(
                    @RequestParam("minAge") Integer minAge,
                    @RequestParam("maxAge") Integer maxAge) {
        return personService.findByAgeRange(minAge, maxAge);
    }
}
