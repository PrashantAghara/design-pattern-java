package com.designpatterns.mvc;

import com.designpatterns.mvc.controller.StudentController;
import com.designpatterns.mvc.model.Student;
import com.designpatterns.mvc.view.StudentView;

public class MVCMain {
    public static void main(String[] args) {
        Student student = new Student();
        StudentView studentView = new StudentView();

        StudentController controller = new StudentController(studentView, student);
        controller.updateView();

        controller.setStudentName("Prashant");
        controller.updateView();
        controller.setStudentRollNo(1);
        controller.updateView();
    }
}
