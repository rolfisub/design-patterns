package strategy.duck;

import strategy.duck.behaviour.fly.FlyNormal;
import strategy.duck.behaviour.quack.Quack;

public class SimpleDuck extends Duck {

    public SimpleDuck() {
        this.setFlyBehaviour(new FlyNormal());
        this.setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a simple simple Duck");
    }
}
