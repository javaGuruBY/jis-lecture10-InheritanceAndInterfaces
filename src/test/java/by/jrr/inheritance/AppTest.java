package by.jrr.inheritance;

import by.jrr.inheritance.bean.Bicycle;
import by.jrr.inheritance.bean.MotorBicycle;
import by.jrr.inheritance.bean.MountainBicycle;
import by.jrr.inheritance.bean.Tricycle;
import org.junit.Test;
import org.junit.platform.commons.logging.LoggerFactory;

public class AppTest {

    @Test
    public void basicSyntaxDemo() {
        Bicycle bicycle = new Bicycle("aist", 10);
        bicycle.accelerate();

        Tricycle tricycle = new Tricycle("nGear", 15);
        tricycle.accelerate();

        MountainBicycle mountainBicycle = new MountainBicycle("gorny", 20, 12);
        mountainBicycle.decelerate();
        mountainBicycle.changeGear(3);

        MotorBicycle motorBicycle = new MotorBicycle("memOto", 39, 12, "drugba");
        motorBicycle.accelerate();
        motorBicycle.changeGear(2);

        App.log.info(bicycle.toString());
        App.log.info(tricycle.toString());
        App.log.info(mountainBicycle.toString());
        App.log.info(motorBicycle.toString());

        Bicycle[] bicycles = {bicycle, tricycle, motorBicycle, mountainBicycle}; // is-a
    }
}
