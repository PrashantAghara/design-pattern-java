package com.designpatterns.frontcontroller;

import com.designpatterns.frontcontroller.view.HomeView;
import com.designpatterns.frontcontroller.view.StudentView;

public class Dispatcher {
    StudentView studentView;
    HomeView homeView;

    public Dispatcher() {
        this.homeView = new HomeView();
        this.studentView = new StudentView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }
        else{
            homeView.show();
        }
    }
}
