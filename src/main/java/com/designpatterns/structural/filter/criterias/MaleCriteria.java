package com.designpatterns.structural.filter.criterias;

import com.designpatterns.structural.filter.Criteria;
import com.designpatterns.structural.filter.Person;

import java.util.List;

public class MaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender().equalsIgnoreCase("MALE")).toList();
    }
}
