package decorator.condiments;

import decorator.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) { super(beverage);}

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public float cost() {
        return this.beverage.cost() + .3f;
    }
}
