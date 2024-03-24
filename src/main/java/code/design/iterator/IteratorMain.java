package code.design.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Prashant", "1"));
        userManagement.addUser(new User("Test", "2"));
        userManagement.addUser(new User("Test1", "3"));
        userManagement.addUser(new User("Test2", "4"));
        userManagement.addUser(new User("Test3", "5"));

        MyIterator iterator = userManagement.getIterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println("Name : " + user.getName());
        }
    }
}
