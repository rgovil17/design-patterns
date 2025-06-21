package Creational.FactoryPattern;

import Creational.FactoryPattern.interfaces.IVehicle;
import Creational.FactoryPattern.interfaces.IVehicleFactory;

public class User {
    private IVehicle vehicle;

    public User(IVehicleFactory factory) {
        this.vehicle = factory.createVehicle();
    }

    public IVehicle getVehicle() {
        return this.vehicle;
    }
}
