package Structural.BridgePattern.impl.views;

import Structural.BridgePattern.interfaces.IResource;
import Structural.BridgePattern.interfaces.View;

public class LongFormView extends View {
    public LongFormView(IResource resource) {
        super(resource);
    }

    @Override
    public void show() {
        System.out.println("LONG FORM VIEW");
        System.out.println(this.resource.getTitle());
        System.out.println(this.resource.getSnippet());
        System.out.println(this.resource.getImageURL());
        System.out.println("----------\n");
    }
}
