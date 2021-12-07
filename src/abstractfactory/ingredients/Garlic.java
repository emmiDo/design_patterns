package abstractfactory.ingredients;

public class Garlic implements Veggies{

    private final String NAME = "Garlic";

    @Override
    public String toString() {
        return NAME;
    }
}
