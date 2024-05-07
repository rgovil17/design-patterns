package StrategyPattern.impl.flyStrategies;

import StrategyPattern.interfaces.IFlyStrategy;

public class HighFlyStrategy implements IFlyStrategy {

    @Override
    public void fly() {
        System.out.println("I fly high!");
    }
}
