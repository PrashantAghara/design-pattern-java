package com.designpatterns.business;

import com.designpatterns.business.client.Client;
import com.designpatterns.business.delegate.BusinessDelegate;

public class BusinessMain {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
