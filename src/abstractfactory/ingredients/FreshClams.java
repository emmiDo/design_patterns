package abstractfactory.ingredients;

public class FreshClams implements Clams {

    private final String NAME = "Fresh Clams";

    @Override
    public String toString() {
        return NAME;
    }
}
