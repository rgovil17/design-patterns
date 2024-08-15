package CompositePattern.impl;

import CompositePattern.interfaces.Component;

public class Leaf implements Component {
    private String title;

    public Leaf(String title) {
        this.title = title;
    }

    @Override
    public String operation() {
        return this.title + "\n";
    }
}
