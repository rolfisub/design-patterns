package observer;

public interface Subject {
    public void addObserver(WeatherObserver o);
    public void removeObserver(WeatherObserver o);
    public void notifyObservers();
}
