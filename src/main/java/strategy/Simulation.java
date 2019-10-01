package strategy;

import strategy.duck.*;

public class Simulation {

    static Duck[] ducks;

    static void runSimulation() {
        ducks = new Duck[] {
            new MantleDuck(),
            new RubberDuck(),
            new SimpleDuck(),
            new DecoyDuck()
        };

        for( Duck d: ducks) {
            d.display();
            d.doQuack();
            d.doFly();
            d.swim();
            System.out.println("-------------------------");
        }

    }
}
