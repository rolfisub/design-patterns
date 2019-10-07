package decorator;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public float cost() {
        return 0.50f;
    }
}
