package strategy.duck;

import strategy.duck.behaviour.fly.FlyNull;
import strategy.duck.behaviour.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.setFlyBehaviour(new FlyNull());
        this.setQuackBehaviour(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm A Rubber Duck!");
    }
}
