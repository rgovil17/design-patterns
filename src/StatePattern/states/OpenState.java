package StatePattern.states;

import StatePattern.GateContext;
import StatePattern.interfaces.State;

public class OpenState implements State {
    GateContext gate;

    public OpenState(GateContext gate) {
        this.gate = gate;
    }

    @Override
    public void pay() {
        System.out.println("ERROR: Gate is already open");
    }

    @Override
    public void paySuccess() {
        System.out.println("ERROR: Gate is already open");
    }

    @Override
    public void payFail() {
        System.out.println("ERROR: Gate is already open");
    }

    @Override
    public void enter() {
        System.out.println("Please enter...");
        this.gate.changeState(new ClosedState(this.gate));
    }
}
