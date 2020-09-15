package by.jrr.architectureandmock.bean;

import java.util.Objects;

public class Person {

    int age;
    String name;
    String citizen;

    public Person(int age, String name, String citizen) {
        this.age = age;
        this.name = name;
        this.citizen = citizen;
    }

    public int getAge() {
        return age;
    }
    public String  getCitizen() {
        return citizen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
