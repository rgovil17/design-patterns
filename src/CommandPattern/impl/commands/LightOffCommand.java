package CommandPattern.impl.commands;

import CommandPattern.impl.receivers.LightReceiver;
import CommandPattern.interfaces.ICommand;

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
