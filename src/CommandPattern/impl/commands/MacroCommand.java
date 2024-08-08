package CommandPattern.impl.commands;

import CommandPattern.interfaces.ICommand;

public class MacroCommand implements ICommand {
    ICommand[] commands;

    public MacroCommand(ICommand[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (ICommand command : this.commands) {
            command.execute();
        }
    }

    @Override
    public void unexecute() {
        for (ICommand command : this.commands) {
            command.unexecute();
        }
    }
}
