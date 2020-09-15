package by.jrr.interfaces.syntax;

import java.util.Comparator;

public interface Flyable {

    String name = "";
    String privateName = "";

    Long MAX = 100l;


    default void fly() {
        System.out.println("I fly");
    }

    default void study() {
        doStuff3();
    }

    private void doStuff3() {
        System.out.println("Flyable: Learning book how to fly");
    }

    default void doStuff4() {

    }

    static void doStuff5() {
        System.out.println("do sthn");
    }

}
