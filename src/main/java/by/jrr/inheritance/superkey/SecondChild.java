package by.jrr.inheritance.superkey;

public class SecondChild extends FirstChild {

    protected String secondChildName = "secondChildName";


    public SecondChild(String arg) {
        super(arg);
    }

    @Override
    public String toString() {
        return "SecondChild{" +
                "secondChildName='" + secondChildName + '\'' +
                ", firstChildName='" + firstChildName + '\'' +
                ", parentName='" + parentName + '\'' +
                '}';
    }
}
