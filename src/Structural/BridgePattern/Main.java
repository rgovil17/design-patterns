package Structural.BridgePattern;

import Structural.BridgePattern.impl.resources.ArtistResource;
import Structural.BridgePattern.impl.resources.BookResource;
import Structural.BridgePattern.impl.views.LongFormView;
import Structural.BridgePattern.impl.views.ShortFormView;

public class Main {
    public static void main(String[] args) {
        // Creating resources
        ArtistResource artistResource = new ArtistResource();
        BookResource bookResource = new BookResource();

        // Creating Long Form Views
        LongFormView longFormViewArtist = new LongFormView(artistResource);
        LongFormView longFormViewBook = new LongFormView(bookResource);

        // Creating Short Form Views
        ShortFormView shortFormViewArtist = new ShortFormView(artistResource);
        ShortFormView shortFormViewBook = new ShortFormView(bookResource);

        longFormViewArtist.show();
        shortFormViewArtist.show();

        longFormViewBook.show();
        shortFormViewBook.show();
    }

}
