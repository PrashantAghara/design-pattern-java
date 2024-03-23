package code.design.factory.abstractfactory;

import code.design.factory.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(AbstractEmployeeFactory factory) {
        return factory.createEmployee();
    }
}
