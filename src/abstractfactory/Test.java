package abstractfactory;

import abstractfactory.pizza.Pizza;
import abstractfactory.store.PizzaSotre;
import abstractfactory.store.SicilicanaStore;
import abstractfactory.store.TondaRomanaStore;

public class Test {

    public static void main(String[] args) {
        PizzaSotre sicilicanaStore = new SicilicanaStore();
        PizzaSotre tondaRomanaStore = new TondaRomanaStore();

        Pizza pizza1 = sicilicanaStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Pizza1: " + pizza1 + " from Sicilicana");

        Pizza pizza2 = tondaRomanaStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Pizza2: " + pizza2 + " from Tonda Romana");

        Pizza pizza3 = sicilicanaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Pizza3: " + pizza3 + " from Sicilicana");

        Pizza pizza4 = tondaRomanaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Pizza4: " + pizza4 + " from Tonda Romana");

        Pizza pizza5 = sicilicanaStore.orderPizza(PizzaType.CLAM);
        System.out.println("Pizza5: " + pizza5 + " from Sicilicana");

        Pizza pizza6 = tondaRomanaStore.orderPizza(PizzaType.CLAM);
        System.out.println("Pizza6: " + pizza6 + " from Tonda Romana");
    }

}
