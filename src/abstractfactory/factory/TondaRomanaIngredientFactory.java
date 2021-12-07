package abstractfactory.factory;

import abstractfactory.ingredients.*;

public class TondaRomanaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new SheepMilkCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Onion(), new BlackOlives(), new Mushroom(), new Brinjol() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new MargheritaPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
