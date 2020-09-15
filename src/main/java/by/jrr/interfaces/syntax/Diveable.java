package by.jrr.interfaces.syntax;

public interface Diveable extends Swimmable, Flyable{

    void dive();

    @Override
    default void study() {

        long i = Swimmable.MAX;
        long j = Flyable.MAX;
//        long k = MAX;
    }
}
