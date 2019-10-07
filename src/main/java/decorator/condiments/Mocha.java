package decorator.condiments;

import decorator.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        return this.beverage.cost() + .20f;
    }
}
