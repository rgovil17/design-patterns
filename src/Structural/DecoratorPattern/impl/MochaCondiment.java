package Structural.DecoratorPattern.impl;

import Structural.DecoratorPattern.interfaces.IBeverage;
import Structural.DecoratorPattern.interfaces.ICondimentDecorator;

public class MochaCondiment implements ICondimentDecorator {
    private IBeverage beverage;

    public MochaCondiment(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public int cost() {
        return 5 + this.beverage.cost();
    }
}
