package Behavioral.CommandPattern.impl.commands;

import Behavioral.CommandPattern.impl.receivers.LightReceiver;
import Behavioral.CommandPattern.interfaces.ICommand;

public class LightOffCommand implements ICommand {
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
