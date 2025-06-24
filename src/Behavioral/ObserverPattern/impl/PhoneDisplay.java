package Behavioral.ObserverPattern.impl;

import Behavioral.ObserverPattern.interfaces.IObserver;

public class PhoneDisplay implements IObserver {
    private WeatherStation station;
    private int temperature;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        this.temperature = this.station.getTemperature();
        this.display();
    }

    private void display() {
        System.out.println("PhoneDisplay | The current temperature is " + this.temperature + " C degrees.");
    }
}
