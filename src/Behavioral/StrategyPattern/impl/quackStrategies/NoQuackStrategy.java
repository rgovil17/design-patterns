package Behavioral.StrategyPattern.impl.quackStrategies;

import Behavioral.StrategyPattern.interfaces.IQuackStrategy;

public class NoQuackStrategy implements IQuackStrategy {

    @Override
    public void quack() {
        System.out.println("I don't quack! :(");
    }
}
