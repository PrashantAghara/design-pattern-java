package com.designpatterns.business.client;

import com.designpatterns.business.delegate.BusinessDelegate;

public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.doTask();
    }
}
