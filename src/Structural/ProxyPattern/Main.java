package Structural.ProxyPattern;

import Structural.ProxyPattern.impl.LazyBookParserProxy;
import Structural.ProxyPattern.impl.RealBookParser;

public class Main {

    public static void main(String[] args) {
        String book = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc facilisis eget nunc quis cursus. Sed at diam sollicitudin, bibendum nibh eget, semper justo. Sed non sollicitudin nibh. In congue imperdiet erat at tristique. Vestibulum egestas justo magna, id efficitur quam pellentesque nec. Duis lacinia pellentesque sagittis. Maecenas viverra diam id erat iaculis, vitae sollicitudin turpis imperdiet. Aliquam scelerisque purus urna, quis finibus nunc auctor faucibus. In hac habitasse platea dictumst.";

        System.out.println("\n--- WITHOUT USING PROXY ---\n");

        RealBookParser bp = new RealBookParser(book);
        System.out.println(bp.getNumberOfPages());

        RealBookParser bp2 = new RealBookParser(book);

        System.out.println("\n--- USING VIRTUAL PROXY ---\n");

        LazyBookParserProxy bp3 = new LazyBookParserProxy(book);
        System.out.println(bp3.getNumberOfPages());

        LazyBookParserProxy bp4 = new LazyBookParserProxy(book);
    }

}
