package by.jrr.inheritance.accessmodifyers.childs;

import by.jrr.inheritance.accessmodifyers.Parent;

public class Child extends Parent {

    public void access() {
        getPublicField();
        getProtectedField();
//        getPrivateField();
        getPrivateValue();

        publicField = "";
        protectedField = "";
//        defaultField = "";
//        privateField = "";
    }
}

//private - private members are not inherited by a subclass.
//default - can only be inherited in the subclass if the subclass belongs to the same package.
//protected - can be inherited in the any subclass in any package
//public - are always inherited by a subclass.

//In this case inherited is more like "visible" (getPrivateValue())
