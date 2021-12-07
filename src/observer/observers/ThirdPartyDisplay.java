package observer.observers;

import observer.DisplayElement;
import observer.subject.WeatherData;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    private boolean visibility = true;
    private float avgHumidity = 50;
    private float avgPressure = 30.20f;
    private WeatherData weatherData;

    public ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (!visibility)
            System.out.println("Visibility is too low");
        else
            System.out.println("Visibility is normal");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (pressure > avgPressure && humidity > avgHumidity)
            visibility = false;
    }
}
