package strategy.duck.behaviour.quack;

import strategy.duck.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    public void quack() {
        System.out.println("Squeaaaak!");
    }
}
