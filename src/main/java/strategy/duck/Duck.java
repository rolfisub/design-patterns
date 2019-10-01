package strategy.duck;

import strategy.duck.behaviour.FlyBehaviour;
import strategy.duck.behaviour.QuackBehaviour;

public abstract class Duck {

    public abstract void display();

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void doFly() {
        flyBehaviour.fly();
    }
    public void doQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("I swim, all duck swim!");
    }
}

