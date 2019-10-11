package factory.simple;

import factory.simple.pizzas.Pizza;
import factory.simple.pizzas.PizzaType;

public interface Store {
    public Pizza orderPizza(PizzaType type);
}
