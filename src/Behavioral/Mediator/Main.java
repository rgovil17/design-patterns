package Behavioral.Mediator;

import Behavioral.Mediator.impl.component.Button;
import Behavioral.Mediator.impl.component.Label;
import Behavioral.Mediator.impl.component.TextField;
import Behavioral.Mediator.impl.mediator.FormMediator;

public class Main {
    public static void main(String[] args) {
        FormMediator mediator = new FormMediator();

        TextField usernameField = new TextField(mediator);
        TextField passwordField = new TextField(mediator);
        Button loginButton = new Button(mediator);
        Label statusLabel = new Label(mediator);

        mediator.setUsernameField(usernameField);
        mediator.setPasswordField(passwordField);
        mediator.setLoginButton(loginButton);
        mediator.setStatusLabel(statusLabel);

        // Simulate user interaction
        usernameField.setText("admin");
        passwordField.setText("1234");
        loginButton.click();

        System.out.println("\n==== NEW ATTEMPT ====");
        passwordField.setText("wrong");
        loginButton.click();
    }
}
