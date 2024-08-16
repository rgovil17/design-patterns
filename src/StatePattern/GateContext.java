package StatePattern;

import StatePattern.interfaces.State;
import StatePattern.states.ClosedState;

public class GateContext {
    private State currentState;

    public GateContext() {
        this.currentState = new ClosedState(this);
    }

    public GateContext(State currentState) {
        this.currentState = currentState;
    }

    public void pay() {
        this.currentState.pay();
    }

    public void paySuccess() {
        this.currentState.paySuccess();
    }

    public void payFail() {
        this.currentState.payFail();
    }

    public void enter() {
        this.currentState.enter();
    }

    public void changeState(State newState) {
        this.currentState = newState;
    }
}
