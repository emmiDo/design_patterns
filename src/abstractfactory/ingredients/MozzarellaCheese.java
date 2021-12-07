package abstractfactory.ingredients;

public class MozzarellaCheese implements Cheese{

    private final String NAME = "Mozzarella Cheese";

    @Override
    public String toString() {
        return NAME;
    }
}
