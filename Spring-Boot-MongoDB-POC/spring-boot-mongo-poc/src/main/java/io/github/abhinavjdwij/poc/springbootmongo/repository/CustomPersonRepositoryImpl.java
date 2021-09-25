package io.github.abhinavjdwij.poc.springbootmongo.repository;

import io.github.abhinavjdwij.poc.springbootmongo.documents.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class CustomPersonRepositoryImpl implements CustomPersonRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Person> queryByAgeRange(Integer minAge, Integer maxAge) {
        Query query = new Query();
        query.addCriteria(Criteria.where("age").gte(minAge).lte(maxAge));
        return mongoTemplate.find(query, Person.class);
    }
}
