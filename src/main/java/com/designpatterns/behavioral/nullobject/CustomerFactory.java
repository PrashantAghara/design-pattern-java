package com.designpatterns.behavioral.nullobject;

import com.designpatterns.behavioral.nullobject.customer.NullCustomer;
import com.designpatterns.behavioral.nullobject.customer.RealCustomer;

public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {

        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
