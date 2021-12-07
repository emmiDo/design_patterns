package abstractfactory.ingredients;

public class Tomato implements Veggies{

    private final String NAME = "Tomato";

    @Override
    public String toString() {
        return NAME;
    }
}
