package Behavioral.ObserverPattern.impl;

import Behavioral.ObserverPattern.interfaces.IObserver;

public class KitchenDisplay implements IObserver {
    private WeatherStation station;
    private int temperature;

    public KitchenDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        this.temperature = this.station.getTemperature();
        this.display();
    }

    private void display() {
        System.out.println("KitchenDisplay | The current temperature is " + this.temperature + " C degrees.");
    }
}
