package Behavioral.Mediator.impl.component;

import Behavioral.Mediator.interfaces.UIComponent;
import Behavioral.Mediator.interfaces.UIMediator;

public class TextField extends UIComponent {
    private String text = "";

    public TextField(UIMediator mediator) {
        super(mediator);
    }

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        this.text = newText;
        System.out.println("TextField updated: " + newText);
        notifyMediator();
    }
}
