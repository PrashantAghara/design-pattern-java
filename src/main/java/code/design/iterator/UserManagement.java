package code.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
    }

    public User getUser(int idx) {
        return this.users.get(idx);
    }

    public MyIterator getIterator() {
        return new MyIteratorImpl(users);
    }
}
