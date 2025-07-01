package Behavioral.Mediator.impl.component;

import Behavioral.Mediator.interfaces.UIComponent;
import Behavioral.Mediator.interfaces.UIMediator;

public class Button extends UIComponent {
    private boolean enabled = false;

    public Button(UIMediator mediator) {
        super(mediator);
    }

    public void click() {
        if (enabled) {
            System.out.println("Login button clicked!");
            notifyMediator();
        } else {
            System.out.println("Login button is disabled.");
        }
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
        System.out.println("Login button is now " + (enabled ? "ENABLED" : "DISABLED"));
    }
}
