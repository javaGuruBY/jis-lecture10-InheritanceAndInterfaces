package by.jrr.interfaces.interfacefull;

public class IntruderPlain implements Observable {

    String data;

    @Override
    public String observe(String name) {
       makeFlyFromAToB();
       collectData();
       returnToBase();
       return data;
    }

    @Override
    public boolean send(String centerName) {
        return sendDataToNasa();
    }

    public void makeFlyFromAToB() {
        System.out.println("flyingFromAToB");
    }
    public void collectData() {
        data = "some new Data";
        System.out.println("collectiongData");
    }
    public void returnToBase() {
        System.out.println("returningToBase");
    }

    public boolean sendDataToNasa() {
        System.out.println("verify that data is stored");
        return data != null;
    }
}
