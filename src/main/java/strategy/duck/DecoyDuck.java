package strategy.duck;

import strategy.duck.behaviour.fly.FlyNull;
import strategy.duck.behaviour.quack.QuackNull;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.setFlyBehaviour(new FlyNull());
        this.setQuackBehaviour(new QuackNull());
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy I should just stay still.");
    }

}
