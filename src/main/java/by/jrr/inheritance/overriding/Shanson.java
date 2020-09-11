package by.jrr.inheritance.overriding;

import by.jrr.inheritance.App;

import static by.jrr.inheritance.App.*;

public class Shanson extends Singer {


    public Shanson(String name, String song) {
        super(name, song);
    }

    @Override
    public String singTheSong(){
        return name + " is singing " + song;
    }

    public void getShanson() {
        log.info(this.getClass().getName());
    }
}
