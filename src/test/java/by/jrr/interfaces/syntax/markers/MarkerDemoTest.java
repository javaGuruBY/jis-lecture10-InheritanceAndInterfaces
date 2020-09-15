package by.jrr.interfaces.syntax.markers;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarkerDemoTest {

    @Test
    public void demo() {
        Packable[] people = {
                new Person(),
                new Mentor(),
                new Student(),
                new Lecturer()
        };
    }

}
