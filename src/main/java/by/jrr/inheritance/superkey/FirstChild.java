package by.jrr.inheritance.superkey;

import by.jrr.inheritance.App;

public class FirstChild extends Parent {

    protected String firstChildName = "firstChildName";

    public FirstChild() {
        this("");
    }

    public FirstChild(String arg) {
        super(arg, 1);
    }

    public String print() {
        return "I'm FirstChild";
    }

    public void testPrint(){
        App.log.info("super.print() "+super.print());
        App.log.info("this.print() "+this.print());
    }

    @Override
    public String toString() {
        return super.toString() +
                "FirstChild{" +
                "firstChildName='" + firstChildName + '\'' +
                '}';
    }
}
