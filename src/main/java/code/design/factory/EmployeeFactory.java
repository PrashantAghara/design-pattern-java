package code.design.factory;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        return switch (type) {
            case "developer" -> new Developer();
            case "lead" -> new Lead();
            default -> throw new RuntimeException("Employee type found : " + type);
        };
    }
}
