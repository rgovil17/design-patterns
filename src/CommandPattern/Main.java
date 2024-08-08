package CommandPattern;

import CommandPattern.impl.InvokerRemoteControl;
import CommandPattern.impl.commands.HotTubStartCommand;
import CommandPattern.impl.commands.LightOnCommand;
import CommandPattern.impl.commands.MacroCommand;
import CommandPattern.impl.receivers.HotTubReceiver;
import CommandPattern.impl.receivers.LightReceiver;
import CommandPattern.interfaces.ICommand;

public class Main {
    public static void main(String[] args) {
        // Appliances in our home
        LightReceiver light = new LightReceiver();
        HotTubReceiver hotTub = new HotTubReceiver();

        // Creating command objects
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        HotTubStartCommand hotTubStartCommand = new HotTubStartCommand(hotTub);

        // Creating Macro command
        ICommand[] commands = {lightOnCommand, hotTubStartCommand};
        MacroCommand macroCommand = new MacroCommand(commands);

        // Invoker object
        InvokerRemoteControl remoteControl = new InvokerRemoteControl();

        // Setting commands for our remote control (e.g. using an app)
        remoteControl.setCommand1(lightOnCommand);
        remoteControl.setCommand2(hotTubStartCommand);
        remoteControl.setCommand3(macroCommand);

        // Using the buttons
        remoteControl.buttonOnePressed();
        remoteControl.buttonTwoPressed();
        remoteControl.undoButtonPushed();

        remoteControl.buttonOnePressed();
        remoteControl.undoButtonPushed();

        System.out.println("============");

        // Using macro command
        remoteControl.buttonThreePressed();
        remoteControl.undoButtonPushed();
    }
}
