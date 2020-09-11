package by.jrr.inheritance.accessmodifyers;

import by.jrr.inheritance.App;
import org.junit.Test;

import static by.jrr.inheritance.App.*;
import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void accessSyntax() {
        Child child = new Child();
        child.publicField = "publicField";
        child.defaultField = "defaultField";
        child.protectedField = "protectedField";
//        child.privateField = "privateField"; //not visible

        child.getPublicField();
        child.getDefaultField();
        child.getProtectedField();
//        child.getPrivateField(); //not visible

        log.info(child.getPrivateValue());
    }
}
