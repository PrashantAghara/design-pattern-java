package com.designpatterns.structural.filter;

import com.designpatterns.structural.filter.criterias.*;

import java.util.ArrayList;
import java.util.List;

public class FilterMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new MaleCriteria();
        Criteria female = new FemaleCriteria();
        Criteria single = new SingleCriteria();
        Criteria singleAndFemale = new AndCriteria(new SingleCriteria(), new FemaleCriteria());
        Criteria marriedOrMale = new OrCriteria(new MaleCriteria(), new MarriedCriteria());

        System.out.println("MALE : ");
        printPersons(male.meetCriteria(persons));
        System.out.println("======");
        System.out.println("FEMALE : ");
        printPersons(female.meetCriteria(persons));
        System.out.println("======");
        System.out.println("SINGLE : ");
        printPersons(single.meetCriteria(persons));
        System.out.println("======");
        System.out.println("SINGLE AND FEMALE : ");
        printPersons(singleAndFemale.meetCriteria(persons));
        System.out.println("======");
        System.out.println("MARRIED OR MALE : ");
        printPersons(marriedOrMale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
