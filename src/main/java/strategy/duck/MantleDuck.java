package strategy.duck;

import strategy.duck.behaviour.fly.FlyFast;
import strategy.duck.behaviour.quack.Quack;

public class MantleDuck extends Duck {

    public MantleDuck() {
        this.setFlyBehaviour(new FlyFast());
        this.setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Hi there I'm a Mantle Duck!");
    }
}
