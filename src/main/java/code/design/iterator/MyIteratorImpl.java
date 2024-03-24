package code.design.iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator {
    private List<User> users;
    private int length;
    private int position = 0;

    public MyIteratorImpl(List<User> users) {
        this.users = users;
        this.length = users.size();
    }

    @Override
    public boolean hasNext() {
        return position < length;
    }

    @Override
    public User next() {
        User user = users.get(position);
        position += 1;
        return user;
    }
}
