package com.designpatterns.mvc.controller;

import com.designpatterns.mvc.model.Student;
import com.designpatterns.mvc.view.StudentView;

public class StudentController {
    Student model;
    StudentView view;

    public StudentController(StudentView studentView, Student student) {
        this.model = student;
        this.view = studentView;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(int rollNo) {
        model.setRollNo(rollNo);
    }

    public int getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudent(model);
    }
}
