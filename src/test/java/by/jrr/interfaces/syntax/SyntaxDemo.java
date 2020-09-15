package by.jrr.interfaces.syntax;

import by.jrr.interfaces.syntax.markers.Packable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SyntaxDemo {

    @Test
    public void staticNotHeritable() {
        Oleg oleg = new Oleg();
        oleg.dive();
        oleg.swim();
        oleg.everybodyCanSwimDoggy();
//        oleg.sayHelloToTheWorld();
//        Diveable.sayHelloToTheWorld();
        Swimmable.sayHelloToTheWorld();
    }

    @Test
    public void heritanceWithSameSignatureMethods() {
        Maxim maxim = new Maxim();
        Long actual = maxim.MAX;
        assertEquals(null, actual);

        long i = Swimmable.MAX;
        long j = Flyable.MAX;
//        long k = Diveable.MAX;
    }

    @Test
    public void instantiating() {
        Packable packable = new Packable() {};
        Flyable flyable = new Flyable() {};
        Swimmable swimmable = new Swimmable() {
            @Override
            public void swim() {

            }
        };

    }
}
