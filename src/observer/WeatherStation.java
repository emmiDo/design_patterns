package observer;

import observer.observers.CurrentConditions;
import observer.observers.ForecastDisplay;
import observer.observers.StatisticDisplay;
import observer.observers.ThirdPartyDisplay;
import observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentDisplay = new CurrentConditions(weatherData);
        StatisticDisplay statisticsDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        weatherData.setMeasurements(70, 69, 34f);
        weatherData.setMeasurements(69, 80, 28.5f);
        weatherData.setMeasurements(88, 90, 28.4f);

        weatherData.removeObserver(thirdPartyDisplay);
        weatherData.setMeasurements(59, 87, 30f);
    }

}
