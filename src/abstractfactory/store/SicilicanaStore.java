package abstractfactory.store;

import abstractfactory.*;
import abstractfactory.factory.PizzaIngredientFactory;
import abstractfactory.factory.SicilicanaIngredientFactory;
import abstractfactory.pizza.ClamPizza;
import abstractfactory.pizza.PepperoniPizza;
import abstractfactory.pizza.Pizza;
import abstractfactory.pizza.VeggiePizza;

public class SicilicanaStore extends PizzaSotre{

    @Override
    protected Pizza createPizza(PizzaType item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new SicilicanaIngredientFactory();

        switch (item) {
            case VEGGIE: {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Sicilicana Veggie Pizza");
            }
            break;
            case CLAM:{
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Sicilicana Clam Pizza");
            }
            break;
            case PEPPERONI: {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Sicilicana Pepperoni Pizza");
            }
            break;
            default:{
                System.out.println("No type exists");
            }
        }

        return pizza;
    }

}
