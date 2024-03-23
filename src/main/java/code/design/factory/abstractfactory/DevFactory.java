package code.design.factory.abstractfactory;

import code.design.factory.Developer;
import code.design.factory.Employee;

public class DevFactory extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new Developer();
    }
}
