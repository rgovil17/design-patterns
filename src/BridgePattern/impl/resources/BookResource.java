package BridgePattern.impl.resources;

import BridgePattern.interfaces.IResource;

public class BookResource implements IResource {
    @Override
    public String getSnippet() {
        return "This is the book cover text.";
    }

    @Override
    public String getTitle() {
        return "This is the book's title.";
    }

    @Override
    public String getImageURL() {
        return "https://book-hardcover-image.png";
    }
}
