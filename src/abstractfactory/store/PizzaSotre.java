package abstractfactory.store;

import abstractfactory.PizzaType;
import abstractfactory.pizza.Pizza;

public abstract class PizzaSotre {

    protected abstract Pizza createPizza(PizzaType item);

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        System.out.println("Preparing a " + pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
