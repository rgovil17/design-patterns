package StatePattern.states;

import StatePattern.GateContext;
import StatePattern.interfaces.State;

public class ProcessingState implements State {
    GateContext gate;

    public ProcessingState(GateContext gate) {
        this.gate = gate;
    }

    @Override
    public void pay() {
        System.out.println("ERROR: Please wait, payment is currently processing");
    }

    @Override
    public void paySuccess() {
        System.out.println("Payment successful...");
        this.gate.changeState(new OpenState(this.gate));
    }

    @Override
    public void payFail() {
        System.out.println("Payment failed...");
        this.gate.changeState(new ClosedState(this.gate));
    }

    @Override
    public void enter() {
        System.out.println("ERROR: Please wait, payment is currently processing");
    }
}
