package Structural.DecoratorPattern;

import Structural.DecoratorPattern.impl.CaramelCondiment;
import Structural.DecoratorPattern.impl.EspressoBeverage;
import Structural.DecoratorPattern.impl.MochaCondiment;
import Structural.DecoratorPattern.interfaces.IBeverage;

public class Main {

    public static void main(String[] args) {
        IBeverage beverage = new EspressoBeverage();
        System.out.print(beverage.getDescription() + ": ");
        System.out.println(beverage.cost());

        IBeverage beverage2 = new EspressoBeverage();
        beverage2 = new CaramelCondiment(beverage2);
        beverage2 = new CaramelCondiment(beverage2);
        beverage2 = new MochaCondiment(beverage2);
        System.out.print(beverage2.getDescription() + ": ");
        System.out.println(beverage2.cost());
    }

}
