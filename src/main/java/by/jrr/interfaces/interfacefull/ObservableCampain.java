package by.jrr.interfaces.interfacefull;

public class ObservableCampain {

    Observable observable;

    public ObservableCampain(Observable observable) {
        this.observable = observable;
    }

    public void startCompain(String SubjectName, String centerName) {
        observable.observe(SubjectName);
        observable.send(centerName);
    }
}
