package BridgePattern.impl.views;

import BridgePattern.interfaces.IResource;
import BridgePattern.interfaces.View;

public class ShortFormView extends View {
    public ShortFormView(IResource resource) {
        super(resource);
    }

    @Override
    public void show() {
        System.out.println("SHORT FORM VIEW");
        System.out.println(this.resource.getTitle());
        System.out.println("----------\n");
    }
}
