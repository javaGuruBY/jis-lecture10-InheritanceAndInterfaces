package by.jrr.inheritance.overriding;

import static by.jrr.inheritance.App.log;

public class Rap extends Singer {

    public Rap(String name, String song) {
        super(name, song);
    }

    @Override
    public String singTheSong() {
        return name + " is reading rap song " + song;
    }

    public void getRap() {
        log.info(this.getClass().getName());
    }
}
