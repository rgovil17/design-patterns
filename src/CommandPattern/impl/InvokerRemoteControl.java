package CommandPattern.impl;

import CommandPattern.interfaces.ICommand;

public class InvokerRemoteControl {
    // Remote Control with three slots and an undo button
    ICommand command1;
    ICommand command2;
    ICommand command3;
    ICommand undoCommand;

    public InvokerRemoteControl() {}

    public void setCommand1(ICommand command1) {
        this.command1 = command1;
    }

    public void setCommand2(ICommand command2) {
        this.command2 = command2;
    }

    public void setCommand3(ICommand command3) {
        this.command3 = command3;
    }

    public void buttonOnePressed() {
        this.command1.execute();
        this.undoCommand = this.command1;
    }

    public void buttonTwoPressed() {
        this.command2.execute();
        this.undoCommand = this.command2;
    }

    public void buttonThreePressed() {
        this.command3.execute();
        this.undoCommand = this.command3;
    }

    public void undoButtonPushed() {
        this.undoCommand.unexecute();
    }
}
