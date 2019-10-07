package decorator;

import static org.junit.Assert.assertEquals;

import decorator.condiments.Mocha;
import decorator.condiments.Whip;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test() {
        Beverage b = new DarkRoast();

        b = new Mocha(b);
        b = new Whip(b);

        float totalCost = b.cost();

        System.out.print(b.getDescription() + ": ");
        System.out.println(totalCost);

        assertEquals((0.5f + 0.2f + 0.3f),totalCost, 0.1);
    }
}
