package com.designpatterns.behavioral.nullobject.customer;

import com.designpatterns.behavioral.nullobject.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
