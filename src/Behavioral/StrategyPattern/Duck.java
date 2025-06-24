package Behavioral.StrategyPattern;

import Behavioral.StrategyPattern.interfaces.IFlyStrategy;
import Behavioral.StrategyPattern.interfaces.IQuackStrategy;

public class Duck {
    private IFlyStrategy fs;
    private IQuackStrategy qs;

    public Duck(IFlyStrategy fs, IQuackStrategy qs) {
        this.fs = fs;
        this.qs = qs;
    }

    public void fly() {
        this.fs.fly();
    }

    public void quack() {
        this.qs.quack();
    }
}
