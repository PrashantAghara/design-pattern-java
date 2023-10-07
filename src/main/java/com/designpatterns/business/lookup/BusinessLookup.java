package com.designpatterns.business.lookup;

import com.designpatterns.business.service.BusinessService;
import com.designpatterns.business.service.EJBService;
import com.designpatterns.business.service.JMSService;

public class BusinessLookup {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }
        else {
            return new JMSService();
        }
    }
}
