package by.jrr.inheritance.superkey;

public class Parent {

    protected String parentName = "parentName";

    public Parent(String arg) {
        super();
    }

    public Parent(String name, int i) {
        super();
    }

    public String print() {
        return "I'm parent";
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentName='" + parentName + '\'' +
                '}';
    }
}
