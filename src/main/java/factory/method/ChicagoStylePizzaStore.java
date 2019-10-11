package factory.method;

import factory.method.pizzas.ChicagoStyle.ChicagoStyleCheese;
import factory.method.pizzas.ChicagoStyle.ChicagoStyleClam;
import factory.method.pizzas.ChicagoStyle.ChicagoStylePepperoni;
import factory.method.pizzas.ChicagoStyle.ChicagoStyleVeggie;
import factory.simple.pizzas.Pizza;
import factory.simple.pizzas.PizzaType;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        if(type.equals(PizzaType.Chesse)) {
            pizza = new ChicagoStyleCheese();
        } else if(type.equals(PizzaType.Pepperoni)) {
            pizza = new ChicagoStylePepperoni();
        } else if( type.equals(PizzaType.Clam)) {
            pizza = new ChicagoStyleClam();
        } else if(type.equals(PizzaType.Veggie)) {
            pizza = new ChicagoStyleVeggie();
        }

        return pizza;
    }
}
