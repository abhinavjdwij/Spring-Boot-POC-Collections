package io.github.abhinavjdwij.poc.springbootmongo.repository;

import io.github.abhinavjdwij.poc.springbootmongo.documents.Person;

import java.util.List;

public interface CustomPersonRepository {
    List<Person> queryByAgeRange(Integer minAge, Integer maxAge);
}
