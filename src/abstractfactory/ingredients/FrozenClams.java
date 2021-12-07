package abstractfactory.ingredients;

public class FrozenClams implements Clams {

    private final String NAME = "Frozen Clams";

    @Override
    public String toString() {
        return NAME;
    }
}
