package code.design.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Employee developer = EmployeeFactory.getEmployee("developer");
        Employee lead = EmployeeFactory.getEmployee("lead");
        System.out.println("Salary of Developer is : " + developer.salary());
        System.out.println("Salary of Lead is : " + lead.salary());
    }
}
