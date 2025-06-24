package Behavioral.CommandPattern.impl.commands;

import Behavioral.CommandPattern.impl.receivers.ThermostatReceiver;
import Behavioral.CommandPattern.interfaces.ICommand;

public class SetTemperatureCommand implements ICommand {
    ThermostatReceiver thermostat;
    int newTemperature;
    int previousTemperature;

    public SetTemperatureCommand(ThermostatReceiver thermostat, int temperature) {
        this.thermostat = thermostat;
        this.newTemperature = temperature;
    }

    @Override
    public void execute() {
        previousTemperature = this.thermostat.getCurrentTemperature();
        this.thermostat.setTemperature(newTemperature);
    }

    @Override
    public void undo() {
        this.thermostat.setTemperature(previousTemperature);
    }
}
