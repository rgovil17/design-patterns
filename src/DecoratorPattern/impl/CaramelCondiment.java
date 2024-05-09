package DecoratorPattern.impl;

import DecoratorPattern.interfaces.IBeverage;
import DecoratorPattern.interfaces.ICondimentDecorator;

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
