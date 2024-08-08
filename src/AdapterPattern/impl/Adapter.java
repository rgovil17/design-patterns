package AdapterPattern.impl;

import AdapterPattern.Adaptee;
import AdapterPattern.interfaces.ITarget;

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
