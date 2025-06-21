package Creational.FactoryPattern.impl;

import Creational.FactoryPattern.interfaces.IVehicle;

public class Bike implements IVehicle {
    @Override
    public void display() {
        System.out.println("I am a bike!");
    }
}
