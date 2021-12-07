package observer.observers;

import observer.DisplayElement;
import observer.subject.WeatherData;

public class StatisticDisplay implements Observer, DisplayElement {

    private float max;
    private float min = 80;
    private float totalTemp;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Min:" + min + ", Max:" + max + ", Avg:" + totalTemp/numReadings);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.totalTemp += temperature;
        numReadings++;

        if (temperature < min)
            min = temperature;

        if (temperature > max)
            max = temperature;

        display();
    }
}
