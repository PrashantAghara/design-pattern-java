package com.designpatterns.filterchain.filters;

import com.designpatterns.filterchain.Filter;

public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
