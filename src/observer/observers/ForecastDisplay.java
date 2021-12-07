package observer.observers;

import observer.DisplayElement;
import observer.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("It's going to be a nice day");
        } else if (currentPressure == lastPressure) {
            System.out.println("No change");
        } else if (currentPressure < lastPressure) {
            System.out.println("Rainy weather");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;

        display();
    }
}
