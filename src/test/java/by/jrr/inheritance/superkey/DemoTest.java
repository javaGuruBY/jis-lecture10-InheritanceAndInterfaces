package by.jrr.inheritance.superkey;

import by.jrr.inheritance.App;
import org.junit.Test;

import java.io.Serializable;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void demo() {
        SecondChild secondChild = new SecondChild("");
    }

    @Test
    public void superTest() {
        FirstChild firstChild = new FirstChild();
        firstChild.testPrint();
    }

    @Test
    public void toStringTest() {
        Parent parent = new Parent("");
        FirstChild firstChild = new FirstChild("");
        SecondChild secondChild = new SecondChild("");

        App.log.info(parent.toString());
        App.log.info(firstChild.toString());
        App.log.info(secondChild.toString());
    }
}
