package Behavioral.CommandPattern.impl;

import Behavioral.CommandPattern.interfaces.ICommand;

import java.util.Stack;

public class InvokerRemoteControl {
    private ICommand currentCommand;
    private Stack<ICommand> history = new Stack<>();

    public void setCommand(ICommand command) {
        this.currentCommand = command;
    }

    public void press() {
        if (currentCommand != null) {
            currentCommand.execute();
            history.push(currentCommand);
        } else {
            System.out.println("No command assigned.");
        }
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            ICommand lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
