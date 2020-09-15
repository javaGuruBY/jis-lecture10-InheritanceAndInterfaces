package by.jrr.architecture.service;

import by.jrr.architecture.bean.Person;
import by.jrr.architecture.service.LegalCapable;

public class BritishLegalCapable implements LegalCapable {

    Person person;

    public BritishLegalCapable(Person person) {
        this.person = person;
    }

    @Override
    public boolean isMariable() {
        return person.getAge() > 16;
    }
}
