package code.design.factory.abstractfactory;

import code.design.factory.Employee;
import code.design.factory.Lead;

public class LeadFactory extends AbstractEmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Lead();
    }
}
