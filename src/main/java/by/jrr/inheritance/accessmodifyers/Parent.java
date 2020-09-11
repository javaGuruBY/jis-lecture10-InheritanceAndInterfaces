package by.jrr.inheritance.accessmodifyers;

public class Parent {

    public String publicField;
    String defaultField;
    protected String protectedField;
    private String privateField = "it is private";

    public String getPublicField() {
        return publicField;
    }

    String getDefaultField() {
        return defaultField;
    }

    protected String getProtectedField() {
        return protectedField;
    }

    private String getPrivateField() {
        return privateField;
    }

    public String getPrivateValue() {
        return privateField;
    }
}
