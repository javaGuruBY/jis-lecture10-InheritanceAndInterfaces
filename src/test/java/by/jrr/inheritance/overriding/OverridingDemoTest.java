package by.jrr.inheritance.overriding;

import org.junit.Test;

import static by.jrr.inheritance.App.log;

public class OverridingDemoTest {

    @Test
    public void polymorphism() {
        Singer[] singers = {
                new Shanson("Circle", "1 Sept"),
                new Rap("eminem", "rap god"),
                new TrashMetal("Metalica", "sad but true")
        };

        for (Singer singer : singers) {
            log.info(singer.singTheSong());
            if(singer instanceof Shanson) {
                Shanson var = (Shanson) singer;
                var.getShanson();
            }
            if(singer instanceof Rap) {
                Rap var = (Rap) singer;
                var.getRap();
            }
            if(singer instanceof TrashMetal) {
                TrashMetal var = (TrashMetal) singer;
                var.getTrashMetal();
            }
        }
    }

    @Test
    public void casting1() {
        Shanson shanson = new Shanson("Circle", "1 Sept");
        Rap rap = new Rap("eminem", "rap god");

        shanson.getShanson();
        rap.getRap();

        shanson.singTheSong();
        rap.singTheSong();

        Singer parentShanson = shanson;
        Singer parentRap = rap;

        parentRap.singTheSong();
        parentShanson.singTheSong();

        Shanson castShanson = (Shanson) parentShanson;
        castShanson.getShanson();

    }
    @Test
    public void casting2() {
        Singer shanson = new Shanson("Circle", "1 Sept");
        Singer rap = new Rap("eminem", "rap god");

        shanson.singTheSong();
        rap.singTheSong();

        Shanson castShanson = (Shanson) shanson;
        Rap castRap = (Rap) rap;

        castShanson.getShanson();
        castRap.getRap();
    }
}
