package factory.simple.pizzas;

import factory.simple.Pizza;

abstract public class AbstractPizza implements Pizza {

    private String pizzaName = "Unknown";

    public AbstractPizza(String pizzaName) {
        this.setPizzaName(pizzaName);
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void prepare() {
        System.out.println("Preparing " + this.getPizzaName() + " pizza");

    }

    public void bake() {
        System.out.println("Baking " + this.getPizzaName() + " pizza");
    }

    public void cut() {
        System.out.println("Cutting " + this.getPizzaName() + " pizza");
    }

    public void box() {
        System.out.println("Boxing " + this.getPizzaName() + " pizza");
    }




}
