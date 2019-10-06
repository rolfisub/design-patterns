package observer.screens;

import java.util.Observable;

public class ForecastScreen extends AbstractScreenObserver {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastScreen(Observable weatherData) {
        super(weatherData);
    }

    @Override
    public void processData() {
        lastPressure = currentPressure;
        currentPressure = this.pressure;
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if(currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if(currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if(currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
