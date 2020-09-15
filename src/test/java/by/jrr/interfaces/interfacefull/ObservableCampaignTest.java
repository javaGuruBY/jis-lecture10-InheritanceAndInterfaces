package by.jrr.interfaces.interfacefull;

import by.jrr.interfaces.abstractfull.AbstractObservable;
import by.jrr.interfaces.abstractfull.IntruderPlain;
import by.jrr.interfaces.abstractfull.ObservableCampain;
import by.jrr.interfaces.abstractfull.SpaceObserver;
import org.junit.Test;

public class ObservableCampaignTest {

    @Test
    public void abstractObservableDemo() {
        ObservableCampain belarus = new ObservableCampain(new SpaceObserver());
        belarus.startCompain("President", "Warshava");

        ObservableCampain russia = new ObservableCampain(new IntruderPlain());
        russia.startCompain("Navalny", "Omsk");

        ObservableCampain china = new ObservableCampain(new AbstractObservable() {
            @Override
            public String observe(String name) {
                return null;
            }

            @Override
            public boolean send(String centerName) {
                return false;
            }
        });
        china.startCompain("Tan an mey", "USA");
    }

    @Test
    public void interfaceInAction() {
        ObservableCampain[] campains = {
                new ObservableCampain(new SpaceObserver()),
                new ObservableCampain(new IntruderPlain())
        };

        for (ObservableCampain camp : campains) {
            camp.startCompain("President", "Warshava");
        }
    }
}
