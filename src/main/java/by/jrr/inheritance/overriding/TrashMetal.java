package by.jrr.inheritance.overriding;

import static by.jrr.inheritance.App.log;

public class TrashMetal extends Singer{

    public TrashMetal(String name, String song) {
        super(name, song);
    }

    @Override
    public String singTheSong() {
        return "Fork the song " + name + ", go POGO!!!";
    }

    public void getTrashMetal() {
        log.info(this.getClass().getName());
    }
}
