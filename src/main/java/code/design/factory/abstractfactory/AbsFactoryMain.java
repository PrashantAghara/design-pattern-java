package code.design.factory.abstractfactory;

import code.design.factory.Employee;

public class AbsFactoryMain {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new DevFactory());
        System.out.println("Salary is : " + employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee(new LeadFactory());
        System.out.println("Salary is : " + employee1.salary());
    }
}
