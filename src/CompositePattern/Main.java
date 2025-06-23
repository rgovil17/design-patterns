package CompositePattern;

import CompositePattern.impl.File;
import CompositePattern.impl.Folder;
import CompositePattern.interfaces.FileSystemItem;

public class Main {
    public static void main(String[] args) {
        FileSystemItem file1 = new File("readme.txt", 5);
        FileSystemItem file2 = new File("photo.jpg", 1500);
        FileSystemItem file3 = new File("data.csv", 300);

        Folder documents = new Folder("Documents");
        documents.addItem(file1);
        documents.addItem(file3);

        Folder pictures = new Folder("Pictures");
        pictures.addItem(file2);

        Folder home = new Folder("Home");
        home.addItem(documents);
        home.addItem(pictures);

        System.out.println("------ File Structure ------");
        home.printStructure("");

        System.out.println("\nTotal size: " + home.getSize() + " KB");

        System.out.println("------ Deleting All ------");
        home.delete();
    }
}