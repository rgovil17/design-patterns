package CompositePattern.impl;

import CompositePattern.interfaces.Component;

import java.util.List;

public class Composite implements Component {
    private String title;
    List<Component> componentList;

    public Composite(String title, List<Component> componentList) {
        this.title = title;
        this.componentList = componentList;
    }

    @Override
    public String operation() {
        StringBuilder result = new StringBuilder();
        result.append(this.title);
        result.append("\n");
        for (Component component: this.componentList) {
            result.append(component.operation());
        }
        result.append("\n");
        return result.toString();
    }
}
