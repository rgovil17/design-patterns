package Structural.AdapterPattern.impl;

import Structural.AdapterPattern.Adaptee;
import Structural.AdapterPattern.interfaces.ITarget;

public class Adapter implements ITarget {
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
