package abstractfactory.ingredients;

public class ThinCrustDough implements Dough{

    private final String NAME = "Thin Crust Dough";

    @Override
    public String toString() {
        return NAME;
    }
}
