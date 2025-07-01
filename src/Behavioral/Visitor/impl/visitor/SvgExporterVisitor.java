package Behavioral.Visitor.impl.visitor;

import Behavioral.Visitor.impl.shape.Circle;
import Behavioral.Visitor.impl.shape.Rectangle;
import Behavioral.Visitor.interfaces.ShapeVisitor;

public class SvgExporterVisitor implements ShapeVisitor {
    @Override
    public void visitCircle(Circle circle) {
        System.out.println("<circle r=\"" + circle.getRadius() + "\" />");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("<rect width=\"" + rectangle.getWidth() +
                "\" height=\"" + rectangle.getHeight() + "\" />");
    }
}
