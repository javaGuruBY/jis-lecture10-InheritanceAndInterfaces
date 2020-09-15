package by.jrr.interfaces.syntax;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlyableTest {

    @Test
    public void syntaxTest() {
        Flyable.doStuff5();
    }

    @Test
    public void multipleImplementations() {
        Maxim maxim = new Maxim();
        maxim.fly();
        maxim.swim();
    }
}
