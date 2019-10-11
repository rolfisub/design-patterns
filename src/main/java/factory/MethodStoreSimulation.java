package factory;

import factory.method.ChicagoStylePizzaStore;
import factory.method.NYStylePizzaStore;
import factory.method.PizzaStore;
import factory.simple.pizzas.PizzaType;

public class MethodStoreSimulation {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();


        nyPizzaStore.orderPizza(PizzaType.Chesse);
        System.out.println("------------------");
        chicagoPizzaStore.orderPizza(PizzaType.Veggie);
    }
}
