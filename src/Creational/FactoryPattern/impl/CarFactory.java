package Creational.FactoryPattern.impl;

import Creational.FactoryPattern.interfaces.IVehicle;
import Creational.FactoryPattern.interfaces.IVehicleFactory;

public class CarFactory implements IVehicleFactory {
    @Override
    public IVehicle createVehicle() {
        return new Car();
    }
}
