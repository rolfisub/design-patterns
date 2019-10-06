package observer.screens;

import java.util.Observable;

public class StatisticsScreen extends AbstractScreenObserver {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public StatisticsScreen(Observable weatherData) {
        super(weatherData);
    }

    @Override
    public void processData() {
        tempSum += this.temperature;
        numReadings++;

        if (this.temperature > maxTemp) {
            maxTemp = this.temperature;
        }

        if (this.temperature < minTemp) {
            minTemp = this.temperature;
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
