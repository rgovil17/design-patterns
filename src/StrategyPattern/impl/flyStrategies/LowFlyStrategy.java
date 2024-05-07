package StrategyPattern.impl.flyStrategies;

import StrategyPattern.interfaces.IFlyStrategy;

public class LowFlyStrategy implements IFlyStrategy {

    @Override
    public void fly() {
        System.out.println("I fly low!");
    }
}
