package by.jrr.inheritance.accessmodifyers.restrictdefault;

import by.jrr.inheritance.accessmodifyers.Child;
import org.junit.Test;

import static by.jrr.inheritance.App.log;

public class DemoTest {

    @Test
    public void accessSyntax() {
        Child child = new Child();
        child.publicField = "publicField";
//        child.defaultField = "defaultField"; //not visible (other package)
//        child.protectedField = "protectedField"; //not visible (other package)
//        child.privateField = "privateField"; //not visible

        child.getPublicField();
//        child.getDefaultField(); //not visible (other package)
//        child.getProtectedField(); //not visible (other package)
//        child.getPrivateField(); //not visible

        log.info(child.getPrivateValue());

    }
}
