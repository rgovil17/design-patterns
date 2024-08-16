package StatePattern.states;

import StatePattern.GateContext;
import StatePattern.interfaces.State;

public class ClosedState implements State {
    GateContext gate;

    public ClosedState(GateContext gate) {
        this.gate = gate;
    }

    @Override
    public void pay() {
        System.out.println("Processing payment...");
        this.gate.changeState(new ProcessingState(this.gate));
    }

    @Override
    public void paySuccess() {
        System.out.println("ERROR: Gate is closed");
    }

    @Override
    public void payFail() {
        System.out.println("ERROR: Gate is closed");
    }

    @Override
    public void enter() {
        System.out.println("ERROR: Gate is closed");
    }
}
