package factory.simple;

import factory.simple.pizzas.CheesePizza;
import factory.simple.pizzas.ClamPizza;
import factory.simple.pizzas.PepperoniPizza;
import factory.simple.pizzas.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        if(type.equals(PizzaType.Chesse)) {
            pizza = new CheesePizza();
        } else if(type.equals(PizzaType.Pepperoni)) {
            pizza = new PepperoniPizza();
        } else if( type.equals(PizzaType.Clam)) {
            pizza = new ClamPizza();
        } else if(type.equals(PizzaType.Veggie)) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
