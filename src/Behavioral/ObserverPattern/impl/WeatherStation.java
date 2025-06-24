package Behavioral.ObserverPattern.impl;

import Behavioral.ObserverPattern.interfaces.IObserver;
import Behavioral.ObserverPattern.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ISubject {
    private List<IObserver> observerList;
    private int temperature;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int index = this.observerList.indexOf(observer);
        if (index >= 0) {
            this.observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer: this.observerList) {
            observer.update();
        }
        System.out.println("------");
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }
}
