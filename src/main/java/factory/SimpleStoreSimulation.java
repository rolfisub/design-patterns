package factory;

import factory.simple.PizzaStore;
import factory.simple.PizzaType;
import factory.simple.SimplePizzaFactory;

public class SimpleStoreSimulation {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        pizzaStore.orderPizza(PizzaType.Chesse);
        System.out.println("------------------");
        pizzaStore.orderPizza(PizzaType.Veggie);
    }
}
