package by.jrr.interfaces.syntax;

public interface Swimmable {

    public static final String NAME = "DOGGY STYLE";
    String NICK_NAME = "";

    Long MAX = 1000l;

    void swim();

    default void study() {
        System.out.println("Swimmable: Learning book how to swim");
    }

    default void everybodyCanSwimDoggy() {
        swimmingDoggy();
    }

    private void swimmingDoggy() {
        //default implementations
    }

    static void sayHelloToTheWorld() {
        System.out.println("Hello World");
    }

}
