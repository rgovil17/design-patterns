package Behavioral.Visitor.impl.visitor;

import Behavioral.Visitor.impl.shape.Circle;
import Behavioral.Visitor.impl.shape.Rectangle;
import Behavioral.Visitor.interfaces.ShapeVisitor;

public class AreaCalculatorVisitor implements ShapeVisitor {
    @Override
    public void visitCircle(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of circle: " + area);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of rectangle: " + area);
    }
}
