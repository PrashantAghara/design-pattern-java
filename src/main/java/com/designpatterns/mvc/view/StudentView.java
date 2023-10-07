package com.designpatterns.mvc.view;

import com.designpatterns.mvc.model.Student;

import java.util.List;

public class StudentView {
    public void printStudent(Student student) {
        System.out.println("Roll no : " + student.getRollNo() + " Name : " + student.getName());
    }
}
