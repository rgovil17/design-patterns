package Behavioral.StrategyPattern.impl.flyStrategies;

import Behavioral.StrategyPattern.interfaces.IFlyStrategy;

public class HighFlyStrategy implements IFlyStrategy {

    @Override
    public void fly() {
        System.out.println("I fly high!");
    }
}
