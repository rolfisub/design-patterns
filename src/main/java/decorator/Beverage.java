package decorator;

public abstract class Beverage {
    public String getDescription() {
        return "Unknown Beverage";
    }

    public abstract float cost();
}
