package code.design.singleton;

// eager way to create object in singleton
public class Connection {
    private static final Connection connection = new Connection();

    private Connection() {
    }

    public static Connection getConnection() {
        return connection;
    }
}
