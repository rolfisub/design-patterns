package observer.screens;

import observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

abstract public class AbstractScreenObserver implements DisplayElement, Observer {
    protected float temperature, humidity, pressure;
    protected Observable weatherData;

    public AbstractScreenObserver(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            processData();
            display();
        }
    }

    abstract public void processData();

    abstract public void display();

}
