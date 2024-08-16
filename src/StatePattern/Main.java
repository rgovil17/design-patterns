package StatePattern;

public class Main {
    public static void main(String[] args) {
        GateContext gate = new GateContext();

        // Round 1
        gate.enter();
        gate.pay();
        gate.enter();
        gate.paySuccess();
        gate.enter();

        System.out.println("\n=============\n");

        // Round 2
        gate.enter();
        gate.pay();
        gate.enter();
        gate.payFail();
        gate.enter();
    }
}
