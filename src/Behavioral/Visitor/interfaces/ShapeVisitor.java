package Behavioral.Visitor.interfaces;

import Behavioral.Visitor.impl.shape.Circle;
import Behavioral.Visitor.impl.shape.Rectangle;

public interface ShapeVisitor {
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
}
