package com.designpatterns.frontcontroller;

public class Main {
    public static void main(String[] args) {

        Controller frontController = new Controller();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
