package by.jrr.interfaces.abstractfull;

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
}
