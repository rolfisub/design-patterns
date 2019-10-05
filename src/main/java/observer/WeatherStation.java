package observer;

import observer.screens.CurrentConditionsScreen;
import observer.screens.ForecastScreen;
import observer.screens.HeatIndexScreen;
import observer.screens.StatisticsScreen;

public class WeatherStation {
    public WeatherStation() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsScreen currentConditionsScreen = new CurrentConditionsScreen(weatherData);
        ForecastScreen forecastScreen = new ForecastScreen(weatherData);
        StatisticsScreen statisticsScreen = new StatisticsScreen(weatherData);
        HeatIndexScreen heatIndexScreen = new HeatIndexScreen(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
