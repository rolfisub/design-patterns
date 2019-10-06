package observer.screens;

import java.util.Observable;

public class CurrentConditionsScreen extends AbstractScreenObserver {

    public CurrentConditionsScreen(Observable weatherData) {
        super(weatherData);
    }

    @Override
    public void processData() {
        //do nothing
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
