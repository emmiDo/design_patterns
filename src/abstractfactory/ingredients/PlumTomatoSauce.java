package abstractfactory.ingredients;

public class PlumTomatoSauce implements Sauce{

    private final String NAME = "Plum Tomato Sauce";

    @Override
    public String toString() {
        return NAME;
    }
}
