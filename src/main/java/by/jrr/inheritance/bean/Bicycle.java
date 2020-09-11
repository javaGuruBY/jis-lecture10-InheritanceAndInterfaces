package by.jrr.inheritance.bean;

import java.util.Objects;

public class Bicycle {
    protected String brand;
    protected int speed;

    public Bicycle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate() {
        this.speed++;
    }

    public void decelerate() {
        this.speed--;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return speed == bicycle.speed &&
                Objects.equals(brand, bicycle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, speed);
    }
}
