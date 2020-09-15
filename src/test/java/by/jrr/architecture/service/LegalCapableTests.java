package by.jrr.architecture.service;

import by.jrr.architecture.bean.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class LegalCapableTests {


    @Test
    public void isMariable() {
        var person = new Person(21, "Maria");
        var person2 = new Person(17, "vika");

        var belarusLegalCapable = new BelarusLegalCapable(person);
        var belarusLegalCapable2 = new BelarusLegalCapable(person2);
        assertEquals(true, belarusLegalCapable.isMariable());
        assertEquals(false, belarusLegalCapable2.isMariable());


        var britishLegalCapable1 = new BritishLegalCapable(person);
        var britishLegalCapable2 = new BritishLegalCapable(person2);
        assertEquals(true, britishLegalCapable1.isMariable());
        assertEquals(true, britishLegalCapable2.isMariable());
    }
}
