package by.jrr.inheritance.abstractclasses.testest;

import by.jrr.inheritance.abstractclasses.FruitSalad;
import by.jrr.inheritance.abstractclasses.MeatSalade;
import by.jrr.inheritance.abstractclasses.SaladRecipe;
import org.junit.Test;

import static by.jrr.inheritance.App.log;

public class SaladRecipeTest {

    @Test
    public void prepareSalad() {
        SaladRecipe[] recipes = {
                new FruitSalad(),
                new MeatSalade(),
                new SaladRecipe() {
                    @Override
                    public void getProduct() {
                        log.info("get brokolly");
                    }
                    public void washProducts() {
                        log.info("skip washing");
                    }
                },
                new SaladRecipe() {
                    @Override
                    public void getProduct() {
                        log.info("get all for Chezar");
                    }
                },

        };

        for (SaladRecipe recipe: recipes) {
            recipe.prepareSalad();
        }
    }
}
