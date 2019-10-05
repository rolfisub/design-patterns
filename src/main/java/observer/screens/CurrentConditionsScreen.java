package observer.screens;

import observer.Subject;

public class CurrentConditionsScreen extends AbstractScreen {

    public CurrentConditionsScreen(Subject weatherData) {
        super(weatherData);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
