package CommandPattern.impl.commands;

import CommandPattern.impl.receivers.LightReceiver;
import CommandPattern.interfaces.ICommand;

public class LightOnCommand implements ICommand {
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void unexecute() {
        this.light.off();
    }
}
