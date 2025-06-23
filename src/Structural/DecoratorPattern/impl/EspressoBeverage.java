package Structural.DecoratorPattern.impl;

import Structural.DecoratorPattern.interfaces.IBeverage;

public class EspressoBeverage implements IBeverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public int cost() {
        return 50;
    }
}
