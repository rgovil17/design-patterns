package FactoryPattern.impl;

import FactoryPattern.interfaces.IVehicle;
import FactoryPattern.interfaces.IVehicleFactory;

public class CarFactory implements IVehicleFactory {
    @Override
    public IVehicle createVehicle() {
        return new Car();
    }
}
