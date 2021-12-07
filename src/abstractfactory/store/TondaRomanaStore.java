package abstractfactory.store;

import abstractfactory.*;
import abstractfactory.factory.PizzaIngredientFactory;
import abstractfactory.factory.TondaRomanaIngredientFactory;
import abstractfactory.pizza.ClamPizza;
import abstractfactory.pizza.PepperoniPizza;
import abstractfactory.pizza.Pizza;
import abstractfactory.pizza.VeggiePizza;

public class TondaRomanaStore extends PizzaSotre{
    @Override
    protected Pizza createPizza(PizzaType item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new TondaRomanaIngredientFactory();

        switch (item) {
            case VEGGIE: {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Tonda Romana Veggie Pizza");
            }
            break;
            case CLAM:{
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Tonda Romana Clam Pizza");
            }
            break;
            case PEPPERONI: {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Tonda Romana Pepperoni Pizza");
            }
            break;
            default:{
                System.out.println("No type exists");
            }
        }

        return pizza;
    }
}
