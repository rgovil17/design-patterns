package DecoratorPattern.impl;

import DecoratorPattern.interfaces.IBeverage;
import DecoratorPattern.interfaces.ICondimentDecorator;

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
