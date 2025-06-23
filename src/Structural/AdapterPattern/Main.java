package Structural.AdapterPattern;

import Structural.AdapterPattern.impl.Adapter;
import Structural.AdapterPattern.impl.ConcreteTarget;
import Structural.AdapterPattern.interfaces.ITarget;

public class Main {
    public static void main(String[] args) {
        ITarget target;

        // Legacy implementation
        target = new ConcreteTarget();
        target.request();

        // New implementation
        target = new Adapter(new Adaptee());
        target.request();
    }
}
