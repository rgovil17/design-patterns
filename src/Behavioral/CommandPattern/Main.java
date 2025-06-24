package Behavioral.CommandPattern;

import Behavioral.CommandPattern.impl.InvokerRemoteControl;
import Behavioral.CommandPattern.impl.commands.LightOffCommand;
import Behavioral.CommandPattern.impl.commands.SetTemperatureCommand;
import Behavioral.CommandPattern.impl.commands.LightOnCommand;
import Behavioral.CommandPattern.impl.receivers.ThermostatReceiver;
import Behavioral.CommandPattern.impl.receivers.LightReceiver;
import Behavioral.CommandPattern.interfaces.ICommand;

public class Main {
    public static void main(String[] args) {
        // Appliances in our home
        LightReceiver light = new LightReceiver();
        ThermostatReceiver thermostat = new ThermostatReceiver();

        // Creating command objects
        ICommand lightOn = new LightOnCommand(light);
        ICommand lightOff = new LightOffCommand(light);
        ICommand setTemp22 = new SetTemperatureCommand(thermostat, 22);

        // Invoker object
        InvokerRemoteControl remoteControl = new InvokerRemoteControl();

        // Simulate usage
        remoteControl.setCommand(lightOn);
        remoteControl.press();

        remoteControl.setCommand(setTemp22);
        remoteControl.press();

        remoteControl.setCommand(lightOff);
        remoteControl.press();

        System.out.println("============");

        remoteControl.undoLast();
        remoteControl.undoLast();
        remoteControl.undoLast();
    }
}
