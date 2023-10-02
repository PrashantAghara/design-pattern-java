package com.designpatterns.structural.filter.criterias;

import com.designpatterns.structural.filter.Criteria;
import com.designpatterns.structural.filter.Person;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
        List<Person> finaList = new ArrayList<>(firstCriteriaItems);
        for (Person person : otherCriteriaItems) {
            if (!finaList.contains(person)) {
                finaList.add(person);
            }
        }
        return finaList;
    }
}
