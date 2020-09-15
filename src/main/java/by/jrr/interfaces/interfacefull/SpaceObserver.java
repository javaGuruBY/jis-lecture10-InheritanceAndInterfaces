package by.jrr.interfaces.interfacefull;

public class SpaceObserver implements Observable {

    String data;

    @Override
    public String observe(String name) {
        return observingWithTelescope();

    }

    @Override
    public boolean send(String centerName) {
        return sendDataToNasa();
    }

    public String observingWithTelescope() {
        System.out.println("observingWithTelescope");
        return new String("data");
    }

    public boolean sendDataToNasa() {
        System.out.println("sendingData");
        return true;
    }
}
