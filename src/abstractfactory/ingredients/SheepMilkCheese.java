package abstractfactory.ingredients;

public class SheepMilkCheese implements Cheese{

    private final String NAME = "Sheep Milk Cheese";

    @Override
    public String toString() {
        return NAME;
    }
}
