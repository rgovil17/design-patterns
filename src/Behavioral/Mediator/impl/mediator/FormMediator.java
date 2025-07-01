package Behavioral.Mediator.impl.mediator;

import Behavioral.Mediator.impl.component.Button;
import Behavioral.Mediator.impl.component.Label;
import Behavioral.Mediator.impl.component.TextField;
import Behavioral.Mediator.interfaces.UIComponent;
import Behavioral.Mediator.interfaces.UIMediator;

public class FormMediator implements UIMediator {
    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;
    private Label statusLabel;

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public void setPasswordField(TextField passwordField) {
        this.passwordField = passwordField;
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }

    public void setStatusLabel(Label statusLabel) {
        this.statusLabel = statusLabel;
    }

    @Override
    public void componentChanged(UIComponent component) {
        if (component == usernameField || component == passwordField) {
            boolean enableButton = !usernameField.getText().isEmpty() && !passwordField.getText().isEmpty();
            loginButton.setEnabled(enableButton);
        } else if (component == loginButton) {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if ("admin".equals(username) && "1234".equals(password)) {
                statusLabel.setText("✅ Login successful!");
            } else {
                statusLabel.setText("❌ Invalid credentials.");
            }
        }
    }
}
