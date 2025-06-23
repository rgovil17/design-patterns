package Structural.AdapterPattern.impl;

import Structural.AdapterPattern.interfaces.ITarget;

public class ConcreteTarget implements ITarget {

    @Override
    public void request() {
        System.out.println("I am the old request!");
    }
}
