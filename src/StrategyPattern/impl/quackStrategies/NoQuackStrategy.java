package StrategyPattern.impl.quackStrategies;

import StrategyPattern.interfaces.IQuackStrategy;

public class NoQuackStrategy implements IQuackStrategy {

    @Override
    public void quack() {
        System.out.println("I don't quack! :(");
    }
}
