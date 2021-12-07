package abstractfactory.ingredients;

public class SmokedPepperoni implements Pepperoni{

    private final String NAME = "Smoked Pepperoni";

    @Override
    public String toString() {
        return NAME;
    }
}
