package lesson6;

import java.io.Serializable;

public interface Movable extends Serializable, Cloneable {
    public static final String NAME = "Brand";

    public abstract void printTransportInfo();

    public abstract String transportName();

    public default void someMethod() {
        System.out.println("someMethod");
    }

    public static void staticMethod() {
        //logic
    }

    private static void privateMethod() {  // в java 8 нет

    }
}
