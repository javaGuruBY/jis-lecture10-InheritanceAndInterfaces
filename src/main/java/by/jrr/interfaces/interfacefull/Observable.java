package by.jrr.interfaces.interfacefull;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface Observable {

    String observe(String name);
    boolean send(String centerName);

}
