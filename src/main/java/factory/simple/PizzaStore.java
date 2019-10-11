package factory.simple;

import factory.simple.pizzas.Pizza;
import factory.simple.pizzas.PizzaType;

public class PizzaStore implements Store {

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;

        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
