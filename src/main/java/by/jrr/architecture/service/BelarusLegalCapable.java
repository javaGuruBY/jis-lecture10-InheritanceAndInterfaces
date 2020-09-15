package by.jrr.architecture.service;

import by.jrr.architecture.bean.Person;
import by.jrr.architecture.service.LegalCapable;

public class BelarusLegalCapable implements LegalCapable {

    Person person;

    public BelarusLegalCapable(Person person) {
        this.person = person;
    }

    @Override
    public boolean isMariable() {
        return person.getAge() > 18;
    }
}
