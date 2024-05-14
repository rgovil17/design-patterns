package FactoryPattern.impl;

import FactoryPattern.interfaces.IVehicle;
import FactoryPattern.interfaces.IVehicleFactory;

public class BikeFactory implements IVehicleFactory {
    @Override
    public IVehicle createVehicle() {
        return new Bike();
    }
}
