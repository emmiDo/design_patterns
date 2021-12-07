package abstractfactory.ingredients;

public class MarinaraSauce implements Sauce{

    private final String NAME = "Marinara Sauce";

    @Override
    public String toString() {
        return NAME;
    }
}
