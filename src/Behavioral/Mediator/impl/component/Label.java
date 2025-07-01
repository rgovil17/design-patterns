package Behavioral.Mediator.impl.component;

import Behavioral.Mediator.interfaces.UIComponent;
import Behavioral.Mediator.interfaces.UIMediator;

public class Label extends UIComponent {
    private String text;

    public Label(UIMediator mediator) {
        super(mediator);
    }

    public void setText(String message) {
        this.text = message;
        System.out.println("Status: " + text);
    }
}
