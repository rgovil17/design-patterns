package AdapterPattern;

import AdapterPattern.impl.Adapter;
import AdapterPattern.impl.ConcreteTarget;
import AdapterPattern.interfaces.ITarget;

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
