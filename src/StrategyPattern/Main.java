package StrategyPattern;

import StrategyPattern.impl.flyStrategies.HighFlyStrategy;
import StrategyPattern.impl.flyStrategies.LowFlyStrategy;
import StrategyPattern.impl.flyStrategies.NoFlyStrategy;
import StrategyPattern.impl.quackStrategies.NoQuackStrategy;
import StrategyPattern.impl.quackStrategies.YesQuackStrategy;

public class Main {
    public static void main(String[] args) {
        Duck cityDuck = new Duck(new HighFlyStrategy(), new YesQuackStrategy());
        cityDuck.fly();
        cityDuck.quack();
        System.out.println("--------");

        Duck wildDuck = new Duck(new LowFlyStrategy(), new YesQuackStrategy());
        wildDuck.fly();
        wildDuck.quack();
        System.out.println("--------");

        Duck mountainDuck = new Duck(new LowFlyStrategy(), new NoQuackStrategy());
        mountainDuck.fly();
        mountainDuck.quack();
        System.out.println("--------");

        Duck rubberDuck = new Duck(new NoFlyStrategy(), new YesQuackStrategy());
        rubberDuck.fly();
        rubberDuck.quack();
        System.out.println("--------");
    }
}
