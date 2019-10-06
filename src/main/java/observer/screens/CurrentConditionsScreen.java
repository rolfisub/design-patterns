package observer.screens;

import observer.Subject;

public class CurrentConditionsScreen extends AbstractScreenObserver {

    public CurrentConditionsScreen(Subject weatherData) {
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
