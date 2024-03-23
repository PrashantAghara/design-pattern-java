package code.design.factory;

public class Developer implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Developer Salary");
        return 10000;
    }
}
