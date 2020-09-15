package by.jrr.interfaces.syntax;

import java.io.Serializable;

public class Maxim implements Flyable, Swimmable, Serializable {

    Long MAX;

    void doStuff() {

    }

    @Override
    public void swim() {

    }

    //ambiguity
    public void study() {
        System.out.println("Flyable: Learning book how to fly");
    }

    public long getMaxFlyHeght() {
        return Flyable.MAX;
    }

    public long getMaxSwimLength() {
        return Swimmable.MAX;
    }


}
