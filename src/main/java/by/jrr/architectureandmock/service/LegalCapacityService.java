package by.jrr.architectureandmock.service;

import by.jrr.architectureandmock.bean.Person;

public class LegalCapacityService {

     LegalCapable legalCapableBrit;
     LegalCapable legalCapableBel;

    public LegalCapacityService(LegalCapable legalCapableBrit, LegalCapable legalCapableBel) {
        this.legalCapableBrit = legalCapableBrit;
        this.legalCapableBel = legalCapableBel;
    }

    public  boolean isCouldBeMarriad(Person person) {
        if (person.getCitizen().equals("british")) {
            return legalCapableBrit.isMariable(person);
        } else if (person.getCitizen().equals("belarus")) {
            return legalCapableBel.isMariable(person);
        } else {
            throw new IllegalArgumentException("Not supported Citizenship");
        }
    }
}
