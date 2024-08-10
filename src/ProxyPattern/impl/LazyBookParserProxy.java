package ProxyPattern.impl;

import ProxyPattern.interfaces.IBookParser;

public class LazyBookParserProxy implements IBookParser {
    private RealBookParser bp = null;
    private String book = null;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if (this.bp == null) {
            this.bp = new RealBookParser(this.book);
        }
        return this.bp.getNumberOfPages();
    }
}
