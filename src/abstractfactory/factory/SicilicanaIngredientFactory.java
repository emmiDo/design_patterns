package abstractfactory.factory;

import abstractfactory.ingredients.*;

public class SicilicanaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Onion(), new BlackOlives(), new Mushroom(), new Tomato() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SmokedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

}
