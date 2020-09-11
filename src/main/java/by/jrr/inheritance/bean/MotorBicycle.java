package by.jrr.inheritance.bean;

public class MotorBicycle extends MountainBicycle{
    protected String engine;

    public MotorBicycle(String brand, int speed,  int gear, String engine) {
        super(brand, speed, gear);
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "MotorBicycle{" +
                "engine='" + engine + '\'' +
                '}';
    }
}
