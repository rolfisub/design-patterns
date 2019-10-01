package strategy.duck.behaviour.fly;

import strategy.duck.behaviour.FlyBehaviour;

public class FlyFast implements FlyBehaviour {
    public void fly() {
        System.out.println("I can fly really fast!");
    }
}
