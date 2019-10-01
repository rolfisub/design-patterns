package strategy.duck.behaviour.fly;

import strategy.duck.behaviour.FlyBehaviour;

public class FlyNormal implements FlyBehaviour {
    public void fly() {
        System.out.println("I can fly normally!");
    }
}
