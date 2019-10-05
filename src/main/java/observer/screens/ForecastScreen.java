package observer.screens;

import observer.Subject;

public class ForecastScreen extends AbstractScreen {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastScreen(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        super.update(temperature, humidity, pressure);
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
