package observer.screens;

import observer.Subject;
import observer.WeatherObserver;

abstract public class AbstractScreenObserver implements DisplayElement, WeatherObserver {
    protected float temperature, humidity, pressure;
    protected Subject weatherData;

    public AbstractScreenObserver(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        processData();
        display();
    }

    abstract public void processData();

    abstract public void display();

}
