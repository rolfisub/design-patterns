package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<WeatherObserver> observers;
    private float temperature, humidity, pressure;

    public WeatherData() {
        observers = new ArrayList<WeatherObserver>();
    }

    public void addObserver(WeatherObserver o) {
        observers.add(o);
    }

    public void removeObserver(WeatherObserver o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (WeatherObserver observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }



}
