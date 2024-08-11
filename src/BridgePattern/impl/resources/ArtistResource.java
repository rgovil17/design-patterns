package BridgePattern.impl.resources;

import BridgePattern.interfaces.IResource;

public class ArtistResource implements IResource {
    @Override
    public String getSnippet() {
        return "This is the artist biography.";
    }

    @Override
    public String getTitle() {
        return "This is the artist's full name";
    }

    @Override
    public String getImageURL() {
        return "https://artist-image.png";
    }
}
