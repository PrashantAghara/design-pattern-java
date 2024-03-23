package code.design.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
        Logger logger = Logger.getLogger();
        Logger logger1 = Logger.getLogger();
        System.out.println(logger.hashCode() == logger1.hashCode());

//        Connection connection = Connection.getConnection();
//        Connection connection1 = Connection.getConnection();
//        System.out.println(connection1.hashCode() == connection.hashCode());

        /*
        Breaking Singleton Design Pattern
         */
        /* Way 1 - Reflection API.
         * sol 1 - if object is there => throw exception from constructor
         * sol 2 - use ENUM
         * */
        TestLogger testLogger = TestLogger.INSTANCE;
        TestLogger logger2 = TestLogger.INSTANCE;
        System.out.println(testLogger.hashCode() == logger2.hashCode());

        Logger l1 = Logger.getLogger();
//        Constructor<Logger> constructor = Logger.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Logger l2 = constructor.newInstance();
//        System.out.println(l1.hashCode() == l2.hashCode());

        /*
        Way 2 - Deserialization
        Solution - implement readResolve Method
         */
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        objectOutputStream.writeObject(l1);
        System.out.println("Serialization Done");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
        Logger l3 = (Logger) objectInputStream.readObject();
        System.out.println(l1.hashCode() == l3.hashCode());

        /*
        Way 3 - Cloning of the Object
         */
        Logger l4 = (Logger) l1.clone();
        System.out.println(l1.hashCode() == l4.hashCode());
    }
}
