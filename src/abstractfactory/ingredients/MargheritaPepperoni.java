package abstractfactory.ingredients;

public class MargheritaPepperoni implements Pepperoni{

    private final String NAME = "Margherita Pepperoni";

    @Override
    public String toString() {
        return NAME;
    }
}
