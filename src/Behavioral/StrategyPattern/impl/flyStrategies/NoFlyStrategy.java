package Behavioral.StrategyPattern.impl.flyStrategies;

import Behavioral.StrategyPattern.interfaces.IFlyStrategy;

public class NoFlyStrategy implements IFlyStrategy {

    @Override
    public void fly() {
        System.out.println("I don't fly! :(");
    }
}
