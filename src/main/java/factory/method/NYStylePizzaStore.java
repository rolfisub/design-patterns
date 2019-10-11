package factory.method;

import factory.method.pizzas.NYStyle.NYStyleCheese;
import factory.method.pizzas.NYStyle.NYStyleClam;
import factory.method.pizzas.NYStyle.NYStylePepperoni;
import factory.method.pizzas.NYStyle.NYStyleVeggie;
import factory.simple.pizzas.*;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        if(type.equals(PizzaType.Chesse)) {
            pizza = new NYStyleCheese();
        } else if(type.equals(PizzaType.Pepperoni)) {
            pizza = new NYStylePepperoni();
        } else if( type.equals(PizzaType.Clam)) {
            pizza = new NYStyleClam();
        } else if(type.equals(PizzaType.Veggie)) {
            pizza = new NYStyleVeggie();
        }

        return pizza;
    }
}
