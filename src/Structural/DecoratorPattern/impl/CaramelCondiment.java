package Structural.DecoratorPattern.impl;

import Structural.DecoratorPattern.interfaces.IBeverage;
import Structural.DecoratorPattern.interfaces.ICondimentDecorator;

public class CaramelCondiment implements ICondimentDecorator {
    private IBeverage beverage;

    public CaramelCondiment(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Caramel";
    }

    @Override
    public int cost() {
        return 2 + this.beverage.cost();
    }
}
