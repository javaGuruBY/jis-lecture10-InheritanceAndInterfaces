package by.jrr.inheritance.overriding;

public abstract class Singer {

    protected String name;
    protected String song;

    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
    }


    public String singTheSong() throws RuntimeException{
        return name + " is singing " + song;
    }
}
