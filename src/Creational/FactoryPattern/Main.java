package Creational.FactoryPattern;

import Creational.FactoryPattern.impl.BikeFactory;
import Creational.FactoryPattern.impl.CarFactory;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(new CarFactory());
        user1.getVehicle().display();

        User user2 = new User(new BikeFactory());
        user2.getVehicle().display();
    }
}
