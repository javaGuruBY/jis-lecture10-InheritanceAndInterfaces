package by.jrr.inheritance.staticvsinstance;

import by.jrr.inheritance.App;
import org.junit.Assert;
import org.junit.Test;

import static by.jrr.inheritance.App.log;
import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void demo() {
        Parent parent = new Parent();
        log.info(parent.toString());

        Child child = new Child();
        log.info(child.toString());

        Dauther dauther = new Dauther();
        log.info(child.toString());

        Assert.assertEquals(3, parent.getPersonCount());
        Assert.assertEquals(3, child.getPersonCount());
        Assert.assertEquals(3, dauther.getPersonCount());
    }

}
