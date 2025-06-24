package Behavioral.CommandPattern.impl.commands;

import Behavioral.CommandPattern.impl.receivers.LightReceiver;
import Behavioral.CommandPattern.interfaces.ICommand;

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
    public void undo() {
        this.light.off();
    }
}
