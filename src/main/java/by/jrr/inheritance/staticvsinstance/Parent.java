package by.jrr.inheritance.staticvsinstance;

public class Parent {

    {
        personCount++;
    }

    public String name;
    public static int personCount;

    public int getPersonCount() {
        return personCount;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                "personCount='" + getPersonCount() + '\'' +
                '}';
    }
}
