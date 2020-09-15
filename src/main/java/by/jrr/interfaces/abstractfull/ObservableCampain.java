package by.jrr.interfaces.abstractfull;

public class ObservableCampain {

    AbstractObservable observable;

    public ObservableCampain(AbstractObservable observable) {
        this.observable = observable;
    }

    public void startCompain(String SubjectName, String centerName) {
        observable.observe(SubjectName);
        observable.send(centerName);
    }
}
