package abstractfactory.ingredients;

public class Mushroom implements Veggies{

    private final String NAME = "Mushroom";

    @Override
    public String toString() {
        return NAME;
    }
}
