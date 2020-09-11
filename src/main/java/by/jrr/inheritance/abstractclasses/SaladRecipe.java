package by.jrr.inheritance.abstractclasses;

import static by.jrr.inheritance.App.log;

public abstract class SaladRecipe {

    String[] products;

    public void prepareSalad() {
        log.info("=== Prepating now... === "+ this.getClass().getName());
        getBowl();
        getKnife();
        getProduct();
        washProducts();
        sliceProducts();
        shuffleProductsInBowl();
    }

    private void getBowl() {
        log.info("getting bowl");
    }

    private void getKnife() {
        log.info("getting Knife");
    }

    public abstract void getProduct();

    protected void washProducts() {
        log.info("wash precisely");
    }

    private void sliceProducts() {
        log.info("cutting fingers");
    }

    private void shuffleProductsInBowl() {
        log.info("shuffffleng ");
    }

}
