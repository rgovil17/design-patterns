package Structural.CompositePattern.impl;

import Structural.CompositePattern.interfaces.FileSystemItem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addItem(FileSystemItem item) {
        children.add(item);
    }


    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemItem item : children) {
            total += item.getSize();
        }
        return total;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "+ " + name + "/");
        for (FileSystemItem item: children) {
            item.printStructure(indent + "  ");
        }
    }

    @Override
    public void delete() {
        for (FileSystemItem item: children) {
            item.delete();
        }
        System.out.println("Deleting folder: " + name);
    }
}
