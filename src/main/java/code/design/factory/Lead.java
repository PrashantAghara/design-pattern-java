package code.design.factory;

public class Lead implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting Lead Salary");
        return 20000;
    }
}
