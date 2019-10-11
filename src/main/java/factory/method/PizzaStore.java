package factory.method;

import factory.simple.Store;
import factory.simple.pizzas.Pizza;
import factory.simple.pizzas.PizzaType;

public abstract class PizzaStore implements Store {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(PizzaType type);
}
