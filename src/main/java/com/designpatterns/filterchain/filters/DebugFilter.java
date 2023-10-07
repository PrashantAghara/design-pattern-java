package com.designpatterns.filterchain.filters;

import com.designpatterns.filterchain.Filter;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
