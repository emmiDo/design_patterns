package abstractfactory.ingredients;

public class ThickCrustDough implements Dough{

    private final String NAME = "Thick Crust Dough";

    @Override
    public String toString() {
        return NAME;
    }
}
