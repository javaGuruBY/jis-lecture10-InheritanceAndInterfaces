package by.jrr.inheritance.bean;

public class Tricycle extends Bicycle{
    protected int numWheels = 3;

    public Tricycle(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public String toString() {
        return "Tricycle{" +
                "numWheels=" + numWheels +
                '}';
    }
}
