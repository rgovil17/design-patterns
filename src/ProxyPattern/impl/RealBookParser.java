package ProxyPattern.impl;

import ProxyPattern.interfaces.IBookParser;

import java.util.Random;

public class RealBookParser implements IBookParser {
    private String book;
    private int noOfPages;

    public RealBookParser(String book) {
        System.out.println("HEAVY COMPUTATION!!! --- Parsing entire book...");
        this.book = book;
        this.noOfPages = new Random().nextInt(1000,10000);
    }

    @Override
    public int getNumberOfPages() {
        System.out.println("Getting number of pages...");
        return this.noOfPages;
    }
}
