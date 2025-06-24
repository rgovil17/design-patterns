package Behavioral.StrategyPattern.impl.quackStrategies;

import Behavioral.StrategyPattern.interfaces.IQuackStrategy;

public class YesQuackStrategy implements IQuackStrategy {

    @Override
    public void quack() {
        System.out.println("Quack quack quack!");
    }
}
