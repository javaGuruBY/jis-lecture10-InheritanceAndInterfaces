package by.jrr.inheritance.abstractclasses;

import static by.jrr.inheritance.App.log;

public class MeatSalade extends SaladRecipe {
    @Override
    public void getProduct() {
        log.info("Hamon");
    }

    @Override
    public void washProducts() {
        log.info("skip washing");
    }
}
