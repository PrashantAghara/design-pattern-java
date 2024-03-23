package code.design.singleton;

import java.io.Serializable;

// Lazy Way to create object
public class Logger implements Serializable, Cloneable {
    private static Logger logger;

    //Not able to create object using new keyword
    private Logger() {
        // Solution 1 for Reflection API
//        if (logger != null){
//            throw new RuntimeException("Object already created");
//        }
    }

    //Method is used to create object.
    public static Logger getLogger() {
        if (logger == null) {
            // For Multi-threaded Environment
            synchronized (Logger.class) {
                logger = new Logger();
            }
        }
        return logger;
    }

    // Solution for Deserialization
    public Object readResolve() {
        return logger;
    }

    // Solution for Clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return logger;
    }
}
