package by.jrr.inheritance.abstractclasses;

import static by.jrr.inheritance.App.log;

public class FruitSalad extends SaladRecipe {

    @Override
    public void getProduct() {
        log.info("taking apples, bananas");
    }
}
