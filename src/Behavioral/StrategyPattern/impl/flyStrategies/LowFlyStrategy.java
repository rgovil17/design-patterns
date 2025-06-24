package Behavioral.StrategyPattern.impl.flyStrategies;

import Behavioral.StrategyPattern.interfaces.IFlyStrategy;

public class LowFlyStrategy implements IFlyStrategy {

    @Override
    public void fly() {
        System.out.println("I fly low!");
    }
}
