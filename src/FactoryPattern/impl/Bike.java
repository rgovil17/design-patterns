package FactoryPattern.impl;

import FactoryPattern.interfaces.IVehicle;

public class Bike implements IVehicle {
    @Override
    public void display() {
        System.out.println("I am a bike!");
    }
}
