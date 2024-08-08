package CommandPattern.impl.commands;

import CommandPattern.impl.receivers.HotTubReceiver;
import CommandPattern.interfaces.ICommand;

public class HotTubStartCommand implements ICommand {
    HotTubReceiver hotTub;

    public HotTubStartCommand(HotTubReceiver hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        this.hotTub.start();
    }

    @Override
    public void unexecute() {
        this.hotTub.stop();
    }
}
