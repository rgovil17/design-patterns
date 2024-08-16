package StatePattern.interfaces;

public interface State {
    void pay();
    void paySuccess();
    void payFail();
    void enter();
}
