package BridgePattern.interfaces;

public abstract class View {
    public IResource resource;

    public View(IResource resource) {
        this.resource = resource;
    }

    public abstract void show();
}
